package nov_08_listas;

public class NodoM {
	private String nombre,tipo,edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public NodoM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NodoM(String nombre, String tipo, String edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	

}
