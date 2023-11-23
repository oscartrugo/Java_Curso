public class Leon extends Felino {
    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamano, int velocidad,
                int numeroManada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamano, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }


    @Override
    public void comer() {
        System.out.println("El León, como buen rey de la selva, come junto a su mandada de "+ numeroManada +" leones-");
    }

    @Override
    public void dormir() {
        System.out.println("El León duerme en la cueva.");
    }

    @Override
    public void correr() {
        System.out.println("El León corre para atrapar a sus presas.");
    }

    @Override
    public void comunicarse() {
        System.out.println("El León se comunica con el resto de la selva mediante su feroz rugido de "+ potenciaRugido +" decibeles.");
    }
}
