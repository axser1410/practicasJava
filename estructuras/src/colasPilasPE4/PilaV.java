package colasPilasPE4;

public class PilaV {
	private int max=50,tope;
	private Venta v [] =new Venta[max];
	
	public PilaV() {
		tope = 0;
	}
    
    public boolean esvacia ()
    {
		if (tope == 0)
		    return (true);
		return (false);
    }


    boolean esllena ()
    {
		if (tope == max)
		    return (true);
		return (false);
    }


    int nroelem ()
    {
    	return (tope);
    }


    void adicionar (Venta elem)
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }


    Venta eliminar ()
    {
    	Venta elem = new Venta ();
		if (!esvacia ())
		{
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
    }


    void mostrar ()
    {
    	int a = 1;
    	Venta elem = null;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else
		{
		    System.out.println ("\n Datos de la Pila ");
		    PilaV aux = new PilaV ();
		    while (!esvacia ())
		    {
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrardatos(a);
				a++;
		    }
		    while (!aux.esvacia ())
		    {
				elem = aux.eliminar ();
				adicionar (elem);
		    }
		}
    }


    void llenar (int n)
    {
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			Venta l = new Venta ();
		    l.leerdatos ();
		    adicionar (l);
		}
    }


    void invertir ()
    {
    	PilaV a = new PilaV ();
    	PilaV b = new PilaV ();
		while (!esvacia ())
		    a.adicionar (eliminar ());
		while (!a.esvacia ())
		    b.adicionar (a.eliminar ());
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
	    }
	
	//vaciar de a
	void vaciar (PilaV a)
	    {
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	
	}
}
