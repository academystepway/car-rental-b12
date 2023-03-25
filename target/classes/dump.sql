create table customer(
id int primary key auto_increment,
c_name varchar(100) ,
phone_number varchar(15),
cnic varchar(50),
address varchar(225),
ref_phone_number varchar(15)
);

create table vehicle_owner(
id int primary key auto_increment,
c_name varchar(100) ,
phone_number varchar(15),
cnic varchar(50),
address varchar(225),
commision float
);

create table vehicle(
id int primary key auto_increment,
v_name varchar(225),
model int,
brand varchar(225),
color varchar(50),
owner_id int,
foreign key (owner_id) references vehicle_owner(id)
);

create table booking(
id int primary key auto_increment,
cid int,
vid int,
booking_date date,
price double,
booking_status varchar(50),
foreign key (cid) references customer(id),
foreign key (vid) references vehicle(id)
)

insert into customer(c_name,phone_number,cnic,address,ref_phone_number)
values ('shezy','0213123','1231234123','testing','12312351'),
('taha','02131234','123123412321','testing1','1231235131'),
('adil','02131236','123123412322','testing2','1231235133');

insert into vehicle_owner(c_name,phone_number,cnic,address,commision)
values('sahil','03301231231','123123112233','test123123',10),
('imran','03301231232','123123112254','test',5);

insert into vehicle(v_name,model,brand,color,owner_id)
values('honda insight',2022,'honda','silver',1),
('gli',2021,'toyota','black',2);

insert into booking(cid,vid,booking_date,price,booking_status)
values(1,1,'2023-02-01',2500,'complete'),
(1,2,'2023-02-02',2500,'complete'),
(2,1,'2023-02-25',2500,'active');

