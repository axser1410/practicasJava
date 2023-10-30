package multipilaPE1;

import java.util.Scanner;

public class Participante {
	private String curso, nombre;
	private int id, edad;
	public Participante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participante(String curso, String nombre, int id, int edad) {
		super();
		this.curso = curso;
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		curso = sc.nextLine();
		nombre = sc.nextLine();
		id = sc.nextInt();
		edad= sc.nextInt();
		
	}
	public void mostrardatos(int a) {
		System.out.println(a+" \t\t<"+curso+" "+nombre+" "+id+" "+edad+">");
	}
	public void mostrardatos() {
		System.out.println(" \t\t<"+curso+" "+nombre+" "+id+" "+edad+">");
	}
}
