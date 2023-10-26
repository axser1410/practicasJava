package pilasPE1;

public class principal {
	public static void main(String[] args) {
		PilaP practicas = new PilaP();
		Practica p1 = new Practica("juan",100,1);
		Practica p2 = new Practica("ana",51,1);
		Practica p3 = new Practica("maria",48,1);
		Practica p4 = new Practica("pedro",97,1);
		Practica p5 = new Practica("jose",96,1);
		Practica p6 = new Practica("luis",45,2);
		Practica p7 = new Practica("fernando",45,2);
		Practica p8 = new Practica("daniela",49,2);
		Practica p9 = new Practica("nicole",49,2);
		
		practicas.adicionar(p9);
		practicas.adicionar(p8);
		practicas.adicionar(p7);
		practicas.adicionar(p6);
		practicas.adicionar(p5);
		practicas.adicionar(p4);
		practicas.adicionar(p3);
		practicas.adicionar(p2);
		practicas.adicionar(p1);
		practicas.mostrar();
		
		//1.MOSTRAR TODAS LAS PRACTICAS CON NOTA DE APROBACION > 51)
		mostrar(practicas);

		//2.VERIFICAR SI EL ESTUDIANTE X PRESENTO ALGUNA PRACTICA
		verificar(practicas, "jose");
		
		//3.CALCULAR EL PROMEDIO DE LA PRACTICA NUMERO K
		calcular(practicas,2);
	}
	//1.MOSTRAR TODAS LAS PRACTICAS CON NOTA DE APROBACION > 51)
	private static void mostrar(PilaP practicas) {
		PilaP aux = new PilaP();
		Practica elem = null;
		System.out.println("-------1-------");
		while(!practicas.esvacia()) {
			elem = practicas.eliminar();
			if(elem.getNota()>51) {
				elem.mostrardatos();
			}
			aux.adicionar(elem);
		}
		practicas.vaciar(aux);
		
	}
	
	//2.VERIFICAR SI EL ESTUDIANTE X PRESENTO ALGUNA PRACTICAS
	private static void verificar(PilaP practicas, String x) {
		boolean sw = false;
		PilaP aux = new PilaP();
		Practica elem = null;
		while(!practicas.esvacia()) {
			elem = practicas.eliminar();
			if(elem.getNombre().equals(x)) {
				sw = true;
			}
			aux.adicionar(elem);
		}
		practicas.vaciar(aux);
		if(sw) {
			System.out.println("el estudiante "+x+" si presento su practica");
		}
		else {
			System.out.println("el estudiante "+x+" no presento su practica");
		}
	}

	//3.CALCULAR EL PROMEDIO DE LA PRACTICA NUMERO K
	private static void calcular(PilaP practicas, int k) {
		int total = 0,ct = 0;
		PilaP aux = new PilaP();
		Practica elem = null;
		while(!practicas.esvacia()) {
			elem = practicas.eliminar();
			if(elem.getNroPrac()==k) {
				total = total + elem.getNota();
				ct++;
			}
			aux.adicionar(elem);
		}
		practicas.vaciar(aux);
		System.out.println("el promedio de la practica numero "+k+" es "+total/ct);
	}
}
