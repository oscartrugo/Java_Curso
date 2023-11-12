import java.util.Date;

public class EjemploAutomovilEstatico {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru", "Impreza"); //Objeto "subaru"
        //Asignando datos a las propiedades del objeto
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda = new Automovil("Mazada", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL)); //Objeto "mazda"
        mazda.setTipo(TipoAutomovil.PICKUP);
        //mazda.setTanque(new Tanque(50));
        //Asignando datos a las propiedades del objeto
        System.out.println("mazda.Fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL), new Tanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(3.5, TipoMotor.DIESEL), new Tanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + subaru.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + mazda.calcularConsumoEstatico(300, 60));
        System.out.println("Kilómetros por litros = " + nissan.calcularConsumoEstatico(300, 60));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru descripcion = " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
