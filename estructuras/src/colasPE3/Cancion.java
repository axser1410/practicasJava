package colasPE3;

import java.util.Scanner;

public class Cancion {
	private String artista, titulo, genero;
	private int nroRep;
	public Cancion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cancion(String artista, String titulo, String genero, int nroRep) {
		super();
		this.artista = artista;
		this.titulo = titulo;
		this.genero = genero;
		this.nroRep = nroRep;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNroRep() {
		return nroRep;
	}
	public void setNroRep(int nroRep) {
		this.nroRep = nroRep;
	}
	public void leerdatos() {
		Scanner sc = new Scanner(System.in);
		artista = sc.nextLine();
		titulo = sc.nextLine();
		genero = sc.nextLine();
		nroRep = sc.nextInt();
		
	}
	public void mostrardatos(int a) {
		System.out.println(a+" \t<"+artista+" "+titulo+" "+genero+" "+nroRep+">");
	}
	public void mostrardatos() {
		System.out.println(" \t<"+artista+" "+titulo+" "+genero+" "+nroRep+">");
	}
	
}
