--liquibase formatted sql

--changeset github-action:002-users
--comment: Auto-converted 002-users
create schema if not exists users;

create table if not exists users
(
    id              UUID                     NOT NULL PRIMARY KEY,
    name            varchar(255)             NOT NULL
);

INSERT INTO users (id, name)
VALUES (gen_random_uuid(),'test'),
        (gen_random_uuid(),'prova')
