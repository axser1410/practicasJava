package colasPilasPE4;

import java.util.Scanner;

public class Producto {
	private String nombre;
	private int id;
	private double precio;
	public Producto() {
		
	}
	public Producto(String nombre, int id, double precio) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		id = sc.nextInt();
		precio = sc.nextDouble();
		
	}
	
	public void mostrardatos(int a) {
		System.out.println(a+" \t<"+nombre+" "+id+" "+precio+">");
	}
	
	public void mostrardatos() {
		System.out.println(" \t<"+nombre+" "+id+" "+precio+">");
	}
}
