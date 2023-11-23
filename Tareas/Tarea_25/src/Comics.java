import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return super.toString() + "Comics{" +
                "personaje='" + personaje + '\'' +
                ", precio=" + precio +
                '}';
    }
}