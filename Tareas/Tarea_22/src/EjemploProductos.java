import entity.*;

public class EjemploProductos {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        Fruta fruta1 = new Fruta("Manzana", 20.00, 10.00, "Rojo");
        Fruta fruta2 = new Fruta("Aguacate", 50.00, 60.00, "Negro");

        Lacteo lacteo1 = new Lacteo("Leche", 12.00, 1, 10);
        Lacteo lacteo2 = new Lacteo("Yogurt", 10.00, 3, 15);

        Limpieza limpieza1 = new Limpieza("Escoba", 30.00, "Palo y cepillo", 0.00);
        Limpieza limpieza2 = new Limpieza("Suavizante", 40.00, "Jabon liquido", 10.00);

        NoPerecible noPerecible1 =  new NoPerecible("Pasta", 17.50, 200, 300);
        NoPerecible noPerecible2 =  new NoPerecible("Arroz", 22.00, 500, 1000);

        productos[0] = fruta1;
        productos[1] = fruta2;
        productos[2] = lacteo1;
        productos[3] = lacteo2;
        productos[4] = limpieza1;
        productos[5] = limpieza2;
        productos[6] = noPerecible1;
        productos[7] = noPerecible2;

        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}