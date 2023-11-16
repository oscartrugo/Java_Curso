package entity.venta;

import entity.persona.Cliente;
import entity.persona.Vendedor;
import entity.producto.Producto;

import java.util.List;

public class Venta {

    private List<Producto> productos;
    private Cliente cliente;
    private Vendedor vendedor;
    private String idVenta;
    private double total;
    private String fecha;

    public Venta(List<Producto> productos, Cliente cliente, Vendedor vendedor, String idVenta, double total, String fecha) {
        this.productos = productos;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.idVenta = idVenta;
        this.total = total;
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public double getTotal() {
        return total;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Productos = " + productos +
                "\n cliente=" + cliente +
                "\n vendedor=" + vendedor +
                "\n idVenta='" + idVenta + '\'' +
                "\n total=" + total +
                "\n fecha=" + fecha;
    }
}