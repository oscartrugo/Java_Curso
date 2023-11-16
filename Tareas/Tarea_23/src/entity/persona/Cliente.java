package entity.persona;

public class Cliente extends Persona{

    private String idCliente;

    public Cliente(String nombre, String apellido, String dni, String telefono, String email, int edad, String idCliente) {
        super(nombre, apellido, dni, telefono, email, edad);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Id Cliente = " + idCliente;
    }
}