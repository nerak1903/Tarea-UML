package tareauml;

/**
 * 
 * @author madrid
 */
public class Pregunta {

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuesta
     */
    public String[] getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the respuestaValida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    protected String enunciado;

    protected String[] respuesta;

    protected int respuestaValida;
}
