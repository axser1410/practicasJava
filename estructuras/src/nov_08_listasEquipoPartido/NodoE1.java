package nov_08_listasEquipoPartido;

public class NodoE1 {
	private Equipo e;
	private NodoP sig;
	private NodoE2 enl;
	
	
	public NodoE1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodoE1(Equipo e, NodoE2 enl, NodoP sig) {
		super();
		this.e = e;
		this.sig = sig;
		this.enl = enl;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	public Equipo getE() {
		return e;
	}
	public void setE(Equipo e) {
		this.e = e;
	}
	public NodoE2 getEnl() {
		return enl;
	}
	public void setEnl(NodoE2 enl) {
		this.enl = enl;
	}
}
