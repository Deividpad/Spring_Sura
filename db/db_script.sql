create database employer_db;

create schema employer;

create table employer.employer
(
    id            bigserial
        constraint employer_pk
            primary key,
    nombre        varchar not null,
    dni           bigint  not null,
    cargo         varchar not null,
    fecha_ingreso date    not null
);

alter table employer.employer
    owner to postgres;