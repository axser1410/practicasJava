package nov_15_ListasYLDobles;

public class NodoA {
    private int idA;
    private String tipo, descripcion, fecha, horario, lugar;
    private LSimpleI a;
    private NodoA sig, ant;
    
    NodoA(){
        sig=ant=null;
    }

    public int getCiA() {
        return idA;
    }

    public void setCiA(int ciA) {
        this.idA = ciA;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LSimpleI getA() {
        return a;
    }

    public void setA(LSimpleI a) {
        this.a = a;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public NodoA getAnt() {
        return ant;
    }

    public void setAnt(NodoA ant) {
        this.ant = ant;
    }
    
    
}
