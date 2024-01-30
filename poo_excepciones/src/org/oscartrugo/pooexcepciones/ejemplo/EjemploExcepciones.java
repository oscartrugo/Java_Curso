package org.oscartrugo.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        }catch (NumberFormatException e){
            System.out.println("Se detectó una excepción: ingrese un valor numérico: " + e.getMessage());
            main(args);
        }catch (ArithmeticException e){
            System.out.println("Ocurrió un error al dividir 10/0: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin.");
        }
        System.out.println("Continuamos con el flujo de la aplicación.");
    }
}