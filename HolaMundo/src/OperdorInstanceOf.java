public class OperdorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String... qué tal!";

        Integer num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo integer = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);
    }
}
