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