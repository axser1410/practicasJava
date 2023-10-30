package multiPilasColas;

public class Vacunador {

    public Vacunador(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    private String fecha, nombre;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Vacunador() {
    
    }
    
    public void mostrar() {
        System.out.println("["+fecha+" "+nombre+"]");
    }
}