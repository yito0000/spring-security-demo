create table users (
  username varchar(50) not null primary key,
  password varchar(500) not null,
  enabled boolean not null
);

create table authorities (
  username varchar(50) not null,
  authority varchar(50) not null,
  constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username, authority);

insert into users(username, password, enabled) values('admin', '$2a$10$l87foFQr56PanByluNun0uQWS18YHlFBMgLnFDq4YBC6nqLOEm9Km', true);
insert into users(username, password, enabled) values('read_only', '$2a$10$l87foFQr56PanByluNun0uQWS18YHlFBMgLnFDq4YBC6nqLOEm9Km', true);

insert into authorities(username, authority) values('admin', 'ADMIN');
insert into authorities(username, authority) values('read_only', 'READ_ONLY');

