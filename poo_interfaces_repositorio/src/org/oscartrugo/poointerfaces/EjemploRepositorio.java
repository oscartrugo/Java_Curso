package org.oscartrugo.poointerfaces;

import org.oscartrugo.poointerfaces.modelo.Cliente;
import org.oscartrugo.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Oscar", "Trujillo"));
        repo.crear(new Cliente("Diana", "Colin"));
        repo.crear(new Cliente("Ana", "Barbosa"));
        repo.crear(new Cliente("Kirk", "Carrillo"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("======= paginable =======");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("======= ordenar =======");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
        for (Cliente cliente: clientes){
            System.out.println(cliente);
        }

        System.out.println("======= editar =======");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        ((OrdenableRepositorio)repo)
                .listar("apellido", Direccion.DESC).forEach(System.out::println);

        System.out.println("======= eliminar =======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
    }
}
