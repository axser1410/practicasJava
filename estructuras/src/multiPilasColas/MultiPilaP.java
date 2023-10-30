package multiPilasColas;

public class MultiPilaP{
    private int np;
    private PilaP p[]=new PilaP[30];
    
    MultiPilaP()
    {
        for(int i=1;i<=29;i++)
            p[i]=new PilaP();
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    int nroelem(int i)
    {
	return (p[i].nroelem());
    }

    boolean esvacia (int i)
    {
	if (p [i].esvacia ())
	    return true;
	return false;
    }


    boolean esllena (int i)
    {
	if (p [i].esllena ())
	    return true;
	return false;
    }
    
    void adicionar (int i, Propietario elem)
    {
	if (!p [i].esllena ())
	    p [i].adicionar (elem);
	else
	    System.out.print ("Pila " + i + " esta llena");
    }
    Propietario eliminar (int i)
    {
	Propietario e = null;
	if (!p [i].esvacia ())
	    e = p [i].eliminar ();
	else
	    System.out.print ("Pila " + i + " esta vacia");
	return e;
    }

    void mostrar ()
    {
	int i;
	for (i = 1 ; i <= np ; i++)
	{
	    System.out.println ("\n\nPROPIETARIO Pila " + i + " ");
	    p [i].mostrar ();
	}
    }

    void vaciar(int i, PilaP a )
    {
    	p[i].vaciar(a);
    }
    void vaciar(int i , int j)
    {
        p[i].vaciar(p[j]);
    }
}