create schema if not exists users;

create table if not exists users
(
    id              UUID                     NOT NULL PRIMARY KEY,
    name            varchar(255)             NOT NULL,
    symbol          varchar(10)              NOT NULL,
    price           decimal(10, 2)           NOT NULL,
    insert_datetime TIMESTAMP WITH TIME ZONE NOT NULL,
    update_datetime TIMESTAMP WITH TIME ZONE,
    version         BIGINT                   NOT NULL

);

INSERT INTO users (id, name, symbol, price, insert_datetime, update_datetime, version)
VALUES
    ('123e4567-e89b-12d3-a456-426614174000', 'Apple Inc.', 'AAPL', 150.10, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('223e4567-e89b-12d3-a456-426614174001', 'Microsoft Corp.', 'MSFT', 250.20, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('323e4567-e89b-12d3-a456-426614174002', 'Alphabet Inc.', 'GOOGL', 2800.30, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
