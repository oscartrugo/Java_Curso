package entity.producto;

public class Perecedero extends Producto{
    private String fechaCaducidad;

    public Perecedero(String nombre, Double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de caducidad = " + fechaCaducidad;
    }
}
