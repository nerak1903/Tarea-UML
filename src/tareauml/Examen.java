package tareauml;

/**
 * 
 * @author madrid
 */
public class Examen {

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
     * @return the listaPreguntas
     */
    public Pregunta[] getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(Pregunta[] listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    protected String descripcion;

    protected Pregunta[] listaPreguntas;

    public void calificar() {
    }

    public void elegirPreguntas() {
    }

    public void ordenarPreguntas() {
    }
}
