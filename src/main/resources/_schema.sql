CREATE TABLE IF NOT EXISTS customer 
(
 id	INT PRIMARY KEY,
 purchase_date	varchar(300),
 invoice	varchar(300),
 customer_root	varchar(300),
 customer_leaf	varchar(300),
 product_description	varchar(300),
 pack_size	varchar(300),
 unit_type	varchar(300),
 category	varchar(300),
 distributor_root	varchar(300),
 distributor_leaf	varchar(300),
 manufacturer	varchar(300),
 quantity	NUMERIC(20, 2),
 price 	NUMERIC(20, 2),
 total 	NUMERIC(20, 2)
);