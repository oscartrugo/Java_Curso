package Tarea12;

import java.util.Scanner;

public class AreaDeUnCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de un círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("area = " + area);
    }
}

/*
* Pedir el radio de un círculo y calcular su área.

utilizar la formula:

area = PI*r² (Constante PI multiplicado por el radio al cuadrado).



Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien, luego publica tu código de la clase main por esta vía.

Preguntas de esta tarea
Cuál es el código de tu clase main con la solución de la tarea
* */
