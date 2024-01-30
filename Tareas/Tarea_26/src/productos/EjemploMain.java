package productos;

import java.util.List;

public class EjemploMain {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> frutaBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> lacteoBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> limpiezaBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> noPerecibleBolsaSupermercado = new BolsaSupermercado<>();

        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 12.00, 1.0, "Roja"));
        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 12.00, 1.0, "Roja"));
        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 12.00, 1.0, "Roja"));
        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 12.00, 1.0, "Roja"));
        frutaBolsaSupermercado.addProducto(new Fruta("Manzana", 12.00, 1.0, "Roja"));

        lacteoBolsaSupermercado.addProducto(new Lacteo("Yogurt Griego", 30.0, 1, 20));
        lacteoBolsaSupermercado.addProducto(new Lacteo("Yogurt Griego", 30.0, 1, 20));
        lacteoBolsaSupermercado.addProducto(new Lacteo("Yogurt Griego", 30.0, 1, 20));
        lacteoBolsaSupermercado.addProducto(new Lacteo("Yogurt Griego", 30.0, 1, 20));
        lacteoBolsaSupermercado.addProducto(new Lacteo("Yogurt Griego", 30.0, 1, 20));

        limpiezaBolsaSupermercado.addProducto(new Limpieza("Jabon", 20.0, "Jabon", 2.0));
        limpiezaBolsaSupermercado.addProducto(new Limpieza("Jabon", 20.0, "Jabon", 2.0));
        limpiezaBolsaSupermercado.addProducto(new Limpieza("Jabon", 20.0, "Jabon", 2.0));
        limpiezaBolsaSupermercado.addProducto(new Limpieza("Jabon", 20.0, "Jabon", 2.0));
        limpiezaBolsaSupermercado.addProducto(new Limpieza("Jabon", 20.0, "Jabon", 2.0));

        noPerecibleBolsaSupermercado.addProducto(new NoPerecible("Cafe", 60.0, 1, 100));
        noPerecibleBolsaSupermercado.addProducto(new NoPerecible("Cafe", 60.0, 1, 100));
        noPerecibleBolsaSupermercado.addProducto(new NoPerecible("Cafe", 60.0, 1, 100));
        noPerecibleBolsaSupermercado.addProducto(new NoPerecible("Cafe", 60.0, 1, 100));
        noPerecibleBolsaSupermercado.addProducto(new NoPerecible("Cafe", 60.0, 1, 100));

        List<Fruta> frutas = frutaBolsaSupermercado.getProductos();
        frutas.forEach(System.out::println);

        List<Lacteo> lacteos = lacteoBolsaSupermercado.getProductos();
        lacteos.forEach(System.out::println);

        List<Limpieza> limpiezas = limpiezaBolsaSupermercado.getProductos();
        limpiezas.forEach(System.out::println);

        List<NoPerecible> noPerecibles = noPerecibleBolsaSupermercado.getProductos();
        noPerecibles.forEach(System.out::println);
    }
}