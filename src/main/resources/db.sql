SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

/*Create Database DMC*/ 
CREATE DATABASE 'dmc' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin; 
USE 'dmc';


CREATE TABLE 'user' (
  'username' varchar(50) NOT NULL,
  'password' varchar(50) NOT NULL,
  'repassword' varchar(50) NOT NULL,
  'email' varchar(50) NOT NULL,
  'phone' varchar(20) NOT NULL,
  PRIMARY KEY ('username','email','phone')
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE 'comment' (
  'id' int(11) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  'comments' varchar(255) DEFAULT NULL COMMENT '评论内容',
  'type' varchar(50) DEFAULT NULL COMMENT '联系类型',
  'contact' varchar(20) DEFAULT NULL COMMENT '联系方式',
  'reportTime' datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY ('id')
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




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














