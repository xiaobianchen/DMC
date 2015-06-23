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
) ENGINE=MyISAM;

/*Create Table Comment*/
CREATE TABLE `comment` (
  `comments` varchar(255) NOT NULL,
  `contact` varchar(50) NOT NULL
) ENGINE=MyISAM;