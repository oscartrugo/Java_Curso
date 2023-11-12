package org.otrujillo.ejemplo;

import org.otrujillo.pooherencia.Alumno;
import org.otrujillo.pooherencia.AlumnoInternacional;
import org.otrujillo.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("================= Creando la instancia de la clase Alumno =================");
        Alumno alumno = new Alumno();
        alumno.setNombre("Oscar");
        alumno.setApellido("Trujillo");
        alumno.setInstitucion("Quincy");
        alumno.setEdad(25);
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.4);
        alumno.setNotaMatematica(4.0);

        System.out.println("================= Creando la instancia de la clase AlumnoInternacional =================");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Ryan");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(35);
        alumnoInternacional.setInstitucion("Instituto Internacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaLenguaje(6.0);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("================= Creando la instancia de la clase Profesor =================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Kirk");
        profesor.setApellido("Carrillo");
        profesor.setAsignatura("Ingles");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
