create schema if not exists stock_trading;

create table if not exists stock
(
    id              UUID                     NOT NULL PRIMARY KEY,
    name            varchar(255)             NOT NULL,
    symbol          varchar(10)              NOT NULL,
    price           decimal(10, 2)           NOT NULL,
    insert_datetime TIMESTAMP WITH TIME ZONE NOT NULL,
    update_datetime TIMESTAMP WITH TIME ZONE,
    version         BIGINT                   NOT NULL

);

INSERT INTO stock (id, name, symbol, price, insert_datetime, update_datetime, version)
VALUES
    ('123e4567-e89b-12d3-a456-426614174000', 'Apple Inc.', 'AAPL', 150.10, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('223e4567-e89b-12d3-a456-426614174001', 'Microsoft Corp.', 'MSFT', 250.20, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('323e4567-e89b-12d3-a456-426614174002', 'Alphabet Inc.', 'GOOGL', 2800.30, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('423e4567-e89b-12d3-a456-426614174003', 'Amazon.com Inc.', 'AMZN', 3400.40, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('523e4567-e89b-12d3-a456-426614174004', 'Tesla Inc.', 'TSLA', 700.50, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('623e4567-e89b-12d3-a456-426614174005', 'Meta Platforms Inc.', 'META', 350.60, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('723e4567-e89b-12d3-a456-426614174006', 'Netflix Inc.', 'NFLX', 590.70, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('823e4567-e89b-12d3-a456-426614174007', 'NVIDIA Corp.', 'NVDA', 220.80, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1),
    ('923e4567-e89b-12d3-a456-426614174008', 'Advanced Micro Devices Inc.', 'AMD', 110.90, '2023-10-01T10:00:00Z', '2023-10-01T10:00:00Z', 1);
