-- database plan
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

-- create database twitter_clone & use it.
create database twitter_clone;
use twitter_clone;

-- create tables users, tweets, & follows.
create table users(
  uid int primary key, 
  ip varchar(64)
);
create table tweets(
  tid int primary key, 
  uid int, 
  post varchar(140), 
  date datetime, 
  key(date), 
  key(uid, date)
);
create table follows(
  uid int, 
  follower int, 
  primary key(uid, follower)
);

-- insert datas to tables.
insert into users(uid, ip) values
(1, '127.0.0.1'),
(2, '127.0.0.2'),
(3, '127.0.0.3');
insert into tweets(tid, uid, post, date) values
(1, 1, 'its morning in here, morning everyone.', now()),
(2, 1, 'tomorrow will be my second interview at apple developer academy.', now());
(3, 2, 'its evening in here, good evening all.', now()),
(4, 3, 'its night in here, good night everyone.', now());
insert into follows(uid, follower) values
(2, 1), (3, 1), (1, 3), (1, 2);

-- accessing data
--
-- GET
-- 1. get tweets that will be seen by a specific user based who has been followed.
select * from tweets inner join follows on tweets.uid=follows.uid where follows.follower = 1;
-- 2.1 get followers id from a user.
select * from follows where follows.uid = 1;
-- 2.2 get followers data from a user.
select * from follows inner join users on users.uid=follows.follower where follows.uid = 1;

-- UPDATE

