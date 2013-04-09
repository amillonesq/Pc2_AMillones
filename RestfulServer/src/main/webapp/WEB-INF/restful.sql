
drop database restful;
create database restful;
use restful;
CREATE TABLE students (idBooster int DEFAULT '0' NOT NULL, birthDate date, firstname varchar(30), lastname varchar(30), telephone varchar(15), email varchar(30), created timestamp DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (idBooster)) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO students (idBooster, birthDate, firstname, lastname, telephone, email, created) VALUES (50001, '1986-01-23', 'Jaime', 'de la cru perez', '3597458', 'delacruz@gmai.com', '2013-04-08 10:46:05');
INSERT INTO students (idBooster, birthDate, firstname, lastname, telephone, email, created) VALUES (50002, '1945-01-23', 'Elena', 'Malpartida quintanilla', '95484684', 'elena_45@hotmail.com', '2013-04-08 10:46:05');
INSERT INTO students (idBooster, birthDate, firstname, lastname, telephone, email, created) VALUES (50003, '1991-01-23', 'Alvaro', 'Millones', '68456971', 'amillones@gmai.com', '2013-04-08 10:46:05');
