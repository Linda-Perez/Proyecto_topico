insert into persona values ('Linda Andrea','Pérez Salazar','zs19022271@estudiantes.uv.mx','Bv. Adolfo Ruíz Cortinez 475,Costa Verde'
                            ,'9815336','2299442075','2001/04/24',22,'PESL2305MVEFGA8');

insert into persona values ('Rafael','Zamudio Serralta','rafaelZS01@gmail.com','Calle Mar del Nte.72, Costa Verde'
                            ,'9698754','2293597246','1999/09/15',23,'ZASR305HCFEFGA8');

insert into persona values ('Cielo','Pérez Salazar','cielps31@gmail.com','Av. Urano, Av Progreso esq, Jardines de Mocambo'
                            ,'9348916','2281379253','1996/08/31',26,'PESC3105MMEFUN2');


insert into profesor values ('Ricardo','Mendoza Cruz','ricmen87@gmail.com','Av. Viveros, Av Jardines del Virginia 280','9783462','2239875223','1976/07/26',46,'MECR7607HMEFIF8'
                            ,'Planta','Estudios de licenciatura','Universidad Veracruzana','Ingeniero en Mecatrónica',2023,
                            'Profesional','Dispositivos Electrónicos,Tecnicas de medición, Robótica');

insert into profesor values ('Valeria','Campos Pozos','valcp37@gmail.com','Calzada Rafael Cuervo Reserva, Vergara Tarimoya','9134972','2203148992','1984/02/28',39,'CAPV8402MQYRMK4'
                            ,'Tiempo Completo','Estudios de licenciatura','UVM','Ingeniero en Electrónica',2021,
                            'Especialización','Circuitos electricos, Dispositivos electrónicos, MicroProcesadores y microcontroladores');

insert into profesor values ('Maria Rosario','Aguilar Moran','marimora3@gmail.com','Puesta de Sol 24, Vistamar','9345921','2294573429','1990/10/28',32,'AGMM9010MJYURG2'
                            ,'Medio Tiempo','Estudios de licenciatura','Instituto Tecnológico de Veracruz','Ingeniero en Mecánica',2019,
                            'Doctorado','Ciencia de los materiales, Diseño mecánico, mecanica de fluidos y Mecanica de materiales');


insert into alumno values ('Edson','Marin Ravelo','edmarin23@gmail.com','Río Nilo, La Vegas,94297 ','9346925','2294458655','2000/09/26',22,'MARE0009HMOUVH6','zs19022281',12345678);
insert into alumno values ('Yerarli','Pérez Salazar','yerarpe17@gmail.com','C. Isabel La Católica, Reforma','9349258','2299315664','2003/02/17',20,'PESY0302MPJSMH2','zs17022281',87654321);
insert into alumno values ('Lila Tonantzin','Salazar Blanco','lilato22@gmail.com','Av Costa de Oro, Costa de Oro','9364229','2293007235','1997/07/19',25,'SABL9707MVREIV7','zs20022272',95175364);

insert into materia values ('Robótica',8,'Teórica',' Definición y clasificación del Robot, Morfología del Robot y Estructura mecánica de un robot'
                            ,5,'10:00 - 10:59','Vasquez-Santacruz Jose Alejandro',9,41345);

insert into materia values ('Dibujo de Ingeniería',3,'Teórica/Práctica','Teoría del dibujo asistido por computadora,Metodología del dibujo con CAD y Simbología en la ingeniería'
                            ,3,'08:00 - 08:59','Ramos-Vicarte Eduardo Amet',8,51358);

insert into materia values ('Gimnasia aerobica',4,'Práctica','Ninguno',4,'11:00 - 12:59','Alcaraz-Orozco Mario',10,12598);


insert into aula values ('F-21',30,66160);
insert into aula values ('F-15',35,23545);
insert into aula values ('F-23',30,12487);

insert into materia_aula values ('Agosto',15,'10:00 - 10:59');
insert into materia_aula values ('Agosto',17,'08:00 - 08:59');
insert into materia_aula values ('Agosto',15,'11:00 - 12:59');

insert into curso values ('Administración','F-16','11:00-11:59','Administración para todos',52946);
insert into curso values ('Programación','I-12','07:00-07:59','Programación desde 0',91354);
insert into curso values ('Sistemas mecatrónicos','B-21','13:00-13:59','Automatización de PLC',34816);

insert into cupo values (35,32,10);
insert into cupo values (32,32,10);
insert into cupo values (30,25,10);

