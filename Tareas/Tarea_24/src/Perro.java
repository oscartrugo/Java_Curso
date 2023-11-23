public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
                 float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public void comer() {
        System.out.println("El Perro come sus croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println("El Perro duerme en su cama.");
    }

    @Override
    public void correr() {
        System.out.println("El Perro corre a traer la pelota.");
    }

    @Override
    public void comunicarse() {
        System.out.println("El Perro ladra para comunicar que quiere ir al baño.");
    }
}
