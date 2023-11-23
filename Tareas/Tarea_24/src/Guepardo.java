public class Guepardo extends Felino{
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamano, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamano, velocidad);
    }

    @Override
    public void comer() {
        System.out.println("El guepardo come un festín.");
    }

    @Override
    public void dormir() {
        System.out.println("El guepardo duerme durante la noche.");
    }

    @Override
    public void correr() {
        System.out.println("El guepardo corre para cazar a su presa.");
    }

    @Override
    public void comunicarse() {
        System.out.println("El guepardo se comunica con el resto de la manada.");
    }
}
