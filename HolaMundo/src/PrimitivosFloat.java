public class PrimitivosFloat {


    public static void main(String[] args) {
        float realFloat = 1.5e-2f; //0.00000000015f //2.12e3f; //2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("Valor máximo para float = " + Float.MAX_VALUE);
        System.out.println("Valor mínimo para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("Valor máximo para double = " + Double.MAX_VALUE);
        System.out.println("Valor mínimo para double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
