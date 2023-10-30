package multiPilasColas;

public class Propietario {
    private String nombre, direccion,ci;
    private CCircularM M;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setM(CCircularM M) {
        this.M = M;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCi() {
        return ci;
    }

    public CCircularM getM() {
        return M;
    }

    public Propietario(String nombre, String direccion, String ci, CCircularM M) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ci = ci;
        this.M = M;
    }
    
     public void mostrar() {
         System.out.println("("+nombre+" "+direccion+" "+ci+")");
         M.mostrar();
    }
    
    
}