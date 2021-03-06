PGDMP                 	        y            LaEstrellaBDModi    13.1    13.1 +    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    32768    LaEstrellaBDModi    DATABASE     q   CREATE DATABASE "LaEstrellaBDModi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Colombia.1252';
 "   DROP DATABASE "LaEstrellaBDModi";
                postgres    false            �            1259    32769    Cliente    TABLE     �   CREATE TABLE public."Cliente" (
    "Id" integer NOT NULL,
    "Nombre" text,
    "Apellido" text,
    "Telefono" text,
    "Deuda" integer,
    "Direccion" text
);
    DROP TABLE public."Cliente";
       public         heap    postgres    false            �           0    0    TABLE "Cliente"    COMMENT     ;   COMMENT ON TABLE public."Cliente" IS 'Datos del clientes';
          public          postgres    false    200            �            1259    32775    Compra    TABLE     �   CREATE TABLE public."Compra" (
    "ID" integer NOT NULL,
    "IdProducto" integer,
    "Cantidad" integer,
    "PrecioCompra" integer
);
    DROP TABLE public."Compra";
       public         heap    postgres    false            �           0    0    TABLE "Compra"    COMMENT     H   COMMENT ON TABLE public."Compra" IS 'Datos de una compra de productos';
          public          postgres    false    201            �            1259    32778    Compra_ID_seq    SEQUENCE     �   CREATE SEQUENCE public."Compra_ID_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public."Compra_ID_seq";
       public          postgres    false    201            �           0    0    Compra_ID_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public."Compra_ID_seq" OWNED BY public."Compra"."ID";
          public          postgres    false    202            �            1259    32780    Login    TABLE     c   CREATE TABLE public."Login" (
    "Nombre" text,
    "Password" text,
    "ID" integer NOT NULL
);
    DROP TABLE public."Login";
       public         heap    postgres    false            �           0    0    TABLE "Login"    COMMENT     k   COMMENT ON TABLE public."Login" IS 'Datos de inicio de sesión de un usuario para ingresar al aplicativo';
          public          postgres    false    203            �            1259    32786    Producto-Ventas    TABLE     q   CREATE TABLE public."Producto-Ventas" (
    "IdProducto" integer NOT NULL,
    "CodigoVenta" integer NOT NULL
);
 %   DROP TABLE public."Producto-Ventas";
       public         heap    postgres    false            �           0    0    TABLE "Producto-Ventas"    COMMENT     t   COMMENT ON TABLE public."Producto-Ventas" IS 'Relación muchos a muchos entre la tabla venta y la tabla productos';
          public          postgres    false    204            �            1259    32789    Ventas    TABLE     �   CREATE TABLE public."Ventas" (
    "Codigo" integer NOT NULL,
    "Cantidad" integer,
    "CostoTotal" integer,
    "Fecha" date NOT NULL,
    "Hora" date,
    "Estado" text NOT NULL,
    "IdCliente" integer
);
    DROP TABLE public."Ventas";
       public         heap    postgres    false            �           0    0    TABLE "Ventas"    COMMENT     :   COMMENT ON TABLE public."Ventas" IS 'Datos de una venta';
          public          postgres    false    205            �           0    0    COLUMN "Ventas"."Estado"    COMMENT     B   COMMENT ON COLUMN public."Ventas"."Estado" IS 'Activa o Anulada';
          public          postgres    false    205            �           0    0    COLUMN "Ventas"."IdCliente"    COMMENT     �   COMMENT ON COLUMN public."Ventas"."IdCliente" IS 'Numero de identificación de un cliente, no es necesario siempre registrarlo, solo cuando va a quedar debiendo. Este campo puede ser Null.';
          public          postgres    false    205            �            1259    32795    producto    TABLE     :  CREATE TABLE public.producto (
    id_producto integer NOT NULL,
    nombre_producto text,
    concepto text,
    costo integer,
    existencias integer,
    costo_ponderado integer,
    precio_venta integer,
    categoria text NOT NULL,
    estado text NOT NULL,
    fecha_caducidad text,
    fecha_aviso text
);
    DROP TABLE public.producto;
       public         heap    postgres    false            �           0    0    TABLE producto    COMMENT     >   COMMENT ON TABLE public.producto IS 'Entidad del inventario';
          public          postgres    false    206            �           0    0    COLUMN producto.estado    COMMENT     F   COMMENT ON COLUMN public.producto.estado IS 'Activo o Descontinuado';
          public          postgres    false    206            :           2604    32801 	   Compra ID    DEFAULT     l   ALTER TABLE ONLY public."Compra" ALTER COLUMN "ID" SET DEFAULT nextval('public."Compra_ID_seq"'::regclass);
 <   ALTER TABLE public."Compra" ALTER COLUMN "ID" DROP DEFAULT;
       public          postgres    false    202    201            �          0    32769    Cliente 
   TABLE DATA           a   COPY public."Cliente" ("Id", "Nombre", "Apellido", "Telefono", "Deuda", "Direccion") FROM stdin;
    public          postgres    false    200   �.       �          0    32775    Compra 
   TABLE DATA           R   COPY public."Compra" ("ID", "IdProducto", "Cantidad", "PrecioCompra") FROM stdin;
    public          postgres    false    201   �.       �          0    32780    Login 
   TABLE DATA           =   COPY public."Login" ("Nombre", "Password", "ID") FROM stdin;
    public          postgres    false    203   �.       �          0    32786    Producto-Ventas 
   TABLE DATA           H   COPY public."Producto-Ventas" ("IdProducto", "CodigoVenta") FROM stdin;
    public          postgres    false    204   /       �          0    32789    Ventas 
   TABLE DATA           n   COPY public."Ventas" ("Codigo", "Cantidad", "CostoTotal", "Fecha", "Hora", "Estado", "IdCliente") FROM stdin;
    public          postgres    false    205   +/       �          0    32795    producto 
   TABLE DATA           �   COPY public.producto (id_producto, nombre_producto, concepto, costo, existencias, costo_ponderado, precio_venta, categoria, estado, fecha_caducidad, fecha_aviso) FROM stdin;
    public          postgres    false    206   H/       �           0    0    Compra_ID_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public."Compra_ID_seq"', 1, false);
          public          postgres    false    202            <           2606    32803    Cliente Cliente_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Cliente"
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY ("Id");
 B   ALTER TABLE ONLY public."Cliente" DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    200            >           2606    32805    Compra Compra_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public."Compra"
    ADD CONSTRAINT "Compra_pkey" PRIMARY KEY ("ID");
 @   ALTER TABLE ONLY public."Compra" DROP CONSTRAINT "Compra_pkey";
       public            postgres    false    201            J           2606    32807    producto Inventario_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT "Inventario_pkey" PRIMARY KEY (id_producto);
 D   ALTER TABLE ONLY public.producto DROP CONSTRAINT "Inventario_pkey";
       public            postgres    false    206            A           2606    32809    Login Login_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Login"
    ADD CONSTRAINT "Login_pkey" PRIMARY KEY ("ID");
 >   ALTER TABLE ONLY public."Login" DROP CONSTRAINT "Login_pkey";
       public            postgres    false    203            C           2606    32811 $   Producto-Ventas Producto-Ventas_pkey 
   CONSTRAINT        ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Producto-Ventas_pkey" PRIMARY KEY ("IdProducto", "CodigoVenta");
 R   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Producto-Ventas_pkey";
       public            postgres    false    204    204            G           2606    32813    Ventas Ventas_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public."Ventas"
    ADD CONSTRAINT "Ventas_pkey" PRIMARY KEY ("Codigo");
 @   ALTER TABLE ONLY public."Ventas" DROP CONSTRAINT "Ventas_pkey";
       public            postgres    false    205            H           1259    32837    fki_Cliente-Venta    INDEX     O   CREATE INDEX "fki_Cliente-Venta" ON public."Ventas" USING btree ("IdCliente");
 '   DROP INDEX public."fki_Cliente-Venta";
       public            postgres    false    205            ?           1259    32814    fki_IdProducto    INDEX     M   CREATE INDEX "fki_IdProducto" ON public."Compra" USING btree ("IdProducto");
 $   DROP INDEX public."fki_IdProducto";
       public            postgres    false    201            D           1259    32815    fki_Producto    INDEX     T   CREATE INDEX "fki_Producto" ON public."Producto-Ventas" USING btree ("IdProducto");
 "   DROP INDEX public."fki_Producto";
       public            postgres    false    204            E           1259    32816 	   fki_Venta    INDEX     R   CREATE INDEX "fki_Venta" ON public."Producto-Ventas" USING btree ("CodigoVenta");
    DROP INDEX public."fki_Venta";
       public            postgres    false    204            N           2606    32832    Ventas Cliente-Venta    FK CONSTRAINT     �   ALTER TABLE ONLY public."Ventas"
    ADD CONSTRAINT "Cliente-Venta" FOREIGN KEY ("IdCliente") REFERENCES public."Cliente"("Id") NOT VALID;
 B   ALTER TABLE ONLY public."Ventas" DROP CONSTRAINT "Cliente-Venta";
       public          postgres    false    205    200    2876            K           2606    32817    Compra IdProducto    FK CONSTRAINT     �   ALTER TABLE ONLY public."Compra"
    ADD CONSTRAINT "IdProducto" FOREIGN KEY ("IdProducto") REFERENCES public.producto(id_producto) NOT VALID;
 ?   ALTER TABLE ONLY public."Compra" DROP CONSTRAINT "IdProducto";
       public          postgres    false    206    201    2890            L           2606    32822    Producto-Ventas Producto    FK CONSTRAINT     �   ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Producto" FOREIGN KEY ("IdProducto") REFERENCES public.producto(id_producto) NOT VALID;
 F   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Producto";
       public          postgres    false    204    206    2890            M           2606    32827    Producto-Ventas Venta    FK CONSTRAINT     �   ALTER TABLE ONLY public."Producto-Ventas"
    ADD CONSTRAINT "Venta" FOREIGN KEY ("CodigoVenta") REFERENCES public."Ventas"("Codigo") NOT VALID;
 C   ALTER TABLE ONLY public."Producto-Ventas" DROP CONSTRAINT "Venta";
       public          postgres    false    204    205    2887            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �   $   x�35�LIK)�L)�����`��,����� �	P     