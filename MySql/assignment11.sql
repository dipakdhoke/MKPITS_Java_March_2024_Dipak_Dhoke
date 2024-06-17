create database sudent1Db
use sudent1Db
-- Creating the Customer table
CREATE TABLE Customer (
    Customer_Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Address VARCHAR(255),
    City VARCHAR(100)
);

-- Inserting data into the Customer table
INSERT INTO Customer (Customer_Id, Name, Address, City) VALUES
(1, 'John Doe', '123 Elm Street', 'New York'),
(2, 'Jane Smith', '456 Oak Street', 'Los Angeles'),
(3, 'Michael Johnson', '789 Pine Street', 'Chicago');

-- Creating the Supplier table
CREATE TABLE Supplier (
    Supplier_Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Address VARCHAR(255),
    City VARCHAR(100)
);

-- Inserting data into the Supplier table
INSERT INTO Supplier (Supplier_Id, Name, Address, City) VALUES
(1, 'ABC Supplies', '123 Main Street', 'Los Angeles'),
(2, 'XYZ Traders', '456 Market Street', 'San Francisco'),
(3, 'LA Wholesale', '456 Sunset Blvd', 'Los Angeles');

-- Creating the ProductMaster table
CREATE TABLE ProductMaster (
    Product_Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Price DECIMAL(10, 2),
    QOH INT
);

-- Inserting data into the ProductMaster table
INSERT INTO ProductMaster (Product_Id, Name, Price, QOH) VALUES
(4,'P005',40.00,150);
(1, 'Product A', 10.00, 100),
(2, 'Product B', 20.00, 200),
(3, 'Product C', 30.00, 150);


-- Creating the Sale table
CREATE TABLE Sale (
    Sale_Id INT PRIMARY KEY,
    Product_Id INT,
    Customer_Id INT,
    Quantity INT,
    Date DATE,
    FOREIGN KEY (Product_Id) REFERENCES ProductMaster(Product_Id),
    FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id)
);

-- Inserting data into the Sale table
INSERT INTO Sale (Sale_Id, Product_Id, Customer_Id, Quantity, Date) VALUES
(1, 1, 1, 10, '2023-01-01'),
(2, 2, 2, 5, '2023-01-02'),
(3, 3, 3, 2, '2023-01-03');

-- Creating the Purchase table
CREATE TABLE Purchase (
    Purchase_Id INT PRIMARY KEY,
    Product_Id INT,
    Supplier_Id INT,
    Quantity INT,
    Date DATE,
    FOREIGN KEY (Product_Id) REFERENCES ProductMaster(Product_Id),
    FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id)
);

-- Inserting data into the Purchase table
INSERT INTO Purchase (Purchase_Id, Product_Id, Supplier_Id, Quantity, Date) VALUES
(1, 1, 1, 50, '2023-01-04'),
(2, 2, 2, 30, '2023-01-05'),
(3, 3, 3, 20, '2023-01-06');

#1 
select name ,address from supplier where city='Los Angeles'
#2
select sum(Quantity) as total_quantity_sold from sale
#3
select count(purchase_id) as purchase_of_product from purchase where purchase_id='P001'
#4
select pm.Name from productMaster pm
join Sale s on pm.Product_id=s.Product_id
group by pm.Name
having sum(s.Quantity) > 100;

#5
select name,product_id ,product_id from productmaster where (select  max(price) from productmaster)
#6
select name ,avg(price) from productmaster
group by product_id
#7 
select product_id from productmaster where product_id not in (SELECT DISTINCT Product_id FROM Sale) 


#8
SELECT COUNT(*) AS Total_Sales
FROM Sale
WHERE Date >= '2024-06-01' AND Date < '2024-07-01';
 #9
 select qoh from productmaster where product_id=4

#10
select sum(p.quantity)as purchase_quantity,pm.name from purchase p
join productmaster pm on p.product_id=pm.product_id
group by name 
having sum(p.quantity)>200

- Example assuming the default naming
-- ALTER TABLE Sale DROP FOREIGN KEY Sale_ibfk_1;
-- ALTER TABLE Sale DROP FOREIGN KEY Sale_ibfk_2;

-- ALTER TABLE Purchase DROP FOREIGN KEY Purchase_ibfk_1;
-- ALTER TABLE Purchase DROP FOREIGN KEY Purchase_ibfk_2;
-- alter table productmaster drop primary key
-- desc productmaster
-- alter table productmaster add constraint primary key (product_id)  








