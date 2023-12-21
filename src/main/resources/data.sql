create table person(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key (id)
);

 	insert into person (id,name,location,birth_date) values(10001, 'Arshdeep Singh','Ferzoepur','2023-12-20');
  	insert into person (id,name,location,birth_date) values(10002, 'Manmeet Singh','Ferzoepur','2021-12-20');
   	insert into person (id,name,location,birth_date) values(10003, 'Loverpreet Singh','Ferzoepur','2022-12-20');
  
   	
   	create table employee(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key (id)
);
  
    insert into employee (id,name,location,birth_date) values(10001, 'Arshdeep Singh','Ferzoepur','2023-12-20');
  	insert into employee (id,name,location,birth_date) values(10002, 'Manmeet Singh','Ferzoepur','2021-12-20');
   	insert into employee(id,name,location,birth_date) values(10003, 'Loverpreet Singh','Ferzoepur','2022-12-20');
   
   
   