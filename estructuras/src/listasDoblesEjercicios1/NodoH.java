package listasDoblesEjercicios1;

public class NodoH {
	private Helado h;
    private NodoH ant,sig;
    
    NodoH()
    {
        ant=sig=null;
    }

    public Helado getH() {
        return h;
    }

    public void setH(Helado h) {
        this.h = h;
    }

    public NodoH getAnt() {
        return ant;
    }

    public void setAnt(NodoH ant) {
        this.ant = ant;
    }

    public NodoH getSig() {
        return sig;
    }

    public void setSig(NodoH sig) {
        this.sig = sig;
    }
}
