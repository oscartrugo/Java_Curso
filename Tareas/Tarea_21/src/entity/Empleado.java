package entity;

public class Empleado extends Persona{

    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }
    public int getEmpleadoId() {
        return empleadoId;
    }

    public Double aumentarRemuneracion(int porcentaje){
        return (remuneracion + (remuneracion * (porcentaje/100)));
    }

    @Override
    public String toString() {
        return super.toString() + ". Soy un empleado con remuneracion " + remuneracion +
                ", mi empleadoId es " + empleadoId;
    }
}
