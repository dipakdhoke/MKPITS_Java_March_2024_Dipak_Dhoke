create table SD
(
RollNo char(4) not null,
name char(10),
address varchar(25),
city char (10) default 'Nagpur',
constraint pk_rn primary key(RollNo),
constraint uq_rn unique(name)
)
drop table sd
desc SD
select * from sd

insert into SD(RollNo,name,address,city) values('1001','Dipak','Borkhedi','Nagpur')
insert into SD(RollNo,name,address,city) values('1002','Rajesh','beltarodi','wardha')
insert into SD(RollNo,name,address) values('1003','shankar','ramnagar')


create table MD
(
RollNo char(4),
Phy int check (Phy between 0 and 100),
Chem int check (Chem between 0 and 100),
Maths int check (Maths between 0 and 100),
constraint fk_rn foreign key(RollNo) reference SD(RollNo)
)
select * from SD
