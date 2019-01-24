drop database  if exists  tourism_db;
create database tourism_db character set utf8 collate utf8_general_ci;

use tourism_db;

drop table if exists scenicspot_price;
create table scenicspot_price (
  id  bigint(10) not null auto_increment primary key comment '记录id',
  scenicspot_name varchar(30) not null comment '景点名称',
  price DECIMAL(15,2) not null  comment '景点价格',
  create_user varchar(30) not null default 'sys' comment '创建人',
  create_time datetime comment '创建时间',
  update_user varchar(30) not null default 'sys' comment '修改人',
  update_time datetime comment '修改时间'

)ENGINE=InnoDB DEFAULT CHARSET=utf8;
