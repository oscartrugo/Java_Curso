package Tarea2;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura:");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese el primer precio:");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo precio:");
        double precio2 = scanner.nextDouble();

        double totalPrecio = precio1 + precio2;

        String total = "Total antes de impuestos: " + totalPrecio;
        total += "\nTotal de impuestos: " + totalPrecio*(0.19);
        total += "\nTotal a pagar: " + (totalPrecio + (totalPrecio*0.19));

        System.out.println("Factura " + nombreFactura + "\n" + total);
    }
}
