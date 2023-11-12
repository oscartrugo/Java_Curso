public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza"); //Objeto "subaru"
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);

        Rueda[] ruedasSub = new Rueda[5];
        for(int i=0; i<ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazada", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL)); //Objeto "mazda"
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque(50));
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);

        Rueda[] ruedasMaz = new Rueda[5];
        for (int j = 0; j< ruedasMaz.length; j++){
            mazda.addRueda(new Rueda("Michellin", 18, 10.5));
        }

        Persona beatriz = new Persona("Beatriz", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL), new Tanque(50));
        nissan.setConductor(beatriz);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(3.5, TipoMotor.DIESEL), new Tanque(50));
        nissan2.setConductor(lalo);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        //nissan2.setRuedas(ruedasNissan2);
        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int l=0; l< ruedasNissan2.length; l++){
            nissan2.addRueda(new Rueda("Pirelli", 20, 11.5));
        }


        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
/*
        System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas Subaru");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", anch: " + r.getAncho());
        }*/
    }
}
