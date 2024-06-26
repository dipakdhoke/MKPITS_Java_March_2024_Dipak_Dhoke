DELIMITER //

-- Problem Statement 1: Retrieve Customer Names and Addresses
CREATE PROCEDURE get_customer_names_addresses()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cust_name VARCHAR(255);
    DECLARE cust_address VARCHAR(255);
    DECLARE cur CURSOR FOR
        SELECT CONCAT(first_name, ' ', last_name) AS full_name, address
        FROM customer
        JOIN address ON customer.address_id = address.address_id;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO cust_name, cust_address;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SELECT cust_name AS customer_name, cust_address AS customer_address;
    END LOOP;

    CLOSE cur;
END //
DELIMITER ;
CALL get_customer_names_addresses();


DELIMITER //

-- Problem Statement 2: Calculate Total Rental Fees for a Customer
CREATE PROCEDURE get_total_rental_fees(IN customerId INT)
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE total_fee DECIMAL(10,2) DEFAULT 0;
    DECLARE rental_fee DECIMAL(10,2);
    DECLARE cur CURSOR FOR
        SELECT amount
        FROM payment
        WHERE customer_id = customerId;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO rental_fee;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SET total_fee = total_fee + rental_fee;
    END LOOP;

    CLOSE cur;

    SELECT customerId AS customer_id, total_fee AS total_rental_fees;
END //
DELIMITER ;
CALL get_total_rental_fees(1);


DELIMITER //

-- Problem Statement 3: Find Overdue Rentals
CREATE PROCEDURE find_overdue_rentals()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE rental_id INT;
    DECLARE rental_date DATE;
    DECLARE return_date DATE;
    DECLARE due_date DATE;
    DECLARE cur CURSOR FOR
        SELECT rental_id, rental_date, return_date, ADDDATE(rental_date, INTERVAL rental_duration DAY) AS due_date
        FROM rental
        JOIN inventory ON rental.inventory_id = inventory.inventory_id
        JOIN film ON inventory.film_id = film.film_id
        WHERE return_date IS NULL OR return_date > ADDDATE(rental_date, INTERVAL rental_duration DAY);
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO rental_id, rental_date, return_date, due_date;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SELECT rental_id, rental_date, return_date, due_date;
    END LOOP;

    CLOSE cur;
END //
DELIMITER ;

CALL find_overdue_rentals();


DELIMITER //
-- Problem Statement 4: Retrieve Film Information by Category
CREATE PROCEDURE get_film_info_by_category(IN categoryName VARCHAR(50))
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE film_title VARCHAR(255);
    DECLARE description TEXT;
    DECLARE release_year YEAR;
    DECLARE rating VARCHAR(10);
    DECLARE cur CURSOR FOR
        SELECT title, description, release_year, rating
        FROM film
        JOIN film_category ON film.film_id = film_category.film_id
        JOIN category ON film_category.category_id = category.category_id
        WHERE category.name = categoryName;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO film_title, description, release_year, rating;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SELECT film_title, description, release_year, rating;
    END LOOP;

    CLOSE cur;
END //
DELIMITER ;
CALL get_film_info_by_category('Action');


DELIMITER //
-- Problem Statement 5: Calculate Average Film Rental Duration
CREATE PROCEDURE calculate_avg_rental_duration()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE rental_duration INT;
    DECLARE total_duration INT DEFAULT 0;
    DECLARE rental_count INT DEFAULT 0;
    DECLARE avg_duration DECIMAL(10,2);
    DECLARE cur CURSOR FOR
        SELECT DATEDIFF(return_date, rental_date)
        FROM rental
        WHERE return_date IS NOT NULL;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;
    read_loop: LOOP
        FETCH cur INTO rental_duration;
        IF done THEN
            LEAVE read_loop;
        END IF;
        SET total_duration = total_duration + rental_duration;
        SET rental_count = rental_count + 1;
    END LOOP;

    CLOSE cur;

    SET avg_duration = total_duration / rental_count;

    SELECT avg_duration AS average_rental_duration;
END //

DELIMITER ;
CALL calculate_avg_rental_duration();

