package org.oscartrugo.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>(); //<key, value>
        persona.put(null, "1234"); //Solo acepta un null por estructura, no acepta más
        persona.put(null, "12345");
        persona.put("nombre", "John"); //Agregamos un valor al hashmap
        persona.put("apellido", "Doe");
        //persona.put("apellido", "Roe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
    }
}
