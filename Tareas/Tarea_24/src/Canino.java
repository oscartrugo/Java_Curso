abstract public class Canino extends Mamifero {

    private String color;
    private float tamanoColmillos;


    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
