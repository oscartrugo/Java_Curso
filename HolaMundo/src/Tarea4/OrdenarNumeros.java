package Tarea4;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int a, b, numeroMayor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        a=sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b=sc.nextInt();

        numeroMayor = a > b ? a : b;
        //numeroMayor = Math.max(a, b);

        String resultado = (a > b) ? a + " y " + b : b + " y " + a;
        System.out.println("El orden es: " + resultado);

        System.out.println("El número mayor es "+numeroMayor);
    }
}
