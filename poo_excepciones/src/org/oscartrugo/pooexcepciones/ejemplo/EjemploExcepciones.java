package org.oscartrugo.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = calculadora.dividir(10, divisor);
            System.out.println(division);
        }catch (NumberFormatException e){
            System.out.println("Se detectó una excepción: ingrese un valor numérico: " + e.getMessage());
            main(args);
        }catch (DivisionPorCeroException e){
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin.");
        }
        System.out.println("Continuamos con el flujo de la aplicación.");
    }
}