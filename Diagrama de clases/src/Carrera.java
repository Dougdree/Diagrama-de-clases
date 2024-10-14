public class Carrera {
    private String nombreCarrera;
    private String duracion;

    public Carrera(String nombreCarrera, String duracion) {
        this.nombreCarrera = nombreCarrera;
        this.duracion = duracion;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}

