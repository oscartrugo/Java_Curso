package Tarea5;

import java.util.Scanner;

public class EstanqueGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tanque; // la capacidad a ingresar

        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        tanque = scanner.nextDouble();

        if (tanque >= 0 && tanque < 20) {
            System.out.println("Insuficiente");
        } else if (tanque >= 20 && tanque < 35) {
            System.out.println("Suficiente");
        } else if (tanque >= 35 && tanque < 40) {
            System.out.println("Medio Estanque");
        } else if (tanque >= 40 && tanque < 60) {
            System.out.println("Estanque  3/4");
        } else if (tanque >= 60 && tanque < 70) {
            System.out.println("Estanque casi lleno");
        } else if (tanque == 70) {
            System.out.println("Estanque lleno");
        }
    }
}

/*
* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente
* */