package org.otrujillo.appfacturas;

import org.otrujillo.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRfc("VFLNKDFL");
        cliente.setNombre("Oscar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura:");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            nombre = scanner.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            scanner.nextLine();
        }

        System.out.println(factura.generarDetalle());
    }
}
