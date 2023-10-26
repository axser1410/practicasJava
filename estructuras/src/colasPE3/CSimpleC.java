package colasPE3;

public class CSimpleC {
	private int ini,fin,max = 60;
	private Cancion c[]=new Cancion[max];

	public CSimpleC ()
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


    void adicionar (Cancion elem)
    {
	if (!esllena ())
	{
	    fin++;
	    c [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }


    Cancion eliminar ()
    {
    	Cancion elem = new Cancion ();
	if (!esvacia ())
	{
	    ini++;
	    elem = c [ini];
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
    	Cancion elem;
		if (esvacia ())
		    System.out.println ("Cola vacia");
		else
		{
		    System.out.println ("\n Datos de la Cola ");
		    CSimpleC aux = new CSimpleC ();
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
		Cancion z = new Cancion ();
	    z.leerdatos ();
	    adicionar (z);
	}
    }



    void invertir ()
    {
    	CSimpleC a = new CSimpleC ();
    	CSimpleC b = new CSimpleC ();
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


    void vaciar (CSimpleC a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
