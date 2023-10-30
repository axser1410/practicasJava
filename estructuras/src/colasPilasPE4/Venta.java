package colasPilasPE4;

import java.util.Scanner;

public class Venta {
	private int id,nroProductos,ci;

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(int id, int nroProductos, int ci) {
		super();
		this.id = id;
		this.nroProductos = nroProductos;
		this.ci = ci;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNroProductos() {
		return nroProductos;
	}

	public void setNroProductos(int nroProductos) {
		this.nroProductos = nroProductos;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		nroProductos = sc.nextInt();
		ci = sc.nextInt();
	}
	
	public void mostrardatos(int a) {
		System.out.println(a+" \t<"+id+" "+nroProductos+" "+ci+">");
	}
	
	public void mostrardatos() {
		System.out.println(" \t<"+id+" "+nroProductos+" "+ci+">");
	}

}
