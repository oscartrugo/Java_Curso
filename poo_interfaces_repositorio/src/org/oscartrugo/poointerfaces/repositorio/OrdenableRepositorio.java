package org.oscartrugo.poointerfaces.repositorio;

import org.oscartrugo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
