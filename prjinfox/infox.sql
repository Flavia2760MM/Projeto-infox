-- Criando o banco de dados
create database dbinfox;

-- mostrando os bancos de dados
show databases;

-- usando o banco criado;
use dbinfox;

--- creando uma tabela
create table tbusuarios(
iduser int primary key,
usuario varchar (50) not null,
fone varchar(15),
login varchar (15) not null unique,
senha varchar (15) not null
);

-- descrição da tabela
describe tbusuarios;

-- inserindo os dados na tabela
insert into tbusuarios (iduser, usuario, fone, login,senha)
values (1, 'Flavia Santos', '1234-5678', 'mmbeatrix', '123456');


-- inserindo os dados na tabela
insert into tbusuarios (iduser, usuario, fone, login,senha)
values (2, 'Administrador', '9999-9999', 'admin', 'admin');
insert into tbusuarios (iduser, usuario, fone, login,senha)
values (3, 'Bill Gates', '9999-9999', 'bill', '123456');

-- a linha abaixo exibe os dados da tabela
select * from tbusuarios;

-- a linha abaixo modifica dados na tabela 
 update tbusuarios set fone ='8888-8888' where iduser=2;

 -- a linha abaixo apaga um registro da tabela
 delete from tbusuarios where iduser=3;
 
 select * from tbusuarios;
 
 use dbinfox;
 
-- criando a tabela clientes
create table tbclientes (
idcli int primary key auto_increment,
nomecli varchar (50) not null,
endcli varchar (100),
fonecli varchar (50) not null,
emailcli varchar (50)
);

describe tbclientes;

insert into tbclientes (nomecli, endcli, fonecli, emailcli)
values ('Linus Torvalds', 'Rua tux, 2015', '9999-9999', 'linux@linux.com');

select * from tbclientes;
use dbinfox;

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar (150) not null,
defeito varchar (150) not null,
servico varchar (150),
tecnico varchar (30),
valor decimal (10,2),
idcli int not null,
foreign key (idcli) references tbclientes(idcli)
);

desc tbos;

insert into tbos(equipamento, defeito, servico, tecnico, valor,idcli)
values( 'Notebook','Não liga','Troca da fonte','Ze',87.50,1
);

select * from tbos;

-- o codigo abaixo tras informações de duas tabelas devido ao relacionamento
select
O.os, equipamento, defeito, servico, valor,
C.nomecli,fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);





 
 
 
 
 

