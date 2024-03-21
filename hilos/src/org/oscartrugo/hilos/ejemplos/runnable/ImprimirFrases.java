package org.oscartrugo.hilos.ejemplos.runnable;

import static org.oscartrugo.hilos.ejemplos.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable {
    String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        try {
            imprimirFrases(this.frase1, this.frase2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
