CREATE DATABASE simuladorDeNotasBD; 

USE simuladorDeNotasBD;


CREATE TABLE asignatura (
id INT AUTO_INCREMENT,
nombre VARCHAR (50),
PRIMARY KEY (id)
);

CREATE TABLE nota(
id INT AUTO_INCREMENT,
valor INT,
porcentaje INT,
asignatura_fk INT,
FOREIGN KEY (asignatura_fk) REFERENCES asignatura (id),
PRIMARY KEY (id)
);

INSERT INTO Asignatura (nombre) VALUES ('Cálculo') , ('Inglés Intermedio'), ('CCNA'), ('Electricidad'), ('Arquitectura'), ('Ingeniería de Software');
INSERT INTO nota (valor, porcentaje, asignatura_fk) VALUES (65,10,2), (69,20,2), (70,20,2),
(41,30,3), 
(55,25,4), 
(60,10,6), 
(62,15,5),
(36,10,1),
(51,20,1);

/*
DROP DATABASE simuladorDeNotasBD;
/*