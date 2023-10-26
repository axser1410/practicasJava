package pilasPE1;

public class PilaP {
	private int max=50,tope;
	private Practica p [] =new Practica[max];
	
	public PilaP() {
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


    void adicionar (Practica elem)
    {
		if (!esllena ())
		{
		    tope++;
		    p [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }


    Practica eliminar ()
    {
		Practica elem = new Practica ();
		if (!esvacia ())
		{
		    elem = p [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
    }


    void mostrar ()
    {
    	int a = 1;
		Practica elem = null;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else
		{
		    System.out.println ("\n Datos de la Pila ");
		    PilaP aux = new PilaP ();
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
		    Practica l = new Practica ();
		    l.leerdatos ();
		    adicionar (l);
		}
    }


    void invertir ()
    {
		PilaP a = new PilaP ();
		PilaP b = new PilaP ();
		while (!esvacia ())
		    a.adicionar (eliminar ());
		while (!a.esvacia ())
		    b.adicionar (a.eliminar ());
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
	    }
	
	//vaciar de a
	void vaciar (PilaP a)
	    {
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	
	}
}
