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