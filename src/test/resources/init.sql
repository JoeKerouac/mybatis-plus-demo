create table user
(
    `id`   bigint       not null,
    `name` varchar(100) not null,
    primary key (`id`)

) engine = innodb
  default charset = utf8mb4;

insert into user(id, name) values (1, "1"), (2, "2");
