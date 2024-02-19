package org.oscartrugo.poointerfaces;

import org.oscartrugo.poointerfaces.modelo.Cliente;
import org.oscartrugo.poointerfaces.repositorio.*;
import org.oscartrugo.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Luci", "Martinez"));
            Cliente oscar = new Cliente("Oscar", "Trujillo");
            repo.crear(oscar);
            repo.crear(oscar);

            //repo.crear(null);

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("======= paginable =======");
            List<Cliente> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("======= ordenar =======");
            List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.DESC);
            for (Cliente cliente : clientesOrdenAsc) {
                System.out.println(cliente);
            }

            System.out.println("======= editar =======");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(2);
            System.out.println(bea);
            System.out.println("=======================");
            repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

            System.out.println("======= eliminar =======");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("======= Total =======");
            System.out.println("Total registros: " + repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}