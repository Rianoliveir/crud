create database petshop;
use petshop;
create table cliente(
nome varchar(50),
animal varchar(50),
servico varchar(50),
id_cliente int primary key auto_increment not null
);
create table animal(
nome varchar(50),
raca varchar(50),
dono varchar(50),
servico varchar(50),
id_animal int primary key auto_increment not null
);
create table servico(
tipo varchar(50),
valor int (30),
id_servico int primary key auto_increment not null
);

select*from petshop