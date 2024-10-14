public class Docente extends Persona {
    private String nombreDocente;

    public Docente(int cedula, String fechaDeNacimiento, String nombreDocente) {
        super(cedula, fechaDeNacimiento);
        this.nombreDocente = nombreDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String enseñar() {
        return "El docente está enseñando.";
    }
}
