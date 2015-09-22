SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';

/*Create Table User*/
CREATE TABLE 'user' (
  'username' varchar(50) NOT NULL COMMENT '用户名',
  'password' varchar(50) NOT NULL COMMENT '密码',
  'email' varchar(50) NOT NULL COMMENT '邮箱',
  'phone' varchar(20) NOT NULL COMMENT '联系电话',
  'registerDate' datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY ('username','email','phone')
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Create Table Comment*/
CREATE TABLE 'comment' (
  'id' int(11) NOT NULL AUTO_INCREMENT,
  'comments' varchar(255) NOT NULL,
  'type' varchar(45) DEFAULT NULL,
  'contact' varchar(45) DEFAULT NULL,
  'reportTime' datetime DEFAULT NULL,
  PRIMARY KEY ('id','comments')
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Create Table App*/
CREATE TABLE 'app' (
  '商家名称' varchar(255) DEFAULT NULL,
  '日期' varchar(255) DEFAULT NULL,
  '来源' varchar(255) DEFAULT NULL,
  '来源明细' varchar(255) DEFAULT NULL,
  '访客数' varchar(255) DEFAULT NULL,
  '访客数变化' varchar(255) DEFAULT NULL,
  '下单买家数' varchar(255) DEFAULT NULL,
  '下单买家数变化' varchar(255) DEFAULT NULL,
  '下单金额' varchar(255) DEFAULT NULL,
  '下单金额变化' varchar(255) DEFAULT NULL,
  '下单转化率' varchar(255) DEFAULT NULL,
  '下单转化率变化' varchar(255) DEFAULT NULL,
  '支付买家数' varchar(255) DEFAULT NULL,
  '支付买家数变化' varchar(255) DEFAULT NULL,
  '支付金额' varchar(255) DEFAULT NULL,
  '支付金额变化' varchar(255) DEFAULT NULL,
  '支付转化率' varchar(255) DEFAULT NULL,
  '支付转化率变化' varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Create Table Flow*/
CREATE TABLE 'flow' (
  '商家名称' varchar(255) DEFAULT NULL,
  '日期' varchar(255) DEFAULT NULL,
  '来源' varchar(255) DEFAULT NULL,
  '来源明细' varchar(255) DEFAULT NULL,
  '访客数' varchar(255) DEFAULT NULL,
  '访客数变化' varchar(255) DEFAULT NULL,
  '下单买家数' varchar(255) DEFAULT NULL,
  '下单买家数变化' varchar(255) DEFAULT NULL,
  '下单金额' varchar(255) DEFAULT NULL,
  '下单金额变化' varchar(255) DEFAULT NULL,
  '下单转化率' varchar(255) DEFAULT NULL,
  '下单转化率变化' varchar(255) DEFAULT NULL,
  '支付买家数' varchar(255) DEFAULT NULL,
  '支付买家数变化' varchar(255) DEFAULT NULL,
  '支付金额' varchar(255) DEFAULT NULL,
  '支付金额变化' varchar(255) DEFAULT NULL,
  '支付转化率' varchar(255) DEFAULT NULL,
  '支付转化率变化' varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Create Table PC*/
CREATE TABLE 'pc' (
  '商家名称' varchar(255) DEFAULT NULL,
  '日期' varchar(255) DEFAULT NULL,
  '来源' varchar(255) DEFAULT NULL,
  '来源明细' varchar(255) DEFAULT NULL,
  '访客数' varchar(255) DEFAULT NULL,
  '访客数变化' varchar(255) DEFAULT NULL,
  '新访客数' varchar(255) DEFAULT NULL,
  '新访客数变化' varchar(255) DEFAULT NULL,
  '浏览量' varchar(255) DEFAULT NULL,
  '浏览量变化' varchar(255) DEFAULT NULL,
  '人均浏览量' varchar(255) DEFAULT NULL,
  '人均浏览量变化' varchar(255) DEFAULT NULL,
  '收藏人数' varchar(255) DEFAULT NULL,
  '收藏人数变化' varchar(255) DEFAULT NULL,
  '加入购物车人数' varchar(255) DEFAULT NULL,
  '加入购物车人数变化' varchar(255) DEFAULT NULL,
  '跳失率' varchar(255) DEFAULT NULL,
  '跳失率变化' varchar(255) DEFAULT NULL,
  '下单金额' varchar(255) DEFAULT NULL,
  '下单金额变化' varchar(255) DEFAULT NULL,
  '下单买家数' varchar(255) DEFAULT NULL,
  '下单买家数变化' varchar(255) DEFAULT NULL,
  '下单转化率' varchar(255) DEFAULT NULL,
  '下单转化率变化' varchar(255) DEFAULT NULL,
  '支付金额' varchar(255) DEFAULT NULL,
  '支付金额变化' varchar(255) DEFAULT NULL,
  '支付买家数' varchar(255) DEFAULT NULL,
  '支付买家数变化' varchar(255) DEFAULT NULL,
  '支付转化率' varchar(255) DEFAULT NULL,
  '支付转化率变化' varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Create Table mapping*/
CREATE TABLE 'mapping' (
  'KEY' varchar(255) NOT NULL,
  'VALUE' varchar(255) DEFAULT NULL,
  PRIMARY KEY ('KEY')
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

