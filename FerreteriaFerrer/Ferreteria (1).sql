CREATE DATABASE FERRETERIA;
USE FERRETERIA;

CREATE TABLE tblCategorias(
IdCat INT  IDENTITY(1,1) NOT NULL PRIMARY KEY,
NombreCat VARCHAR (20)
);

select * from tblProductos

CREATE TABLE tblProductos(
IdProducto INT IDENTITY(1,1)PRIMARY KEY  NOT NULL,
TipoProducto INT FOREIGN KEY REFERENCES tblCategorias(IdCat) on update cascade on delete cascade,
NombrePro VARCHAR (20),
Precio INT
);

CREATE TABLE USUARIOS(
IdVendedor varchar(11) FOREIGN KEY REFERENCES tblVendedor(CedulaVendedor) on update cascade on delete cascade,
Usuario VARCHAR (20) NOT NULL,
Contraseña VARCHAR (20) NOT NULL,
);

insert into USUARIOS values ('7121688','admin','admin');

create table tblProveedores(
Cedula varchar(11) primary key not null,
NombreProveedor varchar(20),
ApellidosProveedor varchar(30),
TelefonoProveedor varchar(11),
Ciudad varchar(20)
);

create table tblEntradasProductos(
numeroRegistro int IDENTITY(1,1) NOT NULL PRIMARY KEY,
Producto int FOREIGN KEY REFERENCES tblProductos(IdProducto) on update cascade on delete cascade,
Cantidad int,
CantidadActual int,
Proveedor varchar(11) FOREIGN KEY REFERENCES tblProveedores(Cedula) on update cascade on delete cascade,
FechaEntrada date
);

create table tblVendedor(
CedulaVendedor varchar(11) primary key not null,
NombreVendedor varchar(20),
ApellidosVendedor varchar(30),
TelefonoVendedor varchar(11),
Direccion varchar(30)
);
insert into tblVendedor values ('7121688','Carlos','Marin','4057809','calle23 #25-56');



create table tblVentas(
Resivo int NOT NULL PRIMARY KEY,
FechaVenta date,
TipoPago varchar(15),
ValorTotalCompra int,
Vendedor varchar(11) FOREIGN KEY REFERENCES tblVendedor(CedulaVendedor) on update cascade on delete cascade,
);

create table productosComprados(
idResivo int FOREIGN KEY REFERENCES tblVentas(Resivo) on update cascade on delete cascade,
ProductoVendido int FOREIGN KEY REFERENCES tblProductos(IdProducto) on update cascade on delete cascade,
CantidadProducto int,
ValorTotalProducto int
);