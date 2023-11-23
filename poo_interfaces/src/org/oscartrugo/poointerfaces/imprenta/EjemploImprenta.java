package org.oscartrugo.poointerfaces.imprenta;

import org.oscartrugo.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral...", "Oscar Trujillo", "Ing. en Sistemas Computacionales");
        cv.addExperiencia("Java");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("Postgres");
        cv.addExperiencia("Spring Boot");
        cv.addExperiencia("TypScript");

        Informe informe = new Informe("Estudio sobre microservicios", "Oscar Trujillo", "Martin Flower");

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
