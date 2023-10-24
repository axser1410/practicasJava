package listasDoblesEjercicios1;

public class LDobleH {
	 private NodoH p;
	 	LDobleH()
	    {
	        p=null;
	    }

	    public NodoH getP() {
	        return p;
	    }

	    public void setP(NodoH p) {
	        this.p = p;
	    }
	    public void mostrar()
	    {  
	    	int i = 1;
	        NodoH w=getP();
	        while (w!=null)
	        {
	               w.getH().mostrar(i);
	               w=w.getSig();
	               i++;
	        }
	     }
	    public void adifinal(Helado x)
	    { 
	    	NodoH nue=new NodoH();
	        nue.setH(x);
	        if (getP()==null)
	               setP(nue);
	       else{
	         NodoH w=getP();
	         while (w.getSig()!=null)
	               w=w.getSig();
	         w.setSig(nue);
	         nue.setAnt(w);
	        }
	    }
}
