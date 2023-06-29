create database db_javaHangman;
use db_javaInvaders;

create table usuario (idJogador int auto_increment primary key, nickname varchar(50) not null unique, senha varchar(50) not null,
perguntaPessoal varchar(50) not null);

create table pontuacao (idPartida int auto_increment primary key, pontuacaoJogador int not null, idJogador int not null,
foreign key pontuacao(idJogador) references usuario(idJogador));
