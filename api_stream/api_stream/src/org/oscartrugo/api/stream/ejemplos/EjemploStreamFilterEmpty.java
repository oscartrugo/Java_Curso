package org.oscartrugo.api.stream.ejemplos;

import org.oscartrugo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "")
                .filter(String::isEmpty) //Filtra los elementos vacíos
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);
    }
}
