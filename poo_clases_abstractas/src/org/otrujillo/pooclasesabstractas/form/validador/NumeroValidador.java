package org.otrujillo.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "El campo debe ser número";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor); //Validamos que se pueda convertir a entero.
            return true;
        }catch (NumberFormatException exception){
            return false;
        }
    }
}
