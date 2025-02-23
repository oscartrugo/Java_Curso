import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {25, 10, 40, 5, 30};
        obtenerNumeroMayor(numeros);
    }

    public static void obtenerNumeroMayor(int[] numeros) {
        Function<int[], OptionalInt> encontrarMaximo =
                arr -> Arrays.stream(arr).reduce(Integer::max);

        OptionalInt numeroMayor = encontrarMaximo.apply(numeros);
        System.out.println(numeroMayor.isPresent() ? numeroMayor.getAsInt() : -1);
    }
}



/*
* El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando programación funcional,
* implementando la expresión lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.
* */