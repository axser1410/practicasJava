package multipilaPE1;

import java.util.Scanner;

public class Actividad {
	private int id;
	private String fecha, encargado, tipoActividad;
	private PilaP p;
	public Actividad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actividad(int id, String fecha, String encargado, String tipoActividad, PilaP p) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.encargado = encargado;
		this.tipoActividad = tipoActividad;
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public PilaP getP() {
		return p;
	}
	public void setP(PilaP p) {
		this.p = p;
	}
	
	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		fecha = sc.nextLine();
		encargado = sc.nextLine();
		tipoActividad= sc.nextLine();
		p.llenar(10);
		
	}
	public void mostrardatos(int a) {
		System.out.println(a+" \t<"+id+" "+fecha+" "+encargado+" "+tipoActividad+">");
		p.mostrar();
	}
	public void mostrardatos() {
		System.out.println(" \t<"+id+" "+fecha+" "+encargado+" "+tipoActividad+">");
		p.mostrar();
	}
	
	
}

// [id, fecha, encargado, tipo de actividad, pila de Participantes].