package listasDoblesEjercicios1;

public class principal {
	public static void main(String[] args) {
		LDobleH lista = new LDobleH();
		Helado h1 = new Helado("vainilla","cono",1,7);
		Helado h2 = new Helado("chocolate","paleta",2,10);
		Helado h3 = new Helado("fresa","paleta",1,5);
		Helado h4 = new Helado("durazno","paleta",1,15);
		Helado h5 = new Helado("sundae","tazon",20,10);
		Helado h6 = new Helado("mango","paleta",1,7);
		Helado h7 = new Helado("fresa","paleta",1,10);
		Helado h8 = new Helado("chocolate","cono",3,10);
		Helado h9 = new Helado("vainilla","cono",2,15);
		lista.adifinal(h1);
		lista.adifinal(h2);
		lista.adifinal(h3);
		lista.adifinal(h4);
		lista.adifinal(h5);
		lista.adifinal(h6);
		lista.adifinal(h7);
		lista.adifinal(h8);
		lista.adifinal(h9);
		lista.mostrar();
	
		//1.ADICIONAR UN NUEVO HELADO DESPUES DEL I-ESIMO DE LA LISTA
		//System.out.println("\n-------------------1-----------------");
		//adicionar(lista,5);
		//lista.mostrar();
		
		//2.ADICIONAR UN NUEVO HELADO, ANTES DEL I-ESIMO HELADO DE LA LISTA
		//System.out.println("\n-------------------2-----------------");
		//adicionar2(lista,5);
		//lista.mostrar();
		
		//3.ADICIONAR UN NUEVO HELADO ANTES DEL ULTIMO HELADO DE LA LISTA
		System.out.println("\n-------------------2-----------------");
		adicionar3(lista);
		lista.mostrar();
		
		//4.ADICIONAR KA NUEVOS HELADOS DESPUESD DL I-ESIMO
	}

	//1.ADICIONAR UN NUEVO HELADO DESPUES DEL I-ESIMO DE LA LISTA
	private static void adicionar(LDobleH lista, int i) {
		boolean sw = true;
		NodoH aux = new NodoH();
		Helado heladoNuevo = new Helado("chocolate","torta",50,15);
		NodoH nuevo = new NodoH();
		nuevo.setH(heladoNuevo);
		NodoH r = lista.getP();
		int j = 1;
		while (sw) {
			r = r.getSig();
			j++;
			if(j==i) {
				aux = r.getSig();
				sw = false;
			}
		}
		nuevo.setSig(aux);
		aux.setAnt(nuevo);
		nuevo.setAnt(r);
		r.setSig(nuevo);
	}
	
	//2.ADICIONAR UN NUEVO HELADO, ANTES DEL I-ESIMO HELADO DE LA LISTA
	private static void adicionar2(LDobleH lista, int i) {
		boolean sw = true;
		NodoH aux = new NodoH();
		Helado heladoNuevo = new Helado("fresa","torta",50,10);
		NodoH nuevo = new NodoH();
		nuevo.setH(heladoNuevo);
		NodoH r = lista.getP();
		int j = 1;
		while (sw) {
			r = r.getSig();
			j++;
			if(j==i) {
				aux = r.getAnt();
				sw = false;
			}
		}
		nuevo.setAnt(aux);
		aux.setSig(nuevo);
		nuevo.setSig(r);
		r.setAnt(nuevo);
	}
	
	//3.ADICIONAR UN NUEVO HELADO ANTES DEL ULTIMO HELADO DE LA LISTA
	private static void adicionar3(LDobleH lista) {
		NodoH aux = new NodoH();
		Helado heladoNuevo = new Helado("xxxxxxxxx","aaaaaaaa",50,10);
		NodoH nuevo = new NodoH();
		nuevo.setH(heladoNuevo);
		NodoH r = lista.getP();
		while (r.getSig()!= null) {
			r = r.getSig();
		}
		aux = r.getAnt();
		nuevo.setSig(r);
		r.setAnt(nuevo);
		aux.setSig(nuevo);
		nuevo.setAnt(aux);
	}
}
