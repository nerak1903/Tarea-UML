package tareauml;

/**
 * 
 * @author madrid
 */
public class Modulo {

    protected String nombre;

    protected String contenidos;

    protected int numHoras;

    protected Alumno[] alumnado;

    protected Profesor[] claustro;

    protected Examen pruebaExamen;

    protected Tarea pruebaTarea;

    public void matricularAlumno() {
    }

    public void contratarProfesor() {
    }

    public void evaluarAlumno() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contenidos
     */
    public String getContenidos() {
        return contenidos;
    }

    /**
     * @param contenidos the contenidos to set
     */
    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }

    /**
     * @return the numHoras
     */
    public int getNumHoras() {
        return numHoras;
    }

    /**
     * @param numHoras the numHoras to set
     */
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    /**
     * @return the alumnado
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaExamen
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     * @param pruebaExamen the pruebaExamen to set
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }
}
