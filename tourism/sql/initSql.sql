drop database  if exists  tourism_db;
create database tourism_db character set utf8 collate utf8_general_ci;

use tourism_db;

drop table if exists scenicspot_price;
create table scenicspot_price (
  id  bigint(10) not null auto_increment primary key comment '记录id',
  price_name varchar(30) not null comment '价格名称，淡季，旺季之类的',
  price DECIMAL(15,2) not null  comment '门票价格',
  scenicspot_id bigint(10) not null comment '关联的景点id',
  status int(2) not null default 1 comment'价格；'
  create_user varchar(30) not null default 'sys' comment '创建人',
  create_time datetime comment '创建时间',
  update_user varchar(30) not null default 'sys' comment '修改人',
  update_time datetime comment '修改时间'

)COMMENT='景点价格表' ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists scenicspot_price;
create table scenicspot_price (
  id  bigint(10) not null auto_increment primary key comment '记录id',
  scenicspot_name varchar(30) not null comment '景点名称',
  create_user varchar(30) not null default 'sys' comment '创建人',
  create_time datetime comment '创建时间',
  update_user varchar(30) not null default 'sys' comment '修改人',
  update_time datetime comment '修改时间'

)COMMENT='景点信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;





drop table if exists scenicspot_bus_price;
create table scenicspot_price (
  id  bigint(10) not null auto_increment primary key comment '记录id',
  scenicspot_id bigint(10) not null comment '关联的景点id',
  price DECIMAL(15,2) not null  comment '车票价格',
  price_effective varchar(30) not null default 'ALL' comment'价格有效期，默认全年',
  create_user varchar(30) not null default 'sys' comment '创建人',
  create_time datetime comment '创建时间',
  update_user varchar(30) not null default 'sys' comment '修改人',
  update_time datetime comment '修改时间'

)COMMENT='景点班车价格表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

