package org.oscartrugo.hilos.ejemplos.runnable;

public class ViajeTarea implements Runnable{

    private String nombre;

    public ViajeTarea(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep((long) (1000 * Math.random())); //Recibe milisegundos en tipo Long
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalmente me voy de viaje a " + nombre);
    }
}
