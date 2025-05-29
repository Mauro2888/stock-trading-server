--
-- PostgreSQL database dump
--

-- Dumped from database version 15.13 (Debian 15.13-1.pgdg120+1)
-- Dumped by pg_dump version 16.9 (Ubuntu 16.9-1.pgdg24.04+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE stock_trading;
--
-- Name: stock_trading; Type: DATABASE; Schema: -; Owner: -
--

CREATE DATABASE stock_trading WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.utf8';


\connect stock_trading

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: stock_trading; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA stock_trading;


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: stock; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.stock (
    id uuid NOT NULL,
    name character varying(255) NOT NULL,
    symbol character varying(10) NOT NULL,
    price numeric(10,2) NOT NULL,
    insert_datetime timestamp with time zone NOT NULL,
    update_datetime timestamp with time zone,
    version bigint NOT NULL
);


--
-- Data for Name: stock; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.stock (id, name, symbol, price, insert_datetime, update_datetime, version) FROM stdin;
123e4567-e89b-12d3-a456-426614174000	Apple Inc.	AAPL	150.10	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
223e4567-e89b-12d3-a456-426614174001	Microsoft Corp.	MSFT	250.20	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
323e4567-e89b-12d3-a456-426614174002	Alphabet Inc.	GOOGL	2800.30	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
423e4567-e89b-12d3-a456-426614174003	Amazon.com Inc.	AMZN	3400.40	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
523e4567-e89b-12d3-a456-426614174004	Tesla Inc.	TSLA	700.50	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
623e4567-e89b-12d3-a456-426614174005	Meta Platforms Inc.	META	350.60	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
723e4567-e89b-12d3-a456-426614174006	Netflix Inc.	NFLX	590.70	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
823e4567-e89b-12d3-a456-426614174007	NVIDIA Corp.	NVDA	220.80	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
923e4567-e89b-12d3-a456-426614174008	Advanced Micro Devices Inc.	AMD	110.90	2023-10-01 10:00:00+00	2023-10-01 10:00:00+00	1
\.


--
-- Name: stock stock_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.stock
    ADD CONSTRAINT stock_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

