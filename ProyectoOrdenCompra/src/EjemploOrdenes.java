import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra ordenCompra1 = new OrdenCompra("Primera orden");
        ordenCompra1.setCliente(new Cliente("Oscar", "Trujillo"));
        ordenCompra1.setFecha(new Date());
        ordenCompra1.addProducto(new Producto("Apple", "iPhone 14 Plus", 30000));
        ordenCompra1.addProducto(new Producto("Apple", "iPhone 13 Plus", 30000));
        ordenCompra1.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));
        ordenCompra1.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));

        OrdenCompra ordenCompra2 = new OrdenCompra("Primera orden");
        ordenCompra2.setCliente(new Cliente("Oscar", "Trujillo"));
        ordenCompra2.setFecha(new Date());
        ordenCompra2.addProducto(new Producto("Apple", "iPhone 14 Plus", 30000));
        ordenCompra2.addProducto(new Producto("Apple", "iPhone 13 Plus", 30000));
        ordenCompra2.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));
        ordenCompra2.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));

        OrdenCompra ordenCompra3 = new OrdenCompra("Primera orden");
        ordenCompra3.setCliente(new Cliente("Oscar", "Trujillo"));
        ordenCompra3.setFecha(new Date());
        ordenCompra3.addProducto(new Producto("Apple", "iPhone 14 Plus", 30000));
        ordenCompra3.addProducto(new Producto("Apple", "iPhone 13 Plus", 30000));
        ordenCompra3.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));
        ordenCompra3.addProducto(new Producto("Apple", "iPhone 12 Plus", 30000));
    }
}
