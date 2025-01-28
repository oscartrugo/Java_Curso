package org.oscartrugo.api.stream.ejemplos;

import org.oscartrugo.api.stream.ejemplos.models.Factura;
import org.oscartrugo.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Perez");

        u1.addFactura(new Factura("Compras tecnologias"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        //Alternativa
        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f -> System.out.println(f.getDescripcion().concat(": cliente ")
                        .concat(f.getUsuario().toString())));
        //1ra forma
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(": cliente ")
                        .concat(f.getUsuario().toString())));
    }
}
