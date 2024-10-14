public class Main {
    public static void main(String[] args) {
        // Crear un docente
        Docente docente = new Docente(12345678, "1980-05-20", "Michu Ruiz");

        // Crear una asignatura impartida por el docente
        Asignatura asignatura = new Asignatura("Matemáticas");

        // Crear un horario para la asignatura
        Horario horario = new Horario(8, 10, "Lunes, Miércoles, Viernes");

        // Crear un estudiante
        Estudiante estudiante = new Estudiante(87654321, "2000-01-15");

        // Crear una carrera
        Carrera carrera = new Carrera("Ingeniería de Computacion", "5 años");

        // Crear un ciclo
        Ciclo ciclo = new Ciclo(1, 5);

        // Crear una matrícula para el estudiante en la asignatura
        Matricula matricula = new Matricula(1);

        // Mostrar los datos de los objetos creados
        System.out.println("Datos del Docente:");
        System.out.println("Cédula: " + docente.getCedula());
        System.out.println("Fecha de Nacimiento: " + docente.getFechaDeNacimiento());
        System.out.println("Nombre: " + docente.getNombreDocente());

        System.out.println("\nDatos del Estudiante:");
        System.out.println("Cédula: " + estudiante.getCedula());
        System.out.println("Fecha de Nacimiento: " + estudiante.getFechaDeNacimiento());

        System.out.println("\nDatos de la Carrera:");
        System.out.println("Nombre: " + carrera.getNombreCarrera());
        System.out.println("Duración: " + carrera.getDuracion());

        System.out.println("\nDatos del Ciclo:");
        System.out.println("Número de Ciclo: " + ciclo.getNumero());
        System.out.println("Número de Asignaturas: " + ciclo.getNumeroAsignaturas());

        System.out.println("\nDatos de la Asignatura:");
        System.out.println("Nombre: " + asignatura.getNombreAsignatura());

        System.out.println("\nDatos del Horario:");
        System.out.println("Hora de Entrada: " + horario.getHoraEntrada() + "hrs");
        System.out.println("Hora de Salida: " + horario.getHoraSalida() + "hrs");
        System.out.println("Días de Clase: " + horario.getDiasDeClase());

        System.out.println("\nDatos de la Matrícula:");
        System.out.println("Número de Matrícula: " + matricula.getNumeroMatricula());
        System.out.println("Costo de la Matrícula: $" + matricula.cobroMatricula(matricula.getNumeroMatricula()));
    }
}
