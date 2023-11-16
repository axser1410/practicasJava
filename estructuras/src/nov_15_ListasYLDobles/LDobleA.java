package nov_15_ListasYLDobles;

public class LDobleA {
    private NodoA p;

    LDobleA() {
        p = null;
    }
    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }
    
    public void adicionar(int c, String t,String d,String f,String h, String l, LSimpleI A1 ){
        NodoA nue = new NodoA();
        nue.setCiA(c);
        nue.setTipo(t);
        nue.setDescripcion(d);
        nue.setFecha(f);
        nue.setHorario(h);
        nue.setLugar(l);
        nue.setA(A1);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoA r = getP();
            while (r.getSig()!=null) {            
                r = r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
                
    }
    public void mostrar(){
        System.out.println("\n\nLISTA DE ACTIVIDADES\n");
        NodoA r = getP();
        while (r!=null) {            
            System.out.println("\t"+r.getCiA()+" "+r.getTipo()+" "+r.getDescripcion()+" "+r.getFecha()+" "+r.getHorario()+" "+r.getLugar());
            r.getA().mostrar();
            r = r.getSig();
        }
        
    }
    
    
}
