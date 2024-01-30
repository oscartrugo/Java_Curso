package productos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos = new ArrayList<T>();

    public void addProducto(T t){
        if (productos.size() < 5){
            productos.add(t);
        }
    }

    public List<T> getProductos(){
        return productos;
    }
}