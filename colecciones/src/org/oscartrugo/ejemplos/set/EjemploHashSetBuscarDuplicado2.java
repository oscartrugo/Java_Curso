package org.oscartrugo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Atun", "Lenguado", "Pejerrey", "Corvina","Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if(!unicos.add(pez)){ //Si no se agrega el elemento al set...
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Únicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
