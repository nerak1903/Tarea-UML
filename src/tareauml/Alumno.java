package tareauml;

/**
 * 
 * @author madrid
 */
public class Alumno extends Persona {

    /**
     * @return the notaMedia
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }

    protected double notaMedia;

    protected Modulo[] matricula;

    /*
     * Cuando un alumno o alumna finaliza el ciclo se emite un certificado de
     * competencias a su nombre donde aparece la descripción de las competencias
     * que forman el ciclo y la nota media obtenida. Si un alumno o alumna no
     * termina de cursar el ciclo completo puede pedir un certificado que
     * acredite las competencias que sí tenga adquiridas.
     */
    public void emitirCertificado() {

    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }
}
