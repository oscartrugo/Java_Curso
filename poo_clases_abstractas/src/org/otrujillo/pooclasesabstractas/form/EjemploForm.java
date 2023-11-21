package org.otrujillo.pooclasesabstractas.form;

import org.otrujillo.pooclasesabstractas.form.elementos.*;
import org.otrujillo.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("john.doe");
        password.setValor("a123bc");
        email.setValor("john.doe@gmail.com");
        edad.setValor("28");
        java.setSelected(true);
    }
}
