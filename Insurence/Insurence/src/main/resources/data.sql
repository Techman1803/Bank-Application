 DROP TABLE IF EXISTS `Insurance`;
 
 CREATE TABLE `Insurance` (
 `insurance_id` int AUTO_INCREMENT PRIMARY KEY,
 `customer_id` int NOT NULL,
 `policy_no` BIGINT NOT NULL,
 `insurance_type` VARCHAR(100) NOT NULL,
 `end_date` DATE DEFAULT NULL
 );
 
 INSERT INTO `Insurance` (`customer_id`,`policy_no`,`insurance_type`,`end_date`)
 VALUES(1,47653,'Health Insurance',CURDATE());
 
 INSERT INTO `Insurance` (`customer_id`,`policy_no`,`insurance_type`,`end_date`)
 VALUES(1,54321,'Life Insurance',CURDATE());
 
 INSERT INTO `Insurance` (`customer_id`,`policy_no`,`insurance_type`,`end_date`)
 VALUES(2,98764,'Vehicle Insurance',CURDATE());
 
 INSERT INTO `Insurance` (`customer_id`,`policy_no`,`insurance_type`,`end_date`)
 VALUES(2,78654,'Life Insurance',CURDATE());
 
 