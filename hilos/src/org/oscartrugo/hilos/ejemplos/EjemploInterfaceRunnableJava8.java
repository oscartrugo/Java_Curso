package org.oscartrugo.hilos.ejemplos;

import org.oscartrugo.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        Runnable viaje = () -> {
                for(int i = 0; i < 10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (1000 * Math.random())); //Recibe milisegundos en tipo Long
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            };

        new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje, "Robinson Crusoe").start();
        new Thread(viaje, "Juan Fernandez").start();
        new Thread(viaje, "Isla de Chiloe").start();
    }
}
