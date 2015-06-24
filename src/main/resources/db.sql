SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';


/*Create Table User*/
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `repassword` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`username`,`email`,`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Create Table Comment*/
CREATE TABLE `comment` (
  `id` int(50) NOT NULL,
  `comments` varchar(255) NOT NULL,
  `type` varchar(50) NOT NULL,
  `contact` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;