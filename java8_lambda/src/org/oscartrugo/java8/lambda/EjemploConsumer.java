package org.oscartrugo.java8.lambda;

import org.oscartrugo.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");

        consumidorBi.accept("Oscar", 25);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo");

        List<String> nombres = Arrays.asList("Oscar", "Pepe", "Luz", "Paco");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "Oscar");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () ->  "Hola mundo lambda supplier";

        System.out.println(proveedor.get());
    }

}
