package pilasPE1;

import java.util.Scanner;

public class Practica {
	private String nombre;
	private int nota, nroPrac;
	
	

	public Practica(String nombre, int nota, int nroPrac) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		this.nroPrac = nroPrac;
	}



	public Practica() {
		
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNota() {
		return nota;
	}



	public void setNota(int nota) {
		this.nota = nota;
	}



	public int getNroPrac() {
		return nroPrac;
	}



	public void setNroPrac(int nroPrac) {
		this.nroPrac = nroPrac;
	}

		
	public void mostrardatos() {
		System.out.println("<"+nombre+" "+nota+" "+nroPrac+">");
		
	}
	public void mostrardatos(int a) {
		System.out.println(a+".\t<"+nombre+" "+nota+" "+nroPrac+">");
		
	}



	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		nota = sc.nextInt();
		nroPrac = sc.nextInt();
		
	}

}
