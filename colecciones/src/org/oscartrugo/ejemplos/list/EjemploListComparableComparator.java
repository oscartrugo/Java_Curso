package org.oscartrugo.ejemplos.list;

import org.oscartrugo.ejemplos.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 3));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));
        //Collections.sort(sa, (a, b) -> a.getNota().compareTo(b.getNota())); //Ordenamos la lista, utiliza el compareTo
        //sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        sa.sort(comparing(Alumno::getNombre).reversed());
        System.out.println(sa);

        System.out.println("Iterando utilizando Stream forEach");
        sa.forEach(System.out::println);
    }
}
