public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("programación java");
        boolean esIgual = curso == curso2; //Compara que los objetos sean iguales
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //Compara los valores de los objetos
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";

        esIgual = curso == curso3; //Como ambos se crean de forma literal y comparten el mismo valor, se utiliza el mismo objeto para ambos en vez de crear nuevas instancias
        System.out.println("curso == curso3 = " + esIgual);
    }
}
