create table brinquedos (
    id bigint not null auto_increment,
    nome varchar(50) not null,
    preco decimal(6, 2) not null,
    descricao varchar(300) not null,
    modelo varchar(50) not null,
    marca varchar(50) not null,
    categoria varchar(50) not null,
    cor varchar(50) not null,
    faixa_etaria varchar(50) not null,

    primary key(id)
);