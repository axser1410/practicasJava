package multipilaPE1;

public class PilaA {
	private int max=50,tope;
	private Actividad a [] =new Actividad[max];
	
	public PilaA() {
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


    void adicionar (Actividad elem)
    {
		if (!esllena ())
		{
		    tope++;
		    a [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }


    Actividad eliminar ()
    {
    	Actividad elem = new Actividad ();
		if (!esvacia ())
		{
		    elem = a [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
    }


    void mostrar ()
    {
    	int a = 1;
    	Actividad elem = null;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else
		{
		    System.out.println ("\n Datos de la Pila ");
		    PilaA aux = new PilaA ();
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
			Actividad l = new Actividad ();
		    l.leerdatos ();
		    adicionar (l);
		}
    }


    void invertir ()
    {
    	PilaA a = new PilaA ();
    	PilaA b = new PilaA ();
		while (!esvacia ())
		    a.adicionar (eliminar ());
		while (!a.esvacia ())
		    b.adicionar (a.eliminar ());
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
	    }
	
	//vaciar de a
	void vaciar (PilaA a)
	    {
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	
	}
}
