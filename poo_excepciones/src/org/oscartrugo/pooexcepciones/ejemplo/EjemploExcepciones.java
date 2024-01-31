package org.oscartrugo.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double division2 = calculadora.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }catch (DivisionPorCeroException e){
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + e.getMessage());
            main(args);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detectó una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin.");
        }
        System.out.println("Continuamos con el flujo de la aplicación.");
    }
}