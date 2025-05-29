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

ALTER TABLE ONLY public.stock DROP CONSTRAINT stock_pkey;
DROP TABLE public.stock;
DROP SCHEMA stock_trading;
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
-- Name: stock stock_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.stock
    ADD CONSTRAINT stock_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

