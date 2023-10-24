package listasDoblesEjercicios1;

public class Helado {
	private String nombre, presentacion;
	private double precio;
	private int cantidad;
	public Helado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Helado(String nombre, String presentacion, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.presentacion = presentacion;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void mostrar(int i) {
		System.out.println(i+". <"+nombre+" "+presentacion+" "+precio+" "+cantidad+">");
	}
}
