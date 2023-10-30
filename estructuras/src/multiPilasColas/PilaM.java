package multiPilasColas;

public class PilaM {
    private int max=30;
    private Mascota v[]=new Mascota[max+1];
    private int tope;
    PilaM(){
        tope=0;
    }
    
	boolean esvacia()
    {
        if (tope==0) {
            return true;
        }
        return false;
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
    void adicionar (Mascota elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v[tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }
    Mascota eliminar ()
    {
    	Mascota elem = null;
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
    Mascota elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("Mascotas de la Pila ");
	    PilaM aux = new PilaM ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
                elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();
		adicionar (elem);
	    }
	}
    }
    void vaciar (PilaM a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
	
    }
    
        
}