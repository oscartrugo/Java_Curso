package bucleForEach;

public class Test {
    public static void main(String[] args) {

        String nombres[] = new String[3];
        nombres[0] = "Oscar";
        nombres[1] = "Diana";
        nombres[2] = "Monse";

        int edades[] = new int[3];
        edades[0] = 25;
        edades[1] = 24;
        edades[2] = 21;

        for(String nombre : nombres){
            System.out.println(nombre);
            for (int edad : edades) {
                System.out.println(edad);
            }
        }
    }
}
