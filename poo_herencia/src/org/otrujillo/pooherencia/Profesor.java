package org.otrujillo.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido); //Esto es lo mismo a utilizar super(nombre, apellido)
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias, soy el profesor de " + getAsignatura()
                + ", mi nombre es " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nasignatura='" + asignatura;
    }
}
