package pilasPE2;

public class principal {
	public static void main(String[] args) {
		
		CSimpleP banco = new CSimpleP();
		Persona p1 = new Persona("juan",111,25);
		Persona p2 = new Persona("ana",222,20);
		Persona p3 = new Persona("maria",339,68);
		Persona p4 = new Persona("pedro",444,70);
		Persona p5 = new Persona("jose",559,18);
		Persona p6 = new Persona("luis",6621,36);
		Persona p7 = new Persona("fernando",779,70);
		Persona p8 = new Persona("daniela",882,27);
		Persona p9 = new Persona("nicole",994,80);
		banco.adicionar(p9);
		banco.adicionar(p8);
		banco.adicionar(p7);
		banco.adicionar(p6);
		banco.adicionar(p5);
		banco.adicionar(p4);
		banco.adicionar(p3);
		banco.adicionar(p2);
		banco.adicionar(p1);
		//banco.mostrar();
		
		//1.TODAS LAS PERSONAS MAYORES A 60 AÑOS DEBEN SER TRASLADADAS AL PRINCIPIO DE LA COLA
		//System.out.println("--------------1-----------");
		//mover(banco);
		//banco.mostrar();
		
		//2.MOSTRAR LOS NOMBRES DE LAS PERSONAS QUE TIENEN EL ULTIMO DIGITO DEL CI IGUAL A K
		System.out.println("--------------1-----------");
		mostrar(banco,10);
		
		//3.HALLAR CUAL ES EL ULTIMO DIGITO DE CI MAS REPETIDO
		hallar(banco);
		
	}


	//1.TODAS LAS PERSONAS MAYORES E IGUALES A 60 AÑOS DEBEN SER TRASLADADAS AL PRINCIPIO DE LA COLA
	private static void mover(CSimpleP banco) {
		CSimpleP aux = new CSimpleP();
		CSimpleP mayores = new CSimpleP();
		Persona elem = null;
		while(!banco.esvacia()) {
			elem = banco.eliminar();
			if(elem.getEdad()>=60) {
				mayores.adicionar(elem);
			}
			else {
				aux.adicionar(elem);
			}
		}
		banco.vaciar(mayores);
		banco.vaciar(aux);
	}
	

	//2.MOSTRAR LOS NOMBRES DE LAS PERSONAS QUE TIENEN EL ULTIMO DIGITO DEL CI IGUAL A K
	private static void mostrar(CSimpleP banco, int k) {
		CSimpleP aux = new CSimpleP();
		Persona elem = null;
		while (!banco.esvacia()) {
			elem = banco.eliminar();
			int ultimo = elem.getCi()%10;
			if (ultimo==k) {
				System.out.println("nombre: "+elem.getNombre());
			}
			aux.adicionar(elem);
		}
		banco.vaciar(aux);
		
	}
	
	//3.HALLAR CUAL ES EL ULTIMO DIGITO DE CI MAS REPETIDO
	private static void hallar(CSimpleP banco) {
		int mayor = 0,ct=0,digito=0;
		CSimpleP aux = new CSimpleP();
		Persona elem = null;
		for (int i = 0; i <= 9; i++) {
			ct = 0;
			while (!banco.esvacia()) {
				elem = banco.eliminar();
				int ultimo = elem.getCi()%10;
				if (ultimo==i) {
					ct++;
				}
				aux.adicionar(elem);
			}
			if (ct>mayor) {
				digito = i;
				mayor = ct;
			}
			banco.vaciar(aux);
		}
		for (int i = 0; i <= 9; i++) {
			ct = 0;
			while (!banco.esvacia()) {
				elem = banco.eliminar();
				int ultimo = elem.getCi()%10;
				if (ultimo==i) {
					ct++;
				}
				aux.adicionar(elem);
			}
			if (ct==mayor) {
				digito = i;
				mayor = ct;
				System.out.println("digito: "+digito+" ct: "+mayor);
			}
			banco.vaciar(aux);
		}
		
		
	}
}
