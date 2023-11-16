package entity.persona;

public class Vendedor extends Empleado{

    private int ventasSemanales;
    private int ventasMensuales;
    private int ventasAnuales;
    private int ventasTotales;

    public Vendedor(String nombre, String apellido, String dni, String telefono, String email, int edad, String idEmpleado, double salario,
                    int ventasSemanales, int ventasMensuales, int ventasAnuales, int ventasTotales) {
        super(nombre, apellido, dni, telefono, email, edad, idEmpleado, salario);
        this.ventasSemanales = ventasSemanales;
        this.ventasMensuales = ventasMensuales;
        this.ventasAnuales = ventasAnuales;
        this.ventasTotales = ventasTotales;
    }

    public int getVentasSemanales() {
        return ventasSemanales;
    }

    public int getVentasMensuales() {
        return ventasMensuales;
    }

    public int getVentasAnuales() {
        return ventasAnuales;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ventas semanales = " + ventasSemanales +
                ", Ventas mensuales= " + ventasMensuales +
                ", Ventas anuales = " + ventasAnuales +
                ", Ventas totales = " + ventasTotales;
    }
}