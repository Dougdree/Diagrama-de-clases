public class Horario {
    private int horaEntrada;
    private int horaSalida;
    private String diasDeClase;

    public Horario(int horaEntrada, int horaSalida, String diasDeClase) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.diasDeClase = diasDeClase;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDiasDeClase() {
        return diasDeClase;
    }

    public void setDiasDeClase(String diasDeClase) {
        this.diasDeClase = diasDeClase;
    }
}

