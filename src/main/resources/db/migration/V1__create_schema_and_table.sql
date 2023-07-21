create schema if not exists jornada_milhas;

create table jornada_milhas.pessoa(
    id_pessoa bigserial primary key,
    cpf varchar(11),
    nome varchar(200),
    email varchar(100),
    foto bytea,
    data_cadastro timestamp,
    data_atualizacao timestamp
);

create table jornada_milhas.depoimento(
    id_depoimento bigserial primary key,
    id_pessoa bigint references jornada_milhas.pessoa(id_pessoa),
    depoimento text,
    data_depoimento timestamp
);