public class IPhone extends Electronico{
    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "IPhone{" +
                "fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}