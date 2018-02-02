/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - hdw
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hdw` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hdw`;

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `id` int(4) unsigned NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_ID` int(4) NOT NULL,
  `FIRST_NAME` varchar(20) NOT NULL,
  `LAST_NAME` varchar(20) NOT NULL,
  `EMAIL` varchar(20) NOT NULL,
  `SALARY` decimal(16,0) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `NewIndex1` (`LAST_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `employees` */

insert  into `employees`(`id`,`EMPLOYEE_ID`,`FIRST_NAME`,`LAST_NAME`,`EMAIL`,`SALARY`) values (1,1000,'李','逍遥','1000@jd.com','9000'),(2,1001,'赵','灵儿','1001@jd.com','12000'),(3,1002,'林','月如','1002@jd.com','8000'),(4,1003,' ','阿奴','1003@jd.com','5000'),(5,1004,' ','酒剑仙','1004@jd.com','20000');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
