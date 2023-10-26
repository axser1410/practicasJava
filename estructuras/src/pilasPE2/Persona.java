package pilasPE2;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int ci, edad;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, int ci, int edad) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public void mostrardatos() {
		System.out.println("<"+nombre+" "+ci+" "+edad+">");
		
	}
	public void mostrardatos(int a) {
		System.out.println(a+".\t<"+nombre+" "+ci+" "+edad+">");
		
	}

	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		ci = sc.nextInt();
		edad = sc.nextInt();
		
	}
}

