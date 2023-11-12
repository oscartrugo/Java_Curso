package Tarea11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //Formato de la fecha
        long edad;
        Date fechaNacimiento;
        Date fechaActual = new Date();

        System.out.println("Ingrese la fecha de nacimiento con formato 'yyyy-MM-dd': ");

        try {
            fechaNacimiento = format.parse(sc.next());
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
            System.out.println("edad = " + edad + " años.");
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
/*
* Este programa calcula la edad actual de una persona dada la fecha de nacimiento.
* Compara la fecha dada por el usuario y la actual, determinando los años entre ambos rangos.
* */
