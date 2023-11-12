package org.otrujillo.app.jardin;

import static org.otrujillo.app.hogar.ColorPelo.*;
import org.otrujillo.app.hogar.Gato;
import org.otrujillo.app.hogar.Persona;

import static org.otrujillo.app.hogar.Persona.*;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Oscar");
        persona.setApellido("Trujillo");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());

        Gato gato = new Gato();
        Perro perro = new Perro();
        perro.nombre = "Gunker";
        perro.raza = "Rottweiler";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
