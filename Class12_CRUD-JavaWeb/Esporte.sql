CREATE DATABASE Esporte;
USE Esporte;

CREATE TABLE Time(
	codigo int(10) NOT NULL primary key,
	nome varchar(50) NOT NULL,
	cidade varchar(80) NOT NULL
);

CREATE TABLE Jogador(
	id int(10) NOT NULL primary key,
	nome varchar(100) NOT NULL,
	data_nasc date NOT NULL,
	altura decimal (4,2) NOT NULL,
	peso decimal (4,1) NOT NULL,
	time_codigo int(10), FOREIGN KEY (time_codigo) REFERENCES Time (codigo)
);