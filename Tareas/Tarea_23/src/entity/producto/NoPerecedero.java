package entity.producto;

public class NoPerecedero extends Producto{
    private int contenido;
    private int calorias;

    public NoPerecedero(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenido = " + contenido +
                ", Calorias = " + calorias;
    }
}