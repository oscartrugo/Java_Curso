package org.otrujillo.pooclasesabstractas.form.validador;

import org.otrujillo.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "El campo %s debe tener mínimo %d caracteres y máximo %d caracteres.";
    private int minimo = 0;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

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
        //this.mensaje = String.format(this.mensaje, this.minimo, this.maximo);
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return largo >= this.minimo && largo <= this.maximo;
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.minimo, this.maximo);
    }
}
