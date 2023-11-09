package nov_08_listas;

public class principal {
	public static void main(String[] args) {
		ListaDM A = new ListaDM();
		A.adicion(44, "Lucy", "toto", "perro", "20");
		A.adicion(20, "alex", "pelusa", "perro", "15");
		A.adicion(12, "german", "rocky", "gato", "10");
		A.adicion(18, "freddy", "batuki", "perico", "20");
		A.adicion(35, "maria", "franco", "perro", "22");
		
		A.mostrar();
		
		System.out.println("\n\n---------1--------");
		nombreX(A, "alex");
		System.out.println("\n\n---------2--------");
		mascotasX(A,"perro");
	}
	//1.
	private static void nombreX(ListaDM a, String x) {
		NodoD r = a.getP();
		while (r!=null) {
			if (r.getNombre().equals(x)) {
				System.out.println("<\t"+r.getEnl().getNombre()+" "+r.getNombre());
			}
			r=r.getSig();
		}
	}
	
	
	//2.
	private static void mascotasX(ListaDM a,String x) {
		int ct = 0;
		NodoD r = a.getP();
		while (r!=null) {
			if (r.getEnl().getTipo().equals(x)) {
				ct++;
			}
			r=r.getSig();
		}
		System.out.println("mascotas:"+ct);
	}

}
