package org.oscartrugo.hilos.ejemplosync;

import org.oscartrugo.hilos.ejemplosync.runnable.Consumidor;
import org.oscartrugo.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        new Thread(new Panadero(panaderia)).start();
        new Thread(new Consumidor(panaderia)).start();
    }
}
