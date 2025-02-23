public class Producto {

    private Double precio;
    private Integer cantidad;

    public Producto(Double precio, Integer cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
