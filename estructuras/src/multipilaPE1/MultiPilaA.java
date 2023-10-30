package multipilaPE1;

import java.util.Scanner;

public class MultiPilaA {
	private PilaA a [] = new PilaA[13];
	private int np;

	MultiPilaA(){
		np=0;
		for(int i=1; i <= 12;i++)
		{
			a[i] = new PilaA();
			
		}
	}

	int nroelem(int i)
	{
		return (a[i].nroelem());
	}

	boolean esvacia (int i)
	{
		return (a [i].esvacia ());
	}


	boolean esllena (int i)
	{
		return  (a [i].esllena ());

	}


	void adicionar (int i, Actividad L)
	{
		if (!a [i].esllena ()) {
			a[i].adicionar (L);
		}
		else
			System.out.print ("Pila " + i + " esta llena");
	}


	Actividad eliminar (int i)
	{
		Actividad  e = new Actividad();

		if (!a [i].esvacia ()) {
			e = a[i].eliminar ();
		}
		else
			System.out.print ("Pila " + i + " esta vacia");
		return e;
	}


	void llenar(int i, int n)
	{
		a[i].llenar(n);
	}

	void llenar (int n)
	{
		int i, m;

		np = n;
		for (i = 0 ; i < n ; i++)
		{
			System.out.print ("\nNro. elementos Pila " + i + " :");
			Scanner sc = new Scanner(System.in);
			m = sc.nextInt();
			a [i].llenar(m);
			np++;
		}
	}

	void mostrar(int i)
	{
		a[i].mostrar();
	}

	void mostrar ()
	{
		for (int i = 0 ; i < np ; i++)
		{
			System.out.println ("\n\nDatos Pila " + i + " ");
			a[i].mostrar ();
		}
	}
	
	void vaciar(int i, PilaA z)
	{
		a[i].vaciar(z);
		
	}
	
	void vaciar (int i, int j)
	{
		a[i].vaciar(a[j]);
	}
	
	public int getNp() {
		return np;
	}


	public void setNp(int np) {
		this.np = np;
	}
}
