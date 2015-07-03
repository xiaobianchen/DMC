SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';


/*Create Table User*/
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `phone` varchar(20) NOT NULL COMMENT '联系电话',
  `registerDate` datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`username`,`email`,`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Create Table Comment*/
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `comments` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `type` varchar(50) DEFAULT NULL COMMENT '联系类型',
  `contact` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `fileName` varchar(50) DEFAULT NULL COMMENT '存储图片',
  `fileStream` longblob,
  `reportTime` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;






