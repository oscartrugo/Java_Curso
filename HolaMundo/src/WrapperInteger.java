public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //Boxing
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        //Convertir objeto de referencia (Wrapper) a primitivo
        int num = intObjeto; //Automática implícita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //Forma explícita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);



    }
}
