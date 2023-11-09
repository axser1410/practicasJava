package nov_08_listas;

public class NodoD {
	private String nombre;
	private int ci;
	private NodoD sig;
	private NodoM enl;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	public NodoM getEnl() {
		return enl;
	}
	public void setEnl(NodoM enl) {
		this.enl = enl;
	}
	public NodoD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NodoD(String nombre, int ci, NodoD sig, NodoM enl) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.sig = sig;
		this.enl = enl;
	}
	
}
