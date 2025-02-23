import java.util.Arrays;

public class Tarea31 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        double sum = Arrays
                .stream(numbers) //Utilizando el API stream
                .filter(n -> n % 10 != 0) //Eliminar los divisibles entre 10
                .mapToDouble(n -> (double) n / 2) //Convertir los elementos a double y dividirlos entre 2
                .reduce(0.0, Double::sum);//Devolver la suma con el operador reduce
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