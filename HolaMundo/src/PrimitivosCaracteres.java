public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040'; //Los char son solo un caracter, más de uno es un string
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter) );

        char espacio = '\u0020'; //Caracter espacio
        char retroceso = '\b'; //backspace, espacio hacia atrás o borrar un caracter
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte =" + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Valor máximo de Char: " + Character.MAX_VALUE);
        System.out.println("Valor máximo de Char: " + Character.MIN_VALUE);
    }
}
