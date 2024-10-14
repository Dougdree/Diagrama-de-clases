public class Persona {
    private int cedula;
    private String fechaDeNacimiento;

    public Persona(int cedula, String fechaDeNacimiento) {
        this.cedula = cedula;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
