package sbc.example;

public class RecetaPuntuada {

    private Receta receta;
    private int puntuacion;
    private int coincidencias;

    public RecetaPuntuada() {
    }

    public RecetaPuntuada(Receta receta) {
        this.receta = receta;
        this.puntuacion = 0;
        this.coincidencias = 0;//inicializo todas a 0
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    public void addPuntos(int puntos) {
        this.puntuacion += puntos;
    }

    public void incrementarCoincidencias() {
        this.coincidencias++;
    }

    @Override
    public String toString() {
        return "RecetaPuntuada{" +
                "receta=" + (receta != null ? receta.getNombre() : "null") +
                ", puntuacion=" + puntuacion +
                ", coincidencias=" + coincidencias +
                '}';
    }
}
