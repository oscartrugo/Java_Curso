package org.oscartrugo.poointerfaces.imprenta;

import org.oscartrugo.poointerfaces.imprenta.modelo.*;
import static org.oscartrugo.poointerfaces.imprenta.modelo.Genero.PROGRAMACION;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral...", new Persona("Oscar", "Trujillo"), "Ing. en Sistemas Computacionales");
        cv.addExperiencia("Java")
                .addExperiencia("JavaScript")
                .addExperiencia("Postgres")
                .addExperiencia("Spring Boot")
                .addExperiencia("TypScript");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elementos reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Oscar", "Trujillo"), new Persona("Martin", "Flower"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
