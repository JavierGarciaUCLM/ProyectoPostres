package sbc.example;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int tiempoDisponible;
    private boolean tieneHorno;
    private String ingredientePreferido;
    private Dificultad dificultadDeseada;
    private List<String> ingredientesProhibidos;

    public Usuario() {
        this.ingredientesProhibidos = new ArrayList<>();
    }

    public int getTiempoDisponible() {
        return tiempoDisponible;
    }

    public void setTiempoDisponible(int tiempoDisponible) {
        this.tiempoDisponible = tiempoDisponible;
    }

    public boolean isTieneHorno() {
        return tieneHorno;
    }

    public void setTieneHorno(boolean tieneHorno) {
        this.tieneHorno = tieneHorno;
    }

    public String getIngredientePreferido() {
        return ingredientePreferido;
    }

    public void setIngredientePreferido(String ingredientePreferido) {
        this.ingredientePreferido = ingredientePreferido;
    }

    public Dificultad getDificultadDeseada() {
        return dificultadDeseada;
    }

    public void setDificultadDeseada(Dificultad dificultadDeseada) {
        this.dificultadDeseada = dificultadDeseada;
    }

    public List<String> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(List<String> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public void addIngredienteProhibido(String ingrediente) {
        this.ingredientesProhibidos.add(ingrediente);
    }
}
