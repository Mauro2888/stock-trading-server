CREATE TABLE public.stock (
    id uuid NOT NULL,
    name character varying(255) NOT NULL,
    symbol character varying(10) NOT NULL,
    price numeric(10,2) NOT NULL,
    insert_datetime timestamp with time zone NOT NULL,
    update_datetime timestamp with time zone,
    version bigint NOT NULL
);
CREATE TABLE public.users (
    id uuid NOT NULL,
    name character varying(255) NOT NULL
);

-- DATA
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('123e4567-e89b-12d3-a456-426614174000', 'Apple Inc.', 'AAPL', 150.10, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('223e4567-e89b-12d3-a456-426614174001', 'Microsoft Corp.', 'MSFT', 250.20, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('323e4567-e89b-12d3-a456-426614174002', 'Alphabet Inc.', 'GOOGL', 2800.30, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('423e4567-e89b-12d3-a456-426614174003', 'Amazon.com Inc.', 'AMZN', 3400.40, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('523e4567-e89b-12d3-a456-426614174004', 'Tesla Inc.', 'TSLA', 700.50, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('623e4567-e89b-12d3-a456-426614174005', 'Meta Platforms Inc.', 'META', 350.60, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('723e4567-e89b-12d3-a456-426614174006', 'Netflix Inc.', 'NFLX', 590.70, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('823e4567-e89b-12d3-a456-426614174007', 'NVIDIA Corp.', 'NVDA', 220.80, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) VALUES ('923e4567-e89b-12d3-a456-426614174008', 'Advanced Micro Devices Inc.', 'AMD', 110.90, '2023-10-01 10:00:00+00', '2023-10-01 10:00:00+00', 1);
INSERT INTO public.users (id, name) VALUES ('c1969da6-d983-4430-a4ef-bae203a7ab9a', 'test');
INSERT INTO public.users (id, name) VALUES ('6caf8b52-8f28-4b17-921c-0a2faa1a052b', 'prova');
