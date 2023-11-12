public class EjemploAutomovilEnum {
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
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        //Asignando datos a las propiedades del objeto
        System.out.println("mazda.Fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo Subaru: " + tipo.getNombre());
        System.out.println("Tipo Desc. Subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas.");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo.");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte de empresas.");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo.");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta.");
            case SEDAN -> System.out.println("Es un automovil mediano.");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values(); //Objeto de tipo arreglo de tipos de automovil
        for(TipoAutomovil tipoAutomovil: tipos){
            System.out.println(tipoAutomovil + " => " + tipoAutomovil.name() + ", " +
                    tipoAutomovil.getNombre() + ", " +
                    tipoAutomovil.getDescripcion() + ", " +
                    tipoAutomovil.getNumeroPuertas() + ", ");
        }

    }
}
