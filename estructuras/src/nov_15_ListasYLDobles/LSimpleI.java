package nov_15_ListasYLDobles;

public class LSimpleI {
    private NodoI p;

    LSimpleI() {
        p = null;
    }
    public NodoI getP() {
        return p;
    }

    public void setP(NodoI p) {
        this.p = p;
    }
    
    public void adicionar(int c, String a){
        NodoI nue = new NodoI();
        nue.setCi(c);
        nue.setAsistio(a);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoI r = getP();
            while (r.getSig()!=null) {            
                r = r.getSig();
            }
            r.setSig(nue);
        }
                
    }
    public void mostrar(){
        System.out.println("\tLISTA DE INSCRITOS");
        NodoI r = getP();
        while (r!=null) {            
            System.out.println("\t\t"+r.getCi()+" "+r.getAsistio());
            r = r.getSig();
        }
        
    }
    
}
