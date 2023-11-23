package org.oscartrugo.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {
    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public void addExperiencia(String experiencia){
        experiencias.add(experiencia);
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for(String experiencia: this.experiencias){
            sb.append("- ").append(experiencia).append("\n");
        }
        return sb.toString();
    }

}
