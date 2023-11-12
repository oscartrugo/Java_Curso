public class PasarPorValor {
    public static void main(String[] args) {
        //Toda variable primitiva se pasa por valor
        int i = 10;

        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i (se mantiene igual) = " + i);
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

}
