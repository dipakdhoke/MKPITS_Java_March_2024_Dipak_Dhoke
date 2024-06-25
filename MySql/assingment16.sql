#1

DELIMITER //

CREATE TRIGGER after_rental_insert
AFTER INSERT ON rental
FOR EACH ROW
BEGIN
    DECLARE current_quantity INT;
    DECLARE threshold INT DEFAULT 5;

    -- Update the inventory count for the rented film
    UPDATE inventory
    SET quantity = quantity - 1
    WHERE inventory_id = NEW.inventory_id;

    -- Get the current quantity of the rented film
    SELECT quantity INTO current_quantity
    FROM inventory
    WHERE inventory_id = NEW.inventory_id;

    -- Check if the current quantity is below the threshold
    IF current_quantity < threshold THEN
        -- Insert a row into the low_stock_alerts table
        INSERT INTO low_stock_alerts (film_id, inventory_count, alert_message)
        VALUES (
            (SELECT film_id FROM inventory WHERE inventory_id = NEW.inventory_id),
            current_quantity,
            CONCAT('Low stock alert: Film ID ', (SELECT film_id FROM inventory WHERE inventory_id = NEW.inventory_id), ' has only ', current_quantity, ' copies left.')
        );
    END IF;
END //

DELIMITER ;

#2
DELIMITER //

CREATE TRIGGER before_customer_delete
BEFORE DELETE ON customer
FOR EACH ROW
BEGIN
    DECLARE active_rentals INT;

    -- Check if the customer has any active rentals
    SELECT COUNT(*)
    INTO active_rentals
    FROM rental
    WHERE customer_id = OLD.customer_id AND return_date IS NULL;

    -- If active rentals exist, raise an error and prevent deletion
    IF active_rentals > 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Cannot delete customer with active rentals';
    END IF;
END //

DELIMITER ;

#3

DELIMITER //

CREATE TRIGGER before_film_update
BEFORE UPDATE ON film
FOR EACH ROW
BEGIN
    SET NEW.last_update = CURRENT_TIMESTAMP;
END //

DELIMITER ;

#4
DELIMITER //

CREATE TRIGGER after_film_delete
AFTER DELETE ON film
FOR EACH ROW
BEGIN
    INSERT INTO deleted_films_log (film_id, title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost, rating)
    VALUES (OLD.film_id, OLD.title, OLD.description, OLD.release_year, OLD.language_id, OLD.rental_duration, OLD.rental_rate, OLD.length, OLD.replacement_cost, OLD.rating);
END //

DELIMITER ;
#5
DELIMITER //

CREATE TRIGGER before_rental_update
BEFORE UPDATE ON rental
FOR EACH ROW
BEGIN
    IF NEW.return_date <= NEW.rental_date THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Return date must be after rental date';
    END IF;
END //

DELIMITER ;
