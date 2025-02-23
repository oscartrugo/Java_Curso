import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tarea31 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Stream<Integer> numbersStream = Arrays
                .stream(numbers)
                .boxed();
        List<Integer> dividedBy10 = numbersStream
                .filter(n -> n % 10 != 0)
                .toList();
        Stream<Double> mappedToDouble = dividedBy10.stream()
                .mapToDouble(Integer::doubleValue)
                .boxed();
        List<Double> dividedDoubleBy2 = mappedToDouble
                .map(n -> n/2)
                .toList();
        Double sum = dividedDoubleBy2.stream()
                .reduce(0.0, Double::sum);
        System.out.println(sum);
    }
}


/*
* Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int,
* utilizando el api stream se pide eliminar los divisibles en 10,
* luego convertir los elementos restante del flujo en tipo double y dividirlos en 2,
* para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
* El resultado debería ser 2250.0
* */