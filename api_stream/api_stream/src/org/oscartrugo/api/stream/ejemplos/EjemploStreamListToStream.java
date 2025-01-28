package org.oscartrugo.api.stream.ejemplos;

import org.oscartrugo.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Oscar", "Trujillo"));
        lista.add(new Usuario("Diana", "Colin"));
        lista.add(new Usuario("Jorge", "Saavedra"));
        lista.add(new Usuario("Ignacio", "Varga"));
        lista.add(new Usuario("Bruce", "Wayne"));
        lista.add(new Usuario("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }else{
                        return Stream.empty();
                    }
                })
                .map(String::toLowerCase) //Mapeamos los elementos a lowerCase
                .peek(System.out::println);
        System.out.println(nombres.count());
    }
}
