package nov_08_listasEquipoPartido;

public class Equipo {
	private String nombre;
	private int nroJT;
	private int nroJS;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroJT() {
		return nroJT;
	}
	public void setNroJT(int nroJT) {
		this.nroJT = nroJT;
	}
	public int getNroJS() {
		return nroJS;
	}
	public void setNroJS(int nroJS) {
		this.nroJS = nroJS;
	}
	public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipo(String nombre, int nroJT, int nroJS) {
		super();
		this.nombre = nombre;
		this.nroJT = nroJT;
		this.nroJS = nroJS;
	}
	
	public void mostrar() {
		System.out.println("<"+nombre+" "+nroJT+" "+nroJS+">");
	}
	
}
