public class TvLcd extends Electronico{
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "TvLcd{" +
                "fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", pulgadas=" + pulgadas +
                '}';
    }
}