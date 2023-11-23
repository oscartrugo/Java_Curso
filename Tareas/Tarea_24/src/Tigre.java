public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamano, int velocidad,
                 String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamano, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public void comer() {
        System.out.println("El Tigre come junto a sus crías.");
    }

    @Override
    public void dormir() {
        System.out.println("El Tigre duerme, en especial los de la especie " + especieTigre);
    }

    @Override
    public void correr() {
        System.out.println("El Tigre corre para desestresarse.");
    }

    @Override
    public void comunicarse() {
        System.out.println("El Tigre ruge para poder comunicarse.");
    }
}
