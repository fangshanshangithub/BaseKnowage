drop table if exists table_a;
create table table_a(
                      id bigint(10) auto_increment primary key comment '主键Id',
                      aname varchar(12) not null default '' comment 'aname',
                      aage int(10) not null default 0 comment'aage'

);


drop table if exists table_b;
create table table_b(
                      id bigint(10) auto_increment primary key comment '主键Id',
                      bname varchar(12) not null default '' comment 'aname',
                      bage int(10) not null default 0 comment'aage'

)