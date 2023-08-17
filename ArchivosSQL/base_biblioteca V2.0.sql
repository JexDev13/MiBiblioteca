drop database if exists base_biblioteca;
drop table if exists Prestamo;
drop table if exists Libro;
drop table if exists Estudiantes;

create database if not exists base_biblioteca;

use base_biblioteca;

#creacion de la tabla libros
create table if not exists Libro(
	codigo_libro int not null,
    nombre_libro varchar(45) not null,
    fecha_publicacion varchar(45) not null,
    edicion varchar(45) not null,
    nombre_autor varchar(45) not null,
    apellido_autor varchar(45) not null,
    categoria varchar(45) not null,
    stock int not null,
    disponibilidad int not null,
    primary key(codigo_libro)
)engine=InnoDB;

#creacion tabla de estudiantes
create table if not exists Estudiante(
	codigo_estudiante int not null,
    nombre_estudiante varchar(45) not null,
    apellido_estudiante varchar(45) not null,
    celular_estudiante int not null,
    sector varchar(45) not null,
    facultad varchar(45) not null,
    correo_estudiante varchar(45) not null,
    primary key(codigo_estudiante)
)engine=InnoDB;

#creacion tabla de libros prestados 
create table if not exists Prestamo(
	codigo_prestamo int not null auto_increment,
	codigo_libro int not null,
    codigo_estudiante int not null,
    foreign key (codigo_libro)
		references Libro(codigo_libro)on delete cascade,
	foreign key (codigo_estudiante)
		references Estudiante(codigo_estudiante) on delete cascade,
	fecha_prestamo varchar(45) not null,
    fecha_devolucion varchar(45) not null,
    primary key(codigo_prestamo)
)engine=InnoDB;

#insert into Libro values(codigo libro,nombre libro,fecha de edicion, edicion ,nombre autor, apellido autor,categoria,stock, disponibilidad);
insert into Libro values(10, "perdida","12/12/2021","segunda","mad","max","aventura",200, 200);
#insert into Estudiante values(cod_estudiante,Nombre estu,Apellido estu,celular,sector,facultad,correo);
insert into Estudiante values(111111111,"Pepe","Grillo",09999999,"centro","sistemas","qqqqq@hotmail.com");
#insert into prestamo values(cod libro,cod estudiante,fecha prestamo,fecha devolucion);
insert into Prestamo values(null,10,11,"09/08/2000","09/09/2000");

insert into Prestamo values(null,10,11,"09/08/2000","09/09/2000");

select * from Prestamo;
select * from Estudiante;
select * from Libro;

select codigo_estudiante, apellido_estudiante
	from Estudiante
    order by apellido_estudiante;
    
select codigo_estudiante from Estudiante
    where nombre_estudiante like '%Pepe%' and
    apellido_estudiante like '%Grillo%';
    
select codigo_estudiante from Estudiante
    where nombre_estudiante like '%Jeremy%' and
    apellido_estudiante like '%%'; 
    
select nombre_estudiante, apellido_estudiante FROM Estudiante
inner join Prestamo
On Estudiante.codigo_estudiante = Prestamo.codigo_estudiante;
    
select codigo_prestamo, nombre_estudiante, apellido_estudiante, nombre_libro, fecha_prestamo, fecha_devolucion FROM Estudiante
inner join Prestamo On (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)
inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro);


select * FROM Estudiante
inner join Prestamo On (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)
inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro)
where Libro.codigo_libro like '%2020104%';
    
select codigo_libro from Libro
    where nombre_libro like '%El Tunel%' and
    edicion like '%%';
    
select nombre_estudiante, apellido_estudiante, L.fecha_prestamo
	from Estudiante E join prestamo L
	on(E.codigo_estudiante = L.fecha_prestamo);

select * from Estudiante
	where nombre_estudiante like 'J%';
    
select * from Estudiante
	where apellido_estudiante like '%Salazar%';

UPDATE Libro SET disponibilidad = disponibilidad-1 WHERE codigo_libro = 202006;

DELETE from Libro Where codigo_libro= 10;

select * from Estudiante
    where nombre_estudiante like '%Samantha%' and
    apellido_estudiante like '%Arias%';
    
select codigo_prestamo from Prestamo where codigo_estudiante like 202203107;

Select * from Estudiante where codigo_estudiante like '%202203112%';

select * from Estudiante
    where nombre_estudiante like '%' and
    apellido_estudiante like '%%';
    
Select disponibilidad from Libro where nombre_libro like '%enchiridion%';

Select codigo_prestamo from Prestamo order By codigo_prestamo DESC limit 1;

Select count(*) from Estudiante where nombre_estudiante 
like '%Samantha%' and apellido_estudiante like '%Panza%';

update Libro set stock=10 where codigo_libro like 2020098;

Select count(*) from Prestamo where codigo_estudiante 
like 202203103 and codigo_libro like 202001;

SELECT * FROM Estudiante 
inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante) 
inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like 10;

SELECT count(*) FROM Prestamo where codigo_prestamo like 3;

Select codigo_prestamo from Prestamo where codigo_estudiante like 202203107;

SELECT codigo_prestamo FROM Estudiante inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)
                         inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where Prestamo.codigo_estudiante like 202203108;
                       
SELECT * FROM Estudiante inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante) inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like 1;
                         