
/* Drop Tables */

DROP TABLE member_tbl_02 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE member_tbl_02
(
	custno number(6) NOT NULL,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindata date,
	grade char(1),
	city char(2),
	PRIMARY KEY (custno)
);



