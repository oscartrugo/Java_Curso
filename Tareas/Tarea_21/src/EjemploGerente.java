import entity.Gerente;
import entity.Persona;

public class EjemploGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Gustavo", "Fring", "666666", "New Mexico", 100000.00, 1, 900000.00);

        imprimir(gerente);
    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
