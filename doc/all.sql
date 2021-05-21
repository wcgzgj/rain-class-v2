# 学生表
drop table if exists `stu`;
create table `stu` (
                         `id` bigint not null comment 'id',
                         `loginname` varchar(50) comment '登录名',
                         `realname` varchar(50) comment '真实姓名',
                         `password` varchar(255) comment '密码',
                         primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='学生表';


# 老师表
drop table if exists `sta`;
create table `sta` (
                       `id` bigint not null comment 'id',
                       `loginname` varchar(50) comment '登录名',
                       `realname` varchar(50) comment '真实姓名',
                       `password` varchar(255) comment '密码',
                       primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='老师表';


# 学生老师表
drop table if exists `stusta`;
create table `stusta` (
                       `id` bigint not null comment 'id',
                       `stuid` bigint comment 'stuid',
                       `staid` bigint comment 'staid',
                       primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='学生老师表';


# 权限表
drop table if exists `quality`;
create table `quality` (
                       `id` bigint not null comment 'id',
                       `role` varchar(50) comment '角色名称',
                       `menu` varchar(255) comment '菜单名称',
                       `url` varchar(255) comment '权限url',
                       `parentid` bigint comment '父类菜单id',
                       primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='权限表';



# 课程表
drop table if exists `class`;
create table `class` (
                           `id` bigint not null comment 'id',
                           `staid` bigint comment '教师id',
                           `name` varchar(50) comment '课程名称',
                           `time` varchar(255)  comment '开课时间',
                           `desc` varchar(255) comment '课程介绍',
                           primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='权限表';



# 成绩表
drop table if exists `score`;
create table `score` (
                         `id` bigint not null comment 'id',
                         `stuid` bigint comment '学生id',
                         `staid` bigint comment '教师id',
                         `score` float comment '成绩',
                         `desc` varchar(255) comment '成绩介绍',
                         primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='成绩表';
