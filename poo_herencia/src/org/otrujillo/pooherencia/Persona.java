package org.otrujillo.pooherencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(){
        System.out.println("Persona: Inicializando constructor...");
    }

    public Persona(String nombre, String apellido){ //Constructor con 2 parámetros
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String persona, int edad){
        this(nombre, persona); //Sobrecarga de constructores
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }
}
