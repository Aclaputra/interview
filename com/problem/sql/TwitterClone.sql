-- plan
--
-- USERS
--  uid
--  ip
--
-- TWEETS
--  tid
--  uid
--  post
--  date
--
-- FOLLOWS
--  uid
--  follower
create database twitter_clone;

use twitter_clone;

create table users(
  uid int primary key, 
  ip varchar(64)
);
create table tweets(
  tid int primary key, 
  uid int, post varchar(140), 
  date datetime, 
  key(date), 
  key(uid, date)
);
create table follows(
  uid int, 
  follower int, 
  primary key(uid, follower)
);

insert into users(uid, ip) values(1, '127.0.0.1');
insert into tweets(tid, uid, post, date) 
values(1, 1, 'its morning in here, morning everyone', NOW());
insert into follows(uid, follower) values(1, 2); 


