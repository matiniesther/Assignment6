# To run it:
# mysql -u root -p < staff.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS staff_db;
CREATE DATABASE staff_db;
USE staff_db;
CREATE TABLE objects(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	val TEXT
);
INSERT INTO objects (name, val) VALUES ("schedule", "INVALIDVAL");


