abstract public class Felino extends Mamifero{
    private float tamano;
    private int velocidad;


    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamano, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamano = tamano;
        this.velocidad = velocidad;
    }

    public float getTamano() {
        return tamano;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
