import entity.persona.Cliente;
import entity.persona.Vendedor;
import entity.producto.NoPerecedero;
import entity.producto.Perecedero;
import entity.producto.Producto;
import entity.venta.Venta;

import java.util.ArrayList;
import java.util.List;

public class EjemploAlmacen {
    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor("Ryan", "Gosling", "001", "555-145-0100",
                "ryan@gmail.com", 45, "1001", 1500.00, 7, 14,
                240, 310);

        Vendedor vendedor2 = new Vendedor("Tom", "Hardy", "002", "555-275-0150",
                "tom@gmail.com", 47, "1002", 1500.00, 3, 17,
                220, 307);

        Cliente cliente = new Cliente("Jesse", "Pinkman", "9600", "555-175-245",
                "jesse@gmail.com", 30, "5001");

        List<Producto> productos = new ArrayList<>();
        productos.add((new Perecedero("Chuleta", 45.00, "20/11/2023")));
        productos.add(new NoPerecedero("Arroz", 20.00, 300, 500));

        Venta venta1 = new Venta(productos, cliente, vendedor1, "V1002", 150.00, "16/11/2023");
        Venta venta2 = new Venta(productos, cliente, vendedor2, "V1003", 300.00, "17/11/2023");

        Venta[] ventas = new Venta[2];
        ventas[0] = venta1;
        ventas[1] = venta2;

        for (Venta venta : ventas){
            System.out.println(venta);
        }

    }
}
