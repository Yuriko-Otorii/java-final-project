-------add foreign key(driver_id) to orders table-----

ALTER TABLE ORDERS ADD COLUMN driver_id BIGINT;

ALTER TABLE ORDERS ADD CONSTRAINT order_driver_fk FOREIGN KEY (driver_id)
REFERENCES drivers (driver_id) NOT VALID;



----create intermediate table between orders table and driver table----- 

CREATE TABLE IF NOT EXISTS driver_order(
	driver_id BIGINT REFERENCES drivers,
	order_id BIGINT REFERENCES orders
);


---create products info table-------

CREATE SEQUENCE IF NOT EXISTS products_info_seq;


CREATE TABLE IF NOT EXISTS products_info(
    product_id BIGINT NOT NULL DEFAULT nextval('products_info_seq') PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    version VARCHAR(100) NOT NULL,  
);

---create new driver table---
CREATE SEQUENCE IF NOT EXISTS driver_seq;

CREATE TABLE IF NOT EXISTS drivers(
	driver_id BIGINT NOT NULL DEFAULT nextval('driver_seq') PRIMARY KEY,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTS drivers_orders(
	driver_id BIGINT REFERENCES driver,
	order_id BIGINT REFERENCES order
);




---insert data into products_info---
insert into products_info (product_id, name, version) values (1, 'Laptop', '10');
insert into products_info (product_id, name, version) values (2, 'Tablet', '5');
insert into products_info (product_id, name, version) values (3, 'Smart Phone', '13');
insert into products_info (product_id, name, version) values (4, 'Smart Watch', '5');
insert into products_info (product_id, name, version) values (5, 'Smart Assist', '3');



--insert customers
insert into customers (customer_id, name, address, phone_number, description) values (1, 'John Conner', 'Burnaby', '1234567890', 'leave it at front porch');
insert into customers (customer_id, name, address, phone_number, description) values (2, 'Emily Mirror', 'Burnaby', '1122334455', 'leave it around steps');
insert into customers (customer_id, name, address, phone_number, description) values (3, 'Richard White', 'Surrey', '9988776654', 'require careful treatment');
insert into customers (customer_id, name, address, phone_number, description) values (4, 'Kate Ford', 'Coquitlam', '6549287742', 'do not throw it');
insert into customers (customer_id, name, address, phone_number, description) values (5, 'Richard White', 'Burnaby', '832473119', 'thank you driver');


--insert orders
insert into orders (order_id, product, version, quantity) values (1, 'laptop', '10', 1);
insert into orders (order_id, product, version, quantity) values (2, 'smart phone', '5', 3);
insert into orders (order_id, product, version, quantity) values (3, 'tablet', '4', 2);
insert into orders (order_id, product, version, quantity) values (4, 'tablet', '3', 1);
insert into orders (order_id, product, version, quantity) values (5, 'laptop', '7', 4);

--insert drivers
insert into drivers (driver_id, first_name, last_name) values (1, 'Deny', 'Mitchell');
insert into drivers (driver_id, first_name, last_name) values (2, 'Hary', 'Styles');
insert into drivers (driver_id, first_name, last_name) values (3, 'Json', 'Adams');
insert into drivers (driver_id, first_name, last_name) values (4, 'Hanna', 'Bailey');
insert into drivers (driver_id, first_name, last_name) values (5, 'Eric', 'Evans');
