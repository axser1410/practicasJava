package nov_08_listasEquipoPartido;

public class Partido {
	private String fecha, hora;
	int nroGE1, nroGE2;
	public Partido(String fecha, String hora, int nroGE1, int nroGE2) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.nroGE1 = nroGE1;
		this.nroGE2 = nroGE2;
	}
	public Partido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getNroGE1() {
		return nroGE1;
	}
	public void setNroGE1(int nroGE1) {
		this.nroGE1 = nroGE1;
	}
	public int getNroGE2() {
		return nroGE2;
	}
	public void setNroGE2(int nroGE2) {
		this.nroGE2 = nroGE2;
	}
	
	public void mostrar() {
		System.out.println("<"+fecha+" "+hora+" "+nroGE1+" "+nroGE2+">\n");
	}
}
