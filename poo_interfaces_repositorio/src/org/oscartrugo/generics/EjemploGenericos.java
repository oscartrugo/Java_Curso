package org.oscartrugo.generics;

import org.oscartrugo.poointerfaces.modelo.Cliente;
import org.oscartrugo.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Oscar", "Trujillo"));

        Cliente oscar = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"),
                new Cliente("Oscar", "Trujillo")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Oscar", "Pepe", "Luci", "Bea", "John"},
                enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});
    }

    public static <T> List<T> fromArrayToList(T[] c){ //Convierte arreglo a  lista
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){ //Convierte arreglo a  lista
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] clientes){ //Convierte arreglo a  lista
        return Arrays.asList(clientes);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){ //Convierte arreglo a  lista
        for (G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
