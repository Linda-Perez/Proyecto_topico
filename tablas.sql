create table persona (
    nombre varchar(18) not null,
    apellidos varchar(25) not null,
    email varchar(30),
    direccion text,
    telefono varchar(12),
    celular varchar(12),
    fecha_nac date,
    edad int,
    CURP varchar(18),
    constraint pk_persona primary key (CURP)
);

create table profesor (
    tipo_contrato varchar(15),
    estudios_realizados varchar(30),
    universidad varchar(35),
    titulo varchar(25),
    ano_graduacion int,
    tipo_estudio varchar(15),
    materias_dictar text
) inherits(persona);

create table alumno (
     matricula varchar(15),
     cedula int,
     constraint pk_alumno primary key (matricula,cedula)
)inherits(persona);

create table materia (
    nombre varchar(30),
    creditos int,
    tipo_materia varchar(30),
    requisitos_temas text,
    n_horas int,
    horario varchar(15),
    profesor_imparte varchar(40),
    calificacion int,
    codigo int,
    constraint pk_codigo primary key (codigo)
);

create table aula (
    lugar varchar(4),
    n_pupitres int,
    codigo int,
    constraint pk_aula primary key (codigo)
);

create table materia_aula (
    mes varchar(10),
    dia int,
    hora varchar(15)
);

create table curso (
    materia varchar(35),
    salon varchar(4),
    horario varchar(12),
    nombre varchar(40),
    codigo int,
    constraint pk_curso primary key (codigo)
);

create table cupo (
    cupo_max int,
    cupo_actual int,
    cupo_min int
);