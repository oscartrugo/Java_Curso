import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] productos){
        int total2 = productos.length;
        int total = productos.length;

        for (int i = 0; i<total2; i++){ //Imprime a la inversa
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

  //      String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64gb","Samsung Galaxy","Disco duro SSD Samsung Externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta generación","Bicicleta Oxford"};

        int total = productos.length;

        int contador = 0;
        for (int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i]; //Intercambiamos las posiciones
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        //Arrays.sort(productos);
        //arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("====== Usando For ======");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + ": " + productos[i] );
        }


        System.out.println("====== Usando For ======");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + ": " + productos[i] );
        }

    }
}
