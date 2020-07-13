
/* Drop Triggers */

DROP TRIGGER TRI_NEW_TABLE_num;



/* Drop Tables */

DROP TABLE mamber_02 CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_NEW_TABLE_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_NEW_TABLE_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE mamber_02
(
	num number(10,0) NOT NULL,
	name varchar2(20) NOT NULL,
	id varchar2(20) NOT NULL UNIQUE,
	pwd varchar2(20) NOT NULL,
	joindate date NOT NULL,
	etc varchar2(2000),
	PRIMARY KEY (num)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_NEW_TABLE_num BEFORE INSERT ON NEW_TABLE
FOR EACH ROW
BEGIN
	SELECT SEQ_NEW_TABLE_num.nextval
	INTO :new.num
	FROM dual;
END;

/




