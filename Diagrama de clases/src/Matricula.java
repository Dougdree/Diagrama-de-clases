public class Matricula {
    private int numeroMatricula;

    public Matricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public float cobroMatricula(int numeroMatricula) {
        return 150.75f;
    }
}
