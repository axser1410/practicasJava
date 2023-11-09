package nov_08_listasEquipoPartido;

public class NodoE2 {
	private Equipo b;
	private NodoP enlP;
	public Equipo getB() {
		return b;
	}
	public void setB(Equipo b) {
		this.b = b;
	}
	public NodoP getEnlP() {
		return enlP;
	}
	public void setEnlP(NodoP enlP) {
		this.enlP = enlP;
	}
	public NodoE2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodoE2(Equipo b, NodoP enlP) {
		super();
		this.b = b;
		this.enlP = enlP;
	}
	
}
