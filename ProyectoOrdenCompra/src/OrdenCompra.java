import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto productos[];

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){

    }

    public int granTotal(){
        return productos[0].precio + productos[1].precio + productos[2].precio + productos[3].precio;
    }
}
