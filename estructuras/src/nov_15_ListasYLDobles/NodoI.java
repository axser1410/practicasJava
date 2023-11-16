package nov_15_ListasYLDobles;

public class NodoI {
    private int ci;
    private String asistio;
    private NodoI sig;

    NodoI() {
        sig = null;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getAsistio() {
        return asistio;
    }

    public void setAsistio(String asistio) {
        this.asistio = asistio;
    }

    public NodoI getSig() {
        return sig;
    }

    public void setSig(NodoI sig) {
        this.sig = sig;
    }
    
    
}
