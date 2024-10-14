public class Estudiante extends Persona {
    public Estudiante(int cedula, String fechaDeNacimiento) {
        super(cedula, fechaDeNacimiento);
    }

    public String estudiar() {
        return "El estudiante está estudiando.";
    }
}
