#1

-- Create the function
DELIMITER //

CREATE FUNCTION CalculateLateFee(p_rental_id INT) 
RETURNS DECIMAL(10, 2)
DETERMINISTIC
BEGIN
    -- Return the calculated late fee directly without using DECLARE
    RETURN (
        SELECT 
            CASE 
                WHEN r.return_date > DATE_ADD(r.rental_date, INTERVAL f.rental_duration DAY) THEN 
                    DATEDIFF(r.return_date, DATE_ADD(r.rental_date, INTERVAL f.rental_duration DAY)) * 2.00
                ELSE 
                    0 
            END AS LateFee
        FROM rental r
        JOIN inventory i ON r.inventory_id = i.inventory_id
        JOIN film f ON i.film_id = f.film_id
        WHERE r.rental_id = p_rental_id
    );
END //

DELIMITER ;

-- Test the function
SELECT CalculateLateFee(1) AS LateFee;

#2

DELIMITER ;
delimiter $$
create function GetFilmRatingbyTitle( p_film_title varchar(25))
returns varchar(10)
deterministic
begin
return(select rating from
 film
 where title = p_film_title
 limit 1
 );
 end $$
 delimiter ;
 
#3


delimiter $$
create function film_count_by_language(p_language_name varchar(255))
returns int 
deterministic
begin
return( select count(*) from film f join language l on f.language_id=l.language_id
where l.name= p_language_name 
);
end $$
delimiter ;
#4
-- Create the function
DELIMITER //

CREATE FUNCTION IsFilmAvailable(p_film_id INT)
RETURNS BOOLEAN
BEGIN
    DECLARE available_count INT;

    -- Count the number of available inventory items for the given film
    SELECT COUNT(*) INTO available_count
    FROM inventory i
    LEFT JOIN rental r ON i.inventory_id = r.inventory_id AND r.return_date IS NULL
    WHERE i.film_id = p_film_id AND r.rental_id IS NULL;

    -- Return true if there is at least one available item, otherwise return false
    RETURN available_count > 0;
END //

DELIMITER ;

-- Test the function
SELECT IsFilmAvailable(1) AS Available;

#5
-- Create the function
DELIMITER //

CREATE FUNCTION GetCustomerRentalHistory(p_customer_id INT)
RETURNS INT
deterministic
BEGIN
    DECLARE rental_count INT;

    -- Count the number of rentals made by the given customer
    SELECT COUNT(*) INTO rental_count
    FROM rental
    WHERE customer_id = p_customer_id;

    -- Return the rental count
    RETURN rental_count;
END //

DELIMITER ;
drop function GetCustomerRentalHistory 
-- Test the function
SELECT GetCustomerRentalHistory(1) AS TotalRentals;
#7
DELIMITER //

CREATE FUNCTION CalculateTotalOrderValue(p_order_quantity INT, p_unit_price int)
RETURNS int
deterministic
BEGIN
    RETURN p_order_quantity * p_unit_price;
END //

DELIMITER ;

-- Test the function
SELECT CalculateTotalOrderValue(5, 19) AS TotalOrderValue;

#7
-- Create the function
DELIMITER //

CREATE FUNCTION CalculateAge(birthdate DATE)
RETURNS INT
deterministic
BEGIN
    DECLARE currentt_date DATE;
    DECLARE age INT;
    
    -- Get the current date
    SET currentt_date = CURDATE();
    
    -- Calculate age
    SET age = YEAR(current_date) - YEAR(birthdate);
    
    RETURN age;
END //

DELIMITER ;

-- Test the function
SELECT CalculateAge('1990-06-15') AS Age;
#8
-- Create the function
DELIMITER //

CREATE FUNCTION ReverseString(input_string VARCHAR(255))
RETURNS VARCHAR(255)
BEGIN
    DECLARE reversed_string VARCHAR(255) DEFAULT '';
    DECLARE i INT DEFAULT 1;
    DECLARE len INT;
    
    SET len = CHAR_LENGTH(input_string);
    
    WHILE i <= len DO
        SET reversed_string = CONCAT(SUBSTRING(input_string, i, 1), reversed_string);
        SET i = i + 1;
    END WHILE;
    
    RETURN reversed_string;
END //

DELIMITER ;

-- Test the function
SELECT ReverseString('hello') AS ReversedString;

#9
DELIMITER //

CREATE FUNCTION CalculateBMI(weight FLOAT, height FLOAT)
RETURNS FLOAT
deterministic
BEGIN
    RETURN weight / (height * height);
END //

DELIMITER ;

#10
-- Create the sequence table
CREATE TABLE customer_sequence (
    last_seq INT NOT NULL
);

-- Initialize with the first sequence number
INSERT INTO customer_sequence (last_seq) VALUES (0);

-- Create the user-defined function
DELIMITER //

CREATE FUNCTION GenerateCustomerID(first_name VARCHAR(100), last_name VARCHAR(100))
RETURNS VARCHAR(20)
deterministic
BEGIN
    DECLARE unique_id VARCHAR(20);
    DECLARE seq INT;

    -- Increment the sequence number
    UPDATE customer_sequence
    SET last_seq = last_seq + 1;

    -- Get the new sequence number
    SELECT last_seq INTO seq
    FROM customer_sequence;

    -- Generate the unique ID
    SET unique_id = CONCAT(LEFT(first_name, 1), LEFT(last_name, 3), LPAD(seq, 4, '0'));

    RETURN unique_id;
END //

DELIMITER ;

-- Test the function
SELECT GenerateCustomerID('John', 'Doe') AS CustomerID;

