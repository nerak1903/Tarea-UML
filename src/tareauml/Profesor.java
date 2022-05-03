package tareauml;

/**
 * 
 * @author madrid
 */
public class Profesor extends Persona {

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the asigImparte
     */
    public Modulo[] getAsigImparte() {
        return asigImparte;
    }

    /**
     * @param asigImparte the asigImparte to set
     */
    public void setAsigImparte(Modulo[] asigImparte) {
        this.asigImparte = asigImparte;
    }

    protected String NRP;

    protected Modulo[] asigImparte;

    public void anadirModulo() {
    }

    public void setNRP() {
    }
}
