package nov_15_ListasYLDobles;

public class LSimpleP {
    private NodoP p ;
    LSimpleP(){
        p=null;
    }
    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adicionar(int a, String n, String t,String u){
        NodoP nue = new NodoP();
        nue.setCi(a);
        nue.setNombre(n);
        nue.setTipo(t);
        nue.setUniv(u);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoP r = getP();
            while (r.getSig()!=null) {            
                r = r.getSig();
            }
            r.setSig(nue);
        }
                
    }
    public void mostrar(){
        System.out.println("LISTA DE PARTICIPANTES");
        NodoP r = getP();
        while (r!=null) {            
            System.out.println("\t"+r.getCi()+" "+r.getNombre()+" "+r.getTipo()+" "+r.getUniv());
            r = r.getSig();
        }
        
    }
}
