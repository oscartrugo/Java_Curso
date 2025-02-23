import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(50.0, 3));
        productos.add(new Producto(30.0, 4));
        productos.add(new Producto(10.0, 2));
        productos.add(new Producto(15.0, 5));
        productos.add(new Producto(5.0, 5));

        calcularImporte(productos);
    }

    public static void calcularImporte(List<Producto> productos) {
        double total = productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .reduce(0.0, Double::sum);
        System.out.println("Importe Total: " + total);
    }
}

/*
* El siguiente requerimiento es para una lista de productos List<Producto> ,
* de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

La clase Producto debe tener el atributo precio del tipo double y cantidad int,
* entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
* */