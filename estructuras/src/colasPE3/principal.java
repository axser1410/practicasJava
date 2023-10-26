package colasPE3;

import java.util.ArrayList;


public class principal {
	public static void main(String[] args) {
		CSimpleC lista = new CSimpleC();
		Cancion c1 = new Cancion("djavu","quebro","cumbia",500);
		Cancion c2 = new Cancion("veneno","toma","cumbia",424);
		Cancion c3 = new Cancion("calypso","llora","cumbia",25);
		Cancion c4 = new Cancion("americo","adios","cumbia",242);
		Cancion c5 = new Cancion("veneno","veneno","cumbia",14);
		Cancion c6 = new Cancion("rafaga","quebro","cumbia",24);
		Cancion c7 = new Cancion("calypso","llorando","saya",500);
		lista.adicionar(c1);
		lista.adicionar(c2);
		lista.adicionar(c3);
		lista.adicionar(c4);
		lista.adicionar(c5);
		lista.adicionar(c6);
		lista.adicionar(c7);
		lista.mostrar();
		
		//1.MOSTRAR LAS CANCIONES ARTISTA NOMBRE CON EL MAYOR NUMERO DE REPRODUCCIONES
		//System.out.println("---------1---------");
		//mostrar(lista);
		
		//2.AGREGAR UNA REPRODUCCION A TODAS LAS REPRODUCCIONES DEL ARTISTA QUE MAS CANCIONES TIENE
		//System.out.println("---------2---------");
		//agregar1(lista);
		//lista.mostrar();
		
		//3.DADA UNA COLA DE CANCIONES B MOVER TODAS LAS CANCIONES DE LA SEGUNDA COLA A LA 
		//PRIMERA COLA. PARA TODA CANCION DE LA COLA B SI SU GENERO EXISTE EN LA PRIMERA
		//COLA, AGREGARLA LUEGO DE CUALQUIER CANCION CON EL MISMO GENERO, CASO CONTRARIO
		//AGREGAR LA CANCION AL FINAL
		System.out.println("---------3---------");
		CSimpleC B = new CSimpleC();
		Cancion b1 = new Cancion("sinfonia","adios","rap",10);
		Cancion b2 = new Cancion("rap school","vete","rap",10);
		Cancion b3 = new Cancion("cancerbero","jeremias","rap",200);
		Cancion b4 = new Cancion("americo","embrujo","cumbia",45);
		Cancion b5 = new Cancion("rap school","pase lo","rap",70);
		Cancion b6 = new Cancion("veneno","veneno","cumbia",85);//
		Cancion b7 = new Cancion("cancerbero","epico","rap",500);
		B.adicionar(b1);
		B.adicionar(b2);
		B.adicionar(b3);
		B.adicionar(b4);
		B.adicionar(b5);
		B.adicionar(b6);
		B.adicionar(b7);
		B.mostrar();
		
		mover(lista, B);
		lista.mostrar();
		
	}

	//1.MOSTRAR LAS CANCIONES ARTISTA NOMBRE CON EL MAYOR NUMERO DE REPRODUCCIONES
	private static void mostrar(CSimpleC lista) {
		int mayor = 0;
		CSimpleC aux = new CSimpleC();
		Cancion elem = null;
		while (!lista.esvacia()) {
			elem = lista.eliminar();
			if (elem.getNroRep()>mayor) {
				mayor = elem.getNroRep();
			}
			aux.adicionar(elem);
		}
		lista.vaciar(aux);
		while (!lista.esvacia()) {
			elem = lista.eliminar();
			if (elem.getNroRep()==mayor) {
				System.out.println("["+elem.getArtista()+" "+elem.getTitulo()+"]");
			}
			aux.adicionar(elem);
		}
		lista.vaciar(aux);
	}
	
	
	//2.AGREGAR UNA REPRODUCCION A TODAS LAS REPRODUCCIONES DEL ARTISTA QUE MAS CANCIONES TIENE
	private static void agregar1(CSimpleC lista) {
		String artista="";
		CSimpleC aux = new CSimpleC();
		Cancion elem=null;
		ArrayList <String>nombres = new ArrayList<String>();
		int ct = 0,mayor=0;
		
		while (!lista.esvacia()) {
			elem = lista.eliminar();
			if(contar(elem.getArtista(),lista)>=mayor) {
				mayor = contar(elem.getArtista(),lista);
				artista = elem.getArtista();
				nombres.add(elem.getArtista());
			}
			aux.adicionar(elem);
		}
		lista.vaciar(aux);
		while (!lista.esvacia()) {
			elem = lista.eliminar();
			for (int i = 0; i < nombres.size(); i++) {
				if(elem.getArtista().equals(nombres.get(i))) {
					int numero = elem.getNroRep();
					elem.setNroRep(numero+1);
				}
			}
			aux.adicionar(elem);
		}
		lista.vaciar(aux);
	}

	
	private static int contar(String x, CSimpleC lista) {
		int ct = 0;
		Cancion elem = null;
		CSimpleC aux = new CSimpleC();
		while (!lista.esvacia()) {
			elem = lista.eliminar();
			if (elem.getArtista().equals(x)) {
				ct++;
			}
			aux.adicionar(elem);
		}
		lista.vaciar(aux);
		return ct;
	}
	

	//3.DADA UNA COLA DE CANCIONES B MOVER TODAS LAS CANCIONES DE LA SEGUNDA COLA A LA 
	//PRIMERA COLA. PARA TODA CANCION DE LA COLA B SI SU GENERO EXISTE EN LA PRIMERA
	//COLA, AGREGARLA LUEGO DE CUALQUIER CANCION CON EL MISMO GENERO, CASO CONTRARIO
	//AGREGAR LA CANCION AL FINAL
	
	private static void mover(CSimpleC lista, CSimpleC B) {
		CSimpleC aux = new CSimpleC();
		CSimpleC aux2 = new CSimpleC();
		Cancion elem = null, elem2 = null;
		boolean sw1 = false;
		while (!B.esvacia()) {
			sw1 = false;
			elem = B.eliminar();
			String genero = elem.getGenero();
			while (!lista.esvacia()) {
				elem2 = lista.eliminar();
				if (elem2.getGenero().equals(genero)) {
					sw1=true;
					aux2.adicionar(elem2);
					aux2.adicionar(elem);
					aux2.vaciar(lista);
				}
				if (!sw1) {
					aux2.adicionar(elem2);					
				}
			}
			
			lista.vaciar(aux2);
			if (sw1) {
				sw1 = false;
			}
			else{
				aux.adicionar(elem);
			}
		}
		if (aux.nroelem()>0) {
			lista.vaciar(aux);
		}
		
	}
}
