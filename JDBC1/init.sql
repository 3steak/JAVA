DROP table student if exists;

CREATE TABLE student (
	id int primary key,
	firstName VARCHAR(50),
	lastName VARCHAR(50),
	age int,
	email VARCHAR(50),
	average int
);

Insert into student Values (1,'Dupond','Maurice', 23, 'maurice.dupond@gmail.com',0),
(2,'Durando','Marcel', 18, 'marcel.durando@wanadoo.fr',0),
(3,'Tota','Toto', 20, 'toto06@gmail.com',0);