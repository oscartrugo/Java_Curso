package entity.persona;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private int edad;

    public Persona(String nombre, String apellido, String dni, String telefono, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre = '" + nombre + '\'' +
                ", Apellido = '" + apellido + '\'' +
                ", Dni = '" + dni + '\'' +
                ", Telefono = '" + telefono + '\'' +
                ", Email = '" + email + '\'' +
                ", Edad = " + edad;
    }
}