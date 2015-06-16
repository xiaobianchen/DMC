SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';


/*Create Table User*/
CREATE TABLE IF NOT EXISTS 'user' ( 
  'username' varchar(50) unsigned NOT NULL AUTO_INCREMENT, 
  'email' varchar(50) COLLATE utf8_bin DEFAULT NULL, 
  'birthday' timestamp NULL DEFAULT NULL, 
  'password' varchar(50) COLLATE utf8_bin DEFAULT NULL,
  'repassword' varchar(50) COLLATE utf8_bin DEFAULT NULL, 
  PRIMARY KEY ('username') 
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;