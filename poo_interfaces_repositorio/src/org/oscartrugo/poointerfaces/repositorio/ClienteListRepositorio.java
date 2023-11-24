package org.oscartrugo.poointerfaces.repositorio;

import org.oscartrugo.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio  {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;

        for (Cliente cliente: dataSource){
            if (cliente.getId().equals(id)){
                resultado = cliente;
                break; //Salimos del for
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return null;
    }
}
