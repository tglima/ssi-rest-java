CREATE DATABASE dbssi  WITH OWNER = postgres ENCODING = 'UTF8' CONNECTION LIMIT = -1;
COMMENT ON DATABASE dbssi IS 'Database used from project Serviços Sul da Ilha.';

\c dbssi

CREATE SEQUENCE ad_id_seq;
ALTER SEQUENCE ad_id_seq OWNER TO postgres;

CREATE SEQUENCE category_id_seq;
ALTER SEQUENCE category_id_seq OWNER TO postgres;

CREATE SEQUENCE message_id_seq;
ALTER SEQUENCE message_id_seq OWNER TO postgres;

CREATE SEQUENCE ad_images_id_seq;
ALTER SEQUENCE ad_images_id_seq OWNER TO postgres;

CREATE TABLE public.category
(
    id integer NOT NULL DEFAULT nextval('category_id_seq'::regclass),
    title character varying(40) COLLATE pg_catalog."default",
    description character varying(60) COLLATE pg_catalog."default",
    url character varying(60) COLLATE pg_catalog."default",
    CONSTRAINT categoria_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.category OWNER to postgres;


CREATE TABLE public.ad
(
    id integer NOT NULL DEFAULT nextval('ad_id_seq'::regclass),
    title character varying(60) COLLATE pg_catalog."default",
    id_category integer NOT NULL,
    description character varying(255) COLLATE pg_catalog."default",
    phone character varying(16) COLLATE pg_catalog."default",
    is_whatsapp boolean NOT NULL,
    is_promoted boolean NOT NULL,
    is_checked boolean NOT NULL,
    CONSTRAINT ad_pkey PRIMARY KEY (id),
    CONSTRAINT category_fk FOREIGN KEY (id_category)
        REFERENCES public.category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.ad OWNER to postgres;


CREATE TABLE public.ad_images
(
    ad_id integer NOT NULL DEFAULT nextval('ad_images_id_seq'::regclass),
    images character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT ad_fk FOREIGN KEY (ad_id)
        REFERENCES public.ad (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.ad_images OWNER to postgres;
    
    
CREATE TABLE public.message
(
    id integer NOT NULL DEFAULT nextval('message_id_seq'::regclass),
    created_date timestamp without time zone,
    was_read boolean NOT NULL,
    name character varying(100) COLLATE pg_catalog."default",
    email character varying(255) COLLATE pg_catalog."default",
    msg_text character varying(250) COLLATE pg_catalog."default",
    phone character varying(16) COLLATE pg_catalog."default",
    CONSTRAINT mensagem_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.message OWNER to postgres;    
