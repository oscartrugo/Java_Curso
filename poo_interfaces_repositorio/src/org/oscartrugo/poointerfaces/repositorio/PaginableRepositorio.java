package org.oscartrugo.poointerfaces.repositorio;

import org.oscartrugo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
