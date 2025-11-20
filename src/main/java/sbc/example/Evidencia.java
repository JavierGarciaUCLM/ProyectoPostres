package sbc.example;

public class Evidencia {

    private Receta receta;
    private String mensaje;

    public Evidencia() {
    }

    public Evidencia(Receta receta, String mensaje) {
        this.receta = receta;
        this.mensaje = mensaje;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
