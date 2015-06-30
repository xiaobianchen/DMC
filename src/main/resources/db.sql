SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';


/*Create Table User*/
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL COMMENT '�û���',
  `password` varchar(50) NOT NULL COMMENT '����',
  `email` varchar(50) NOT NULL COMMENT '����',
  `phone` varchar(20) NOT NULL COMMENT '��ϵ�绰',
  `registerDate` datetime NOT NULL COMMENT 'ע��ʱ��',
  PRIMARY KEY (`username`,`email`,`phone`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Create Table Comment*/
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '���۱��',
  `comments` varchar(255) DEFAULT NULL COMMENT '��������',
  `type` varchar(50) DEFAULT NULL COMMENT '��ϵ����',
  `contact` varchar(20) DEFAULT NULL COMMENT '��ϵ��ʽ',
  `reportTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;





