package org.oscartrugo.poointerfaces;

import org.oscartrugo.poointerfaces.modelo.Cliente;
import org.oscartrugo.poointerfaces.modelo.Producto;
import org.oscartrugo.poointerfaces.repositorio.Direccion;
import org.oscartrugo.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.oscartrugo.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.oscartrugo.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.oscartrugo.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) throws AccesoDatoException {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50.53));
        repo.crear(new Producto("Silla", 18));
        repo.crear(new Producto("Lámpara", 15.5));
        repo.crear(new Producto("Notebook", 400.89));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);
        System.out.println("======= paginable =======");
        List<Producto> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("======= ordenar =======");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.DESC);
        for (Producto producto: productosOrdenAsc){
            System.out.println(producto);
        }

        System.out.println("======= editar =======");
        Producto lamparaActualizar = new Producto("Lampara escritorio", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);
        System.out.println("=======================");
        repo.listar("precio", Direccion.ASC).forEach(System.out::println);

        System.out.println("======= eliminar =======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("======= Total =======");
        System.out.println("Total registros: " + repo.total());
    }
}
