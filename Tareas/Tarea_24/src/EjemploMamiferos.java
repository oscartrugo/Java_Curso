public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero guepardo = new Guepardo("Selva", 0.0f, 0.0f, 0.0f, "Guepardo", 1.0f, 10);
        Mamifero leon = new Leon("Selva", 120.00f, 150.00f, 150.00f, "Leon",
                150.00f, 15, 7, 180.00f);
        Mamifero lobo = new Lobo("Bosque", 60.00f, 90.00f, 60.00f, "Lobo",
                "Gris", 15.00f, 5);
        Mamifero perro = new Perro("Casa", 20.00f, 40.00f, 10.00f, "Perro", "Gris",
                5, 15);
        Mamifero tigre = new Tigre("Selva", 50.00f, 120.00f, 100.00f, "Tigre", 80.00f,
                100, "Tigre blanco");

        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = guepardo;
        mamiferos[1] = leon;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigre;

        for (Mamifero animal: mamiferos){
            animal.comer();
        }

        for (Mamifero animal: mamiferos){
            animal.correr();
        }

        for (Mamifero animal: mamiferos){
            animal.comunicarse();
        }

        for (Mamifero animal: mamiferos){
            animal.dormir();
        }
    }
}
