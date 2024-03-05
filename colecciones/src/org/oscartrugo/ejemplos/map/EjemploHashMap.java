package org.oscartrugo.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>(); //<key, value>
        System.out.println("Contiene elementos = " + !persona.isEmpty());
        persona.put(null, "1234"); //Solo acepta un null por estructura, no acepta más
        persona.put(null, "12345");
        persona.put("nombre", "John"); //Agregamos un valor al hashmap
        persona.put("apellido", "Doe");
        //persona.put("apellido", "Roe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //String apellidoPaterno = persona.remove("apellidoPaterno");
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("Eliminado " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("john.doe@email.com");
        System.out.println("b2 = " + b2);
        System.out.println("=====================================================");
        Collection<String> valores = persona.values();
        for (String valor : valores){
            System.out.println("valor = " + valor);
        }
        System.out.println("=====================================================");
        Set<String> llaves = persona.keySet(); //Obtenemos un set con los valores de las llaves
        for (String llave : llaves){
            System.out.println("llave = " + llave);
        }
        System.out.println("===================================================== entrySet");
        for(Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }
        System.out.println("===================================================== keySet");
        for (String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("===================================================== forEach");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos = " + !persona.isEmpty());
        boolean b3 = persona.replace("nombre", "John", "Oscar");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);
    }
}
