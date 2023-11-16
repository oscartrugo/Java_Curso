package entity.persona;

public class Empleado extends Persona {

    private String idEmpleado;
    private double salario;

    public Empleado(String nombre, String apellido, String dni, String telefono, String email, int edad, String idEmpleado, double salario) {
        super(nombre, apellido, dni, telefono, email, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Id Empleado = '" + idEmpleado + '\'' +
                ", Salario = " + salario;
    }
}