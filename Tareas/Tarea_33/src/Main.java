import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        aplanarArreglo(lenguajes);
    }

    public static void aplanarArreglo(String[][] arreglo) {
        List<String> lenguajesFiltrados = Arrays.stream(arreglo)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(lenguajesFiltrados);
    }
}

/*
*
El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.

Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.

Por ejemplo, para el arreglo:

String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

debería quedar:

{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
    * */