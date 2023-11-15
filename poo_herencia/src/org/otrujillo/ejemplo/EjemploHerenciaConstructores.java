package org.otrujillo.ejemplo;

import org.otrujillo.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("============================================================================================");
    }
}
