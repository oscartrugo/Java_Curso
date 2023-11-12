import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza"); //Objeto "subaru"
        //Asignando datos a las propiedades del objeto
        subaru.setColor(Color.BLANCO);
        subaru.setTanque(new Tanque());
        subaru.setMotor(motorSubaru);
        subaru.setTipo(TipoAutomovil.PICKUP);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazada", "BT-50", Color.ROJO, motorMazda); //Objeto "mazda"
        //Asignando datos a las propiedades del objeto
        System.out.println("mazda.Fabricante = " + mazda.getFabricante());

        Motor motorNissan = new Motor(2.0, TipoMotor.DIESEL);
        Tanque tanqueNissan = new Tanque(45);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, tanqueNissan);

        Motor motorNissan2 = new Motor(3.0, TipoMotor.BENCINA);
        Tanque tanqueNissan2 = new Tanque(50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan2, tanqueNissan2);

        Automovil auto = new Automovil();

        Date fecha = new Date();

        System.out.println("¿Son iguales? = " + (nissan == nissan2));
        System.out.println("¿Son iguales? con equals (compara por valor, no por objeto) = " + nissan.equals(nissan2));
        System.out.println(auto.equals(nissan));
        System.out.println(auto.equals(fecha));
        System.out.println("Objeto: " + nissan);
        System.out.println("Objeto: " + nissan.toString());


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));

        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));


    }
}
