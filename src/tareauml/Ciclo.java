package tareauml;

/**
 * 
 * @author madrid
 */
public class Ciclo {

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the listaCompetencias
     */
    public Competencia[] getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     * @param listaCompetencias the listaCompetencias to set
     */
    public void setListaCompetencias(Competencia[] listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }

    protected String nombre;

    protected String descripcion;

    protected int numHoras;

    protected int year;

    protected Competencia[] listaCompetencias;
}
