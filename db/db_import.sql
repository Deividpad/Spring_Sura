PGDMP     %                     z            employer_db    13.5    13.5     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16417    employer_db    DATABASE     o   CREATE DATABASE employer_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Latin America.1252';
    DROP DATABASE employer_db;
                postgres    false                        2615    16418    employer    SCHEMA        CREATE SCHEMA employer;
    DROP SCHEMA employer;
                postgres    false            ?            1259    16421    employer    TABLE     ?   CREATE TABLE employer.employer (
    id bigint NOT NULL,
    nombre character varying NOT NULL,
    dni bigint NOT NULL,
    cargo character varying NOT NULL,
    fecha_ingreso date NOT NULL
);
    DROP TABLE employer.employer;
       employer         heap    postgres    false    5            ?            1259    16419    employer_id_seq    SEQUENCE     z   CREATE SEQUENCE employer.employer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE employer.employer_id_seq;
       employer          postgres    false    5    202            ?           0    0    employer_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE employer.employer_id_seq OWNED BY employer.employer.id;
          employer          postgres    false    201            $           2604    16424    employer id    DEFAULT     n   ALTER TABLE ONLY employer.employer ALTER COLUMN id SET DEFAULT nextval('employer.employer_id_seq'::regclass);
 <   ALTER TABLE employer.employer ALTER COLUMN id DROP DEFAULT;
       employer          postgres    false    202    201    202            ?          0    16421    employer 
   TABLE DATA           K   COPY employer.employer (id, nombre, dni, cargo, fecha_ingreso) FROM stdin;
    employer          postgres    false    202   ?       ?           0    0    employer_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('employer.employer_id_seq', 24, true);
          employer          postgres    false    201            &           2606    16429    employer employer_pk 
   CONSTRAINT     T   ALTER TABLE ONLY employer.employer
    ADD CONSTRAINT employer_pk PRIMARY KEY (id);
 @   ALTER TABLE ONLY employer.employer DROP CONSTRAINT employer_pk;
       employer            postgres    false    202            ?   3   x?32????M*J5?4??Ģ?| ???P??H?ؐ??E?1%1z\\\ ??E     