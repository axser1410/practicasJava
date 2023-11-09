package nov_08_listasEquipoPartido;

public class NodoP {
	private Partido c;
	private NodoE1 ant, sig;
	private NodoE2 enl;
	
	public Partido getC() {
		return c;
	}
	public void setC(Partido c) {
		this.c = c;
	}
	public NodoE1 getAnt() {
		return ant;
	}
	public void setAnt(NodoE1 ant) {
		this.ant = ant;
	}
	public NodoE1 getSig() {
		return sig;
	}
	public void setSig(NodoE1 sig) {
		this.sig = sig;
	}
	public NodoE2 getEnl() {
		return enl;
	}
	public void setEnl(NodoE2 enl) {
		this.enl = enl;
	}
	public NodoP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodoP(Partido c, NodoE1 ant, NodoE1 sig, NodoE2 enl) {
		super();
		this.c = c;
		this.ant = ant;
		this.sig = sig;
		this.enl = enl;
	}
	
}
