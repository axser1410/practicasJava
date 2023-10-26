package pilasPE2;

public class CSimpleP {
	private int ini,fin,max = 60;
	private Persona p[]=new Persona[max];

	public CSimpleP ()
    {
		ini = fin = 0;
    }


    boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }


    int nroelem ()
    {
	return (fin - ini);
    }


    void adicionar (Persona elem)
    {
	if (!esllena ())
	{
	    fin++;
	    p [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }


    Persona eliminar ()
    {
	Persona elem = new Persona ();
	if (!esvacia ())
	{
	    ini++;
	    elem = p [ini];
	    if (ini == fin)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola Simple vacia");
	return (elem);
    }


    void mostrar ()
    {
    	int a=0;
		Persona elem;
		if (esvacia ())
		    System.out.println ("Cola vacia");
		else
		{
		    System.out.println ("\n Datos de la Cola ");
		    CSimpleP aux = new CSimpleP ();
		    while (!esvacia ())
		    {
		    	a++;
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrardatos (a);
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
	    Persona z = new Persona ();
	    z.leerdatos ();
	    adicionar (z);
	}
    }



    void invertir ()
    {
    	CSimpleP a = new CSimpleP ();
    	CSimpleP b = new CSimpleP ();
		while (!esvacia ())
		{
		    while (nroelem () != 1)
			a.adicionar (eliminar ());
		    b.adicionar (eliminar ());
		    while (!a.esvacia ())
			adicionar (a.eliminar ());
		}
		while (!b.esvacia ())
		    adicionar (b.eliminar ());

    }


    void vaciar (CSimpleP a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
