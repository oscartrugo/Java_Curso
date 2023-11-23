import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[4];

        productos[0] = new Libro(300, new Date(), "Oscar Trujillo", "Libro uno", "Gandhi");
        productos[1] = new Comics(250, new Date(), "Ryan Gosling", "Drive", "Warner", "Driver");
        productos[2] = new TvLcd(8000, "Samsung", 50);
        productos[3] = new IPhone(15000, "Apple", "Negro", "15");

        for (IProducto producto: productos){
            System.out.println(producto);
        }
    }
}
