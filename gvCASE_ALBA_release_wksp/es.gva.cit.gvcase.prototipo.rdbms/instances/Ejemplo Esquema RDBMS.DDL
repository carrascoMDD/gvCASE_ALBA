CREATE TABLE CONVOCATORIAS (
    IDENTIFICADOR_CONVOCATORIA VARCHAR2 NOT NULL
    FECHA_CONVOCATORIA DATE NOT NULL
    CONSTRAINT CONVOCATORIAS_PK PRIMARY KEY (IDENTIFICADOR_CONVOCATORIA)
    )
/
CREATE TABLE ACTAS (
    IDENTIFICADOR_ACTA VARCHAR2 NOT NULL
    IDENTIFICADOR_CONVOCATORIA VARCHAR2 NOT NULL
    CONSTRAINT ACTAS_PK PRIMARY KEY (IDENTIFICADOR_CONVOCATORIA,IDENTIFICADOR_ACTA)
    )
/
CREATE TABLE EXAMENES (
    IDENTIFICADOR_EXAMEN VARCHAR2 NOT NULL
    FECHA DATE NOT NULL
    TIPOVIA VARCHAR2 NOT NULL
    NUMERO_EN_VIA VARCHAR2 NOT NULL
    ESCALERA VARCHAR2 NOT NULL
    PUERTA VARCHAR2 NOT NULL
    CODIGO_POSTAL VARCHAR2 NOT NULL
    POBLACION VARCHAR2 NOT NULL
    PROVINCIA VARCHAR2 NOT NULL
    COMUNIDAD_AUTONOMA VARCHAR2 NOT NULL
    PAIS VARCHAR2 NOT NULL
    HORA_COMIENZO TIME NOT NULL
    DURACION TIME NOT NULL
    IDENTIFICADOR_CONVOCATORIA VARCHAR2 NOT NULL
    IDENTIFICADOR_PROFESOR VARCHAR2 NOT NULL
    IDENTIFICADOR_TITULACION VARCHAR2 NOT NULL
    IDENTIFICACION_ASIGNATURA VARCHAR2 NOT NULL
    CONSTRAINT EXAMENES_PK PRIMARY KEY (IDENTIFICADOR_CONVOCATORIA,IDENTIFICADOR_EXAMEN)
    )
/
CREATE TABLE MIEMBROS_DE_TRIBUNALES (
    IDENTIFICADOR_PERSONA VARCHAR2 NOT NULL
    NOMBRE VARCHAR2 NOT NULL
    PRIMER_APELLIDO VARCHAR2 NOT NULL
    SEGUNDO_APELLIDO VARCHAR2 NOT NULL
    CARGO VARCHAR2 NOT NULL
    ES_TITULAR VARCHAR2 NOT NULL
    IDENTIFICADOR_CONVOCATORIA VARCHAR2 NOT NULL
    CONSTRAINT MIEMBROS_DE_TRIBUNALES_PK PRIMARY KEY (IDENTIFICADOR_PERSONA)
    )
/
CREATE TABLE ALUMNOS (
    NIF_ALUMNO VARCHAR2 NOT NULL
    FECHA_NACIMIENTO VARCHAR2 NOT NULL
    NOMBRE VARCHAR2 NOT NULL
    PRIMER_APELLIDO VARCHAR2 NOT NULL
    SEGUNDO_APELLIDO VARCHAR2 NOT NULL
    NOMBRE_VIA VARCHAR2 NOT NULL
    TIPOVIA VARCHAR2 NOT NULL
    NUMERO_EN_VIA VARCHAR2 NOT NULL
    PISO VARCHAR2 NOT NULL
    ESCALERA VARCHAR2 NOT NULL
    PUERTA VARCHAR2 NOT NULL
    CODIGO_POSTAL VARCHAR2 NOT NULL
    POBLACION VARCHAR2 NOT NULL
    PROVINCIA VARCHAR2 NOT NULL
    COMUNIDAD_AUTONOMA VARCHAR2 NOT NULL
    PAIS VARCHAR2 NOT NULL
    TELEFONO_FIJO VARCHAR2 NOT NULL
    TELEFONO_MOVIL VARCHAR2 NOT NULL
    CORREO_ELECTRONICO VARCHAR2 NOT NULL
    CONSTRAINT ALUMNOS_PK PRIMARY KEY (NIF_ALUMNO)
    )
/
CREATE TABLE SOLICITUDES (
    IDENTIFICADOR_SOLICITUD VARCHAR2 NOT NULL
    ESTAN_FOTOS_DISPONIBLES VARCHAR2 NOT NULL
    ESTA_FOTOCOPIA_DNI_DISPONIBLE VARCHAR2 NOT NULL
    ESTA_CERTIFICADO_MEDICO_DISPONIBLE VARCHAR2 NOT NULL
    IDENTIFICADOR_EXAMEN VARCHAR2 NOT NULL
    NIF_ALUMNO VARCHAR2 NOT NULL
    IDENTIFICADOR_CONVOCATORIA  VARCHAR2 NOT NULL
    CONSTRAINT SOLICITUDES_PK PRIMARY KEY (IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_EXAMEN,NIF_ALUMNO,IDENTIFICADOR_SOLICITUD)
    )
/
CREATE TABLE RESOLUCIONES (
    ES_CONVALIDACIÓN VARCHAR2 NOT NULL
    IDENTIFICADOR_CONVOCATORIA  VARCHAR2 NOT NULL
    IDENTIFICADOR_ACTA VARCHAR2 NOT NULL
    IDENTIFICADOR_EXAMEN VARCHAR2 NOT NULL
    IDENTIFICADOR_SOLICITUD VARCHAR2 NOT NULL
    NIF_ALUMNO VARCHAR2 NOT NULL
    CONSTRAINT RESOLUCIONES_PK PRIMARY KEY (IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_ACTA)
    )
/
CREATE TABLE PROFESORES (
    IDENTIFICADOR_PROFESOR VARCHAR2 NOT NULL
    NOMBRE VARCHAR2 NOT NULL
    PRIMER_APELLIDO VARCHAR2 NOT NULL
    SEGUNDO_APELLIDO VARCHAR2 NOT NULL
    CONSTRAINT PROFESORES_PK PRIMARY KEY (IDENTIFICADOR_PROFESOR)
    )
/
CREATE TABLE ASIGNATURAS (
    IDENTIFICDOR_ASIGNATURA VARCHAR2 NOT NULL
    DESCRIPCION_EN_CASTELLANO VARCHAR2 NOT NULL
    DESCRIPCION_EN_VALENCIANO VARCHAR2 NOT NULL
    NUMERO_DE_HORAS NUMBER NOT NULL
    TEORICA_O_PRACTICA VARCHAR2 NOT NULL
    CONSTRAINT ASIGNATURAS_PK PRIMARY KEY (IDENTIFICDOR_ASIGNATURA)
    )
/
CREATE TABLE TITULACIONES (
    IDENTIFICADOR_TITULACION VARCHAR2 NOT NULL
    DESCRIPCION_EN_CASTELLANO VARCHAR2 NOT NULL
    DESCRIPCION_EN_VALENCIANO VARCHAR2 NOT NULL
    CONSTRAINT TITULACIONES_PK PRIMARY KEY (IDENTIFICADOR_TITULACION)
    )
/
CREATE TABLE ASIGNATURAS_PARA_TITULACIONES (
    IDENTIFICADOR_TITULACION VARCHAR2 NOT NULL
    IDENTIFICDOR_ASIGNATURA VARCHAR2 NOT NULL
    CONSTRAINT ASIGNATURAS_PARA_TITULACIONES_PK PRIMARY KEY (IDENTIFICADOR_TITULACION,IDENTIFICDOR_ASIGNATURA)
    )
/
ALTER TABLE ACTAS ADD ( CONSTRAINT CONVOCATORIA_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA) REFERENCES CONVOCATORIAS ( IDENTIFICADOR_CONVOCATORIA))
/
ALTER TABLE EXAMENES ADD ( CONSTRAINT CONVOCATORIA_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA) REFERENCES CONVOCATORIAS ( IDENTIFICADOR_CONVOCATORIA))
/
ALTER TABLE EXAMENES ADD ( CONSTRAINT PROFESOR_FK FOREIGN KEY (IDENTIFICADOR_PROFESOR) REFERENCES PROFESORES ( IDENTIFICADOR_PROFESOR))
/
ALTER TABLE EXAMENES ADD ( CONSTRAINT ASIGNATURA_PARA_TITULACION_FK FOREIGN KEY (IDENTIFICADOR_TITULACION,IDENTIFICACION_ASIGNATURA) REFERENCES ASIGNATURAS_PARA_TITULACIONES ( IDENTIFICADOR_TITULACION,IDENTIFICDOR_ASIGNATURA))
/
ALTER TABLE MIEMBROS_DE_TRIBUNALES ADD ( CONSTRAINT CONVOCATORIA_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA) REFERENCES CONVOCATORIAS ( IDENTIFICADOR_CONVOCATORIA))
/
ALTER TABLE SOLICITUDES ADD ( CONSTRAINT EXAMEN_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_EXAMEN) REFERENCES EXAMENES ( IDENTIFICADOR_CONVOCATORIA,IDENTIFICADOR_EXAMEN))
/
ALTER TABLE SOLICITUDES ADD ( CONSTRAINT ALUMNO_FK FOREIGN KEY (NIF_ALUMNO) REFERENCES ALUMNOS ( NIF_ALUMNO))
/
ALTER TABLE RESOLUCIONES ADD ( CONSTRAINT ACTA_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_ACTA) REFERENCES ACTAS ( IDENTIFICADOR_CONVOCATORIA,IDENTIFICADOR_ACTA))
/
ALTER TABLE RESOLUCIONES ADD ( CONSTRAINT SOLICITUD_FK FOREIGN KEY (IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_EXAMEN,NIF_ALUMNO,IDENTIFICADOR_SOLICITUD) REFERENCES SOLICITUDES ( IDENTIFICADOR_CONVOCATORIA ,IDENTIFICADOR_EXAMEN,NIF_ALUMNO,IDENTIFICADOR_SOLICITUD))
/
ALTER TABLE ASIGNATURAS_PARA_TITULACIONES ADD ( CONSTRAINT TITULACION_FK FOREIGN KEY (IDENTIFICADOR_TITULACION) REFERENCES TITULACIONES ( IDENTIFICADOR_TITULACION))
/
ALTER TABLE ASIGNATURAS_PARA_TITULACIONES ADD ( CONSTRAINT ASIGNATURA_FK FOREIGN KEY (IDENTIFICDOR_ASIGNATURA) REFERENCES ASIGNATURAS ( IDENTIFICDOR_ASIGNATURA))
/
CREATE VIEW ALUMNOS_SOLICITANDO_EXAMENES_DE_CONVOCATORIAS (
    IDENTIFICADOR_CONVOCATORIA,
    FECHA_CONVOCATORIA,
    IDENTIFICADOR_EXAMEN,
    FECHA,
    TIPOVIA_EXAMEN,
    NUMERO_EN_VIA_EXAMEN,
    ESCALERA_EXAMEN,
    PUERTA_EXAMEN,
    CODIGO_POSTAL_EXAMEN,
    POBLACION_EXAMEN,
    PROVINCIA_EXAMEN,
    COMUNIDAD_AUTONOMA_EXAMEN,
    PAIS_EXAMEN,
    HORA_COMIENZO,
    DURACION,
    IDENTIFICADOR_PROFESOR,
    IDENTIFICADOR_TITULACION,
    IDENTIFICACION_ASIGNATURA,
    IDENTIFICADOR_SOLICITUD,
    ESTAN_FOTOS_DISPONIBLES,
    ESTA_FOTOCOPIA_DNI_DISPONIBLE,
    ESTA_CERTIFICADO_MEDICO_DISPONIBLE,
    IDENTIFICADOR_EXAMEN,
    NIF_ALUMNO,
    FECHA_NACIMIENTO,
    NOMBRE,
    PRIMER_APELLIDO,
    SEGUNDO_APELLIDO,
    NOMBRE_VIA,
    TIPOVIA,
    NUMERO_EN_VIA,
    PISO,
    ESCALERA,
    PUERTA,
    CODIGO_POSTAL,
    POBLACION,
    PROVINCIA,
    COMUNIDAD_AUTONOMA,
    PAIS,
    TELEFONO_FIJO,
    TELEFONO_MOVIL,
    CORREO_ELECTRONICO
) AS SELECT 
    CONVOCATORIAS.IDENTIFICADOR_CONVOCATORIA,
    CONVOCATORIAS.FECHA_CONVOCATORIA,
    EXAMENES.IDENTIFICADOR_EXAMEN,
    EXAMENES.FECHA,
    EXAMENES.TIPOVIA,
    EXAMENES.NUMERO_EN_VIA,
    EXAMENES.ESCALERA,
    EXAMENES.PUERTA,
    EXAMENES.CODIGO_POSTAL,
    EXAMENES.POBLACION,
    EXAMENES.PROVINCIA,
    EXAMENES.COMUNIDAD_AUTONOMA,
    EXAMENES.PAIS,
    EXAMENES.HORA_COMIENZO,
    EXAMENES.DURACION,
    EXAMENES.IDENTIFICADOR_PROFESOR,
    EXAMENES.IDENTIFICADOR_TITULACION,
    EXAMENES.IDENTIFICACION_ASIGNATURA,
    SOLICITUDES.IDENTIFICADOR_SOLICITUD,
    SOLICITUDES.ESTAN_FOTOS_DISPONIBLES,
    SOLICITUDES.ESTA_FOTOCOPIA_DNI_DISPONIBLE,
    SOLICITUDES.ESTA_CERTIFICADO_MEDICO_DISPONIBLE,
    SOLICITUDES.IDENTIFICADOR_EXAMEN,
    ALUMNOS.NIF_ALUMNO,
    ALUMNOS.FECHA_NACIMIENTO,
    ALUMNOS.NOMBRE,
    ALUMNOS.PRIMER_APELLIDO,
    ALUMNOS.SEGUNDO_APELLIDO,
    ALUMNOS.NOMBRE_VIA,
    ALUMNOS.TIPOVIA,
    ALUMNOS.NUMERO_EN_VIA,
    ALUMNOS.PISO,
    ALUMNOS.ESCALERA,
    ALUMNOS.PUERTA,
    ALUMNOS.CODIGO_POSTAL,
    ALUMNOS.POBLACION,
    ALUMNOS.PROVINCIA,
    ALUMNOS.COMUNIDAD_AUTONOMA,
    ALUMNOS.PAIS,
    ALUMNOS.TELEFONO_FIJO,
    ALUMNOS.TELEFONO_MOVIL,
    ALUMNOS.CORREO_ELECTRONICO
 FROM CONVOCATORIAS,EXAMENES,SOLICITUDES,ALUMNOS
 WHERE EXAMENES.IDENTIFICADOR_CONVOCATORIA=CONVOCATORIAS.IDENTIFICADOR_CONVOCATORIA AND SOLICITUDES.IDENTIFICADOR_EXAMEN=EXAMENES.IDENTIFICADOR_EXAMEN AND ALUMNOS.NIF_ALUMNO=SOLICITUDES.NIF_ALUMNO
/
