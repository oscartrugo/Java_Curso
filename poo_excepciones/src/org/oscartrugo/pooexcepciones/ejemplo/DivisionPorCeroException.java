package org.oscartrugo.pooexcepciones.ejemplo;

public class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
