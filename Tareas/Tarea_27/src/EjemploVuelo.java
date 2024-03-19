import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.Date;
import java.util.List;

import static java.util.Calendar.*;

public class EjemploVuelo {
    public static void main(String[] args) {
        String destino =  "Santiago";
        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933", "New York", destino, new Date(2021, AUGUST, 21, 5, 39), 62));
        vuelos.add(new Vuelo("LAR 755", "Sao Paulo", destino, new Date(2021, AUGUST, 31, 4, 45 ), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", destino, new Date(2021, AUGUST, 30, 16, 0), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", destino, new Date(2021, AUGUST, 29, 13, 22), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogotá", destino, new Date(2021, AUGUST, 31, 14, 5), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", new Date(2021, AUGUST, 31, 5, 20), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", new Date(2021, AUGUST, 30, 8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", new Date(2021, AUGUST, 29, 7, 41), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", new Date(2021, AUGUST, 30, 10, 35), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", new Date(2021, AUGUST, 29, 9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", new Date(2021, AUGUST, 31, 8, 33), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", new Date(2021, AUGUST, 31, 15, 15), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", new Date(2021, AUGUST, 30, 8, 14), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", new Date(2021, AUGUST, 29, 22, 53), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", new Date(2021, AUGUST, 31, 9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", new Date(2021, AUGUST, 31, 4, 0), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", new Date(2021, AUGUST, 29, 7, 45), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", new Date(2021,AUGUST, 30, 7, 12), 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", new Date(2021, AUGUST, 29, 18, 29), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", new Date(2021, AUGUST, 30, 15, 45), 39));

        vuelos.sort(comparing(Vuelo::getFechaLlegada)); //Ordenando por fecha de llegada
        Vuelo primerVuelo = vuelos.get(0);
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);

        System.out.println("El primer vuelo en llegar es: " + primerVuelo.getVuelo() + ": " + primerVuelo.getOrigen() + ", aterriza el " + primerVuelo.getFechaLlegada());
        System.out.println("El último vuelo en llegar es: " + ultimoVuelo.getVuelo() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFechaLlegada());

        vuelos.sort(comparing(Vuelo::getNumeroPasajeros));
        Vuelo vueloMenorPasajeros = vuelos.get(0);
        System.out.println("El vuelo con menor número de pasajeros es: " + vueloMenorPasajeros.getVuelo() + ": " + vueloMenorPasajeros.getOrigen()
                + ", con " + vueloMenorPasajeros.getNumeroPasajeros() + " pasajeros.");
    }
}