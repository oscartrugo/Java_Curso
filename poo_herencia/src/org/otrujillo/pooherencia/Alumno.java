package org.otrujillo.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido); //Hacemos referencia al constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad); //Invocamos al constructor del padre que pase estos 3 parámetros
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad); //Le pasamos los parámetros al padre, también podríamos utilizar this(nombre, apellido, edad)
        this.institucion = institucion; //Atributo propio de Alumno
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematica, double notaLenguaje, double notaHistoria){ //Sobrecarga grande de constructor
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar(); //Utilizando la característica incluída en la clase padre
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
        return (notaHistoria + notaLenguaje + notaMatematica)/3;
    }
}
