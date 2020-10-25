SHOW DATABASES;
CREATE database test;
Drop database test;
CREATE DATABASE TEST1;
CREATE DATABASE IF NOT EXISTS TEST1;
CREATE OR REPLACE DATABASE TEST1;

USE TEST;

CREATE TABLE DDL  
(  
     id int,  
     DDL_Type varchar(50),  
     DDL_Value int  
);

ALTER TABLE DDL  
ADD COLUMN DDL_Example varchar(50);  


ALTER TABLE DDL
MODIFY COLUMN DDL_Example BIGINT;  
ALTER TABLE DDL
MODIFY  DDL_Value BIGINT; 

DESC DDL;
DESCRIBE DDL; 

DROP TABLE DDL;  

INSERT INTO DDL (id, DDL_Type, DDL_Value) VALUES  (2, 'DML', 123);
INSERT INTO DDL  VALUES  (5, 'DML', 123);
-- WILL NOT WORK 
INSERT INTO DDL  VALUES  (5,'DML');
INSERT INTO DDL   (id, DDL_Type)  VALUES  (50,'DML');
INSERT INTO DDL   (DDL_Type, id )  VALUES  ('DML', 50);
INSERT INTO DDL (id, DDL_Type, DDL_Value) VALUES  
(4, 'DML', 123),  
(3, 'DCL', 123);  

SELECT * FROM DDL;

UPDATE ddl  
SET DDL_Value = 555 WHERE DDL_Type = 'DML';  

CREATE  TABLE IF NOT EXISTS `test`.`Members` (
  `membership_number` INT  AUTO_INCREMENT ,
  `full_names` VARCHAR(150) NOT NULL ,
  `gender` VARCHAR(6) ,
  `date_of_birth` DATE ,
  `physical_address` VARCHAR(255) ,
  `postal_address` VARCHAR(255) ,
  `contact_number` VARCHAR(75) ,
  `email` VARCHAR(255) ,
  PRIMARY KEY (`membership_number`) );


CREATE  TABLE Members1 (
  membership_number INT  AUTO_INCREMENT ,
  full_names VARCHAR(150) NOT NULL ,
  gender VARCHAR(6) ,
  date_of_birth DATE ,
  physical_address VARCHAR(255) ,
  postal_address VARCHAR(255) ,
  contact_number VARCHAR(75) ,
  email VARCHAR(255) ,
  PRIMARY KEY (membership_number) );

  CREATE  TABLE Members2 (
  membership_number INT  AUTO_INCREMENT  PRIMARY KEY,
  full_names VARCHAR(150) NOT NULL ,
  gender VARCHAR(6) ,
  date_of_birth DATE ,
  physical_address VARCHAR(255) ,
  postal_address VARCHAR(255) ,
  contact_number VARCHAR(75) ,
  email VARCHAR(255) )


  
  CREATE  TABLE Members (
  membership_number INT  AUTO_INCREMENT  PRIMARY KEY,
  full_names VARCHAR(150) NOT NULL);