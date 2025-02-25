package org.oscartrugo.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            //private int contador = 3;

            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                System.out.println("Valor actual de i: " + i);
                if (i > 0) {
                    toolkit.beep(); //Emite un sonido cada vez que se ejecuta
                    System.out.println("Tarea " + i + " periódica en: " + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());
                    //contador--;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        }, 0, 10000);
        System.out.println("Agendamos una tarea inmediata que se repite cada 5 segundos...");
    }
}
