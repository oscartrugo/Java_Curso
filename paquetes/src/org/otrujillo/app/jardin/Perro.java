package org.otrujillo.app.jardin;

import org.otrujillo.app.hogar.Persona;

 public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
