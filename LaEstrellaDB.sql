PGDMP         :                y            Cacharreria    13.1    13.1 )    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    Cacharreria    DATABASE     l   CREATE DATABASE "Cacharreria" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE "Cacharreria";
                postgres    false            �           0    0    DATABASE "Cacharreria"    COMMENT     @   COMMENT ON DATABASE "Cacharreria" IS 'Cacharreria la Estrella';
                   postgres    false    3035            �            1259    16416    Cliente    TABLE     �   CREATE TABLE public."Cliente" (
    "Id" integer NOT NULL,
    "Nombre" text,
    "Apellido" text,
    "Telefono" text,
    "Deuda" integer,
    "Direccion" text
);
    DROP TABLE public."Cliente";
       public         heap    postgres    false            �           0    0    TABLE "Cliente"    COMMENT     ;   COMMENT ON TABLE public."Cliente" IS 'Datos del clientes';
          public          postgres    false    203            �            1259    24581    Compra    TABLE     �   CREATE TABLE public."Compra" (
    "ID" integer NOT NULL,
    "IdProducto" integer,
    "Cantidad" integer,
    "PrecioCompra" integer
);
    DROP TABLE public."Compra";
       public         heap    postgres    false            �           0    0    TABLE "Compra"    COMMENT     H   COMMENT ON TABLE public."Compra" IS 'Datos de una compra de productos';
          public          postgres    false    206            �            1259    24579    Compra_ID_seq    SEQUENCE     �   CREATE SEQUENCE public."Compra_ID_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public."Compra_ID_seq";
       public          postgres    false    206            �           0    0    Compra_ID_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public."Compra_ID_seq" OWNED BY public."Compra"."ID";
          public          postgres    false    205            �            1259    16408    Login    TABLE     c   CREATE TABLE public."Login" (
    "Nombre" text,
    "Password" text,
    "ID" integer NOT NULL
);
    DROP TABLE public."Login";
       public         heap    postgres    false            �           0    0    TABLE "Login"    COMMENT     k   COMMENT ON TABLE public."Login" IS 'Datos de inicio de sesión de un usuario para ingresar al aplicativo';
          public          postgres    false    202            �            1259    16395    Producto    TABLE     L  CREATE TABLE public."Producto" (
    "IdProducto" integer NOT NULL,
    "NombreProducto" text,
    "Concepto" text,
    "Costo" integer,
    "Existencias" integer,
    "CostoPonderado" integer,
    "PrecioVenta" integer,
    "FechaCaducidad" date,
    "Categoria" text NOT NULL,
    "FechaAviso" date,
    "Estado" text NOT NULL
);
    DROP TABLE public."Producto";
       public         heap    postgres    false            �           0    0    TABLE "Producto"    COMMENT     @   COMMENT ON TABLE public."Producto" IS 'Entidad del inventario';
          public          postgres    false    200            �           0    0    COLUMN "Producto"."Estado"    COMMENT     J   COMMENT ON COLUMN public."Producto"."Estado" IS 'Activo o Descontinuado';
          public          postgres    false    200            �            1259    16424    Producto-Ventas    TABLE     q   CREATE TABLE public."Producto-Ventas" (
    "IdProducto" integer NOT NULL,
    "CodigoVenta" integer NOT NULL
);
 %   DROP TABLE public."Producto-Ventas";
       public         heap    postgres    false            �           0    0    TABLE "Producto-Ventas"    COMMENT     t   COMMENT ON TABLE public."Producto-Ventas" IS 'Relación muchos a muchos entre la tabla venta y la tabla productos';
          public          postgres    false    204            �            1259    16403    Ventas    TABLE     �   CREATE TABLE public."Ventas" (
    "Codigo" integer NOT NULL,
    "Cantidad" integer,
    "CostoTotal" integer,
    "Fecha" date NOT NULL,
    "Hora" date,
    "Estado" text NOT NULL
);
    DROP TABLE public."Ventas";
       public         heap    postgres    false            �           0    0    TABLE "Ventas"    COMMENT     :   COMMENT ON TABLE public."Ventas" IS 'Datos de una venta';
          public          postgres    false    201            �           0    0    COLUMN "Ventas"."Estado"    COMMENT     B   COMMENT ON COLUMN public."Ventas"."Estado" IS 'Activa o Anulada';
          public          postgres    false    201            :           2604    24584 	   Compra ID    DEFAULT     l   ALTER TABLE ONLY public."Compra" ALTER COLUMN "ID" SET DEFAULT nextval('public."Compra_ID_seq"'::regclass);
 <   ALTER TABLE public."Compra" ALTER COLUMN "ID" DROP DEFAULT;
       public          postgres    false    205    206    206            �          0    16416    Cliente 
   TABLE DATA           a   COPY public."Cliente" ("Id", "Nombre", "Apellido", "Telefono", "Deuda", "Direccion") FROM stdin;
    public          postgres    false    203   �+       �          0    24581    Compra 
   TABLE DATA           R   COPY public."Compra" ("ID", "IdProducto", "Cantidad", "PrecioCompra") FROM stdin;
    public          postgres    false    206   �+       �          0    16408    Login 
   TABLE DATA           =   COPY public."Login" ("Nombre", "Password", "ID") FROM stdin;
    public          postgres    false    202   �+       �          0    16395    Producto 
   TABLE DATA           �   COPY public."Producto" ("IdProducto", "NombreProducto", "Concepto", "Costo", "Existencias", "CostoPonderado", "PrecioVenta", "FechaCaducidad", "Categoria", "FechaAviso", "Estado") FROM stdin;
    public          postgres    false    200   ,       �          0    16424    Producto-Ventas 
   TABLE DATA           H   COPY public."Producto-Ventas" ("IdProducto", "CodigoVenta") FROM stdin;
    public          postgres    false    204   (,       �          0    16403    Ventas 
   TABLE DATA           a   COPY public."Ventas" ("Codigo", "Cantidad", "CostoTotal", "Fecha", "Hora", "Estado") FROM stdin;
    public          postgres    false    201   E,       �           0    0    Compra_ID_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public."Compra_ID_seq"', 1, false);
          public          postgres    false    205            B           2606    16423    Cliente Cliente_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY ("Id");
 B   ALTER TABLE ONLY public."Cliente" DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    203            H           2606    24586    Compra Compra_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public."Compra"
    ADD CONSTRAINT "Compra_pkey" PRIMARY KEY ("ID");
 @   ALTER TABLE ONLY public."Compra" DROP CONSTRAINT "Compra_pkey";
       public            postgres    false    206            <           2606    16402    Producto Inventario_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."Producto"
    ADD CONSTRAINT "Inventario_pkey" PRIMARY KEY ("IdProducto");
 F   ALTER TABLE ONLY public."Producto" DROP CONSTRAINT "Inventario_pkey";
       public            postgres    false    200            @           2606    16415    Login Login_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Login"
    ADD CONSTRAINT "Login_pkey" PRIMARY KEY ("ID");
 >   ALTER TABLE ONLY public."Login" DROP CONSTRAINT "Login_pkey";
       public            postgres    false    202            D           2606    16428 $   Producto-Ventas Producto-Ventas_pkey 
   CONSTRAINT        ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Producto-Ventas_pkey" PRIMARY KEY ("IdProducto", "CodigoVenta");
 R   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Producto-Ventas_pkey";
       public            postgres    false    204    204            >           2606    16407    Ventas Ventas_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public."Ventas"
    ADD CONSTRAINT "Ventas_pkey" PRIMARY KEY ("Codigo");
 @   ALTER TABLE ONLY public."Ventas" DROP CONSTRAINT "Ventas_pkey";
       public            postgres    false    201            I           1259    24592    fki_IdProducto    INDEX     M   CREATE INDEX "fki_IdProducto" ON public."Compra" USING btree ("IdProducto");
 $   DROP INDEX public."fki_IdProducto";
       public            postgres    false    206            E           1259    16440    fki_Producto    INDEX     T   CREATE INDEX "fki_Producto" ON public."Producto-Ventas" USING btree ("IdProducto");
 "   DROP INDEX public."fki_Producto";
       public            postgres    false    204            F           1259    16446 	   fki_Venta    INDEX     R   CREATE INDEX "fki_Venta" ON public."Producto-Ventas" USING btree ("CodigoVenta");
    DROP INDEX public."fki_Venta";
       public            postgres    false    204            L           2606    24587    Compra IdProducto    FK CONSTRAINT     �   ALTER TABLE ONLY public."Compra"
    ADD CONSTRAINT "IdProducto" FOREIGN KEY ("IdProducto") REFERENCES public."Producto"("IdProducto") NOT VALID;
 ?   ALTER TABLE ONLY public."Compra" DROP CONSTRAINT "IdProducto";
       public          postgres    false    2876    206    200            J           2606    16435    Producto-Ventas Producto    FK CONSTRAINT     �   ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Producto" FOREIGN KEY ("IdProducto") REFERENCES public."Producto"("IdProducto") NOT VALID;
 F   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Producto";
       public          postgres    false    204    2876    200            K           2606    16441    Producto-Ventas Venta    FK CONSTRAINT     �   ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Venta" FOREIGN KEY ("CodigoVenta") REFERENCES public."Ventas"("Codigo") NOT VALID;
 C   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Venta";
       public          postgres    false    2878    204    201            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     