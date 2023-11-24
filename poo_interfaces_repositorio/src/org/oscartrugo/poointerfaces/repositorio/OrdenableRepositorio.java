package org.oscartrugo.poointerfaces.repositorio;

import org.oscartrugo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
