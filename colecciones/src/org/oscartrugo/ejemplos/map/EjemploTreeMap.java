package org.oscartrugo.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); //<key, value>

        persona.put("nombre", "John"); //Agregamos un valor al hashmap
        persona.put("apellido", "Doe");
        //persona.put("apellido", "Roe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        Map<String,String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);
    }
}
