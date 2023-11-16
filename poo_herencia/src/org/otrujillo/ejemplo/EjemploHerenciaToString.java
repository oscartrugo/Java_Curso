package org.otrujillo.ejemplo;

import org.otrujillo.pooherencia.Alumno;
import org.otrujillo.pooherencia.AlumnoInternacional;
import org.otrujillo.pooherencia.Persona;
import org.otrujillo.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("================= Creando la instancia de la clase Alumno =================");
        Alumno alumno = new Alumno("Oscar", "Trujillo", 25, "TECNM");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.4);
        alumno.setNotaMatematica(4.0);
        alumno.setEmail("oscartrugo@gmail.com");

        System.out.println("================= Creando la instancia de la clase AlumnoInternacional =================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Ryan", "Gosling", "Australia");
        alumnoInt.setEdad(35);
        alumnoInt.setInstitucion("Instituto Internacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.0);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("ryangosling@gmail.com");

        System.out.println("================= Creando la instancia de la clase Profesor =================");
        Profesor profesor = new Profesor("Kirk", "Carrillo", "Ingles");
        profesor.setEdad(36);
        profesor.setEmail("kirkcarrillo@gmail.com");

        System.out.println("=========== - ===========");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("======================");
        System.out.println(persona);
    }
}
