package org.oscartrugo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina","Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (String pez: peces){
            if(!unicos.add(pez)){ //Si no se agrega el elemento al set...
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
