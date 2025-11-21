package sbc.example;

import java.util.ArrayList;
import java.util.List;

public class Recomendacion {

    private Receta receta;
    private int puntuacionFinal;
    private List<Evidencia> evidencias;

    public Recomendacion() {
        this.evidencias = new ArrayList<>();
    }

    public Recomendacion(Receta receta, int puntuacionFinal) {
        this.receta = receta;
        this.puntuacionFinal = puntuacionFinal;
        this.evidencias = new ArrayList<>(); //[]
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getPuntuacionFinal() {
        return puntuacionFinal;
    }

    public void setPuntuacionFinal(int puntuacionFinal) {
        this.puntuacionFinal = puntuacionFinal;
    }

    public List<Evidencia> getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public void addEvidencia(Evidencia evidencia) {
        this.evidencias.add(evidencia);
    }
}
