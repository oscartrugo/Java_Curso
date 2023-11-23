public class Lobo extends Canino {
    private int numeroCamada;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
                float tamanoColmillos, int numeroCamada) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
    }

    @Override
    public void comer() {
        System.out.println("El Lobo come junto a su camada de " + numeroCamada + " lobos.");
    }

    @Override
    public void dormir() {
        System.out.println("Como buen cazador, el Lobo duerme durante el día para poder cazar en la noche.");
    }

    @Override
    public void correr() {
        System.out.println("Cuando ve que su presa no tiene escapatoria, el Lobo corre hacia ella.");
    }

    @Override
    public void comunicarse() {
        System.out.println("El Lobo se comunica con el resto de la manada.");
    }
}
