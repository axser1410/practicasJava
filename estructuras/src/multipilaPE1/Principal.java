package multipilaPE1;

public class Principal {
	public static void main(String[] args) {
		MultiPilaA año = new MultiPilaA();
		
		//PARTICIPANTES
		Participante p1 = new Participante("a5", "andy",1111,20);
		Participante p2 = new Participante("a5", "jhon",2222,20);
		Participante p3 = new Participante("a5", "maria",3333,25);
		Participante p4 = new Participante("a2", "lesley",4444,35);
		Participante p5 = new Participante("a2", "ana",5555,21);
		Participante p6 = new Participante("a7", "xavier",6666,17);
		Participante p7 = new Participante("a7", "alex",7777,22);
		Participante p8 = new Participante("a7", "alan",8888,24);
		Participante p9 = new Participante("a9", "heidy",9999,23);
		Participante p10 = new Participante("a9", "jose",11110,29);
		
		//PILA DE PARTICIPANTES
		PilaP pp1 = new PilaP();
		pp1.adicionar(p1);
		pp1.adicionar(p2);
		pp1.adicionar(p3);
		
		PilaP pp2 = new PilaP();
		pp2.adicionar(p4);
		pp2.adicionar(p5);
		
		PilaP pp3 = new PilaP();
		pp3.adicionar(p6);
		pp3.adicionar(p7);
		pp3.adicionar(p8);
		
		PilaP pp4 = new PilaP();
		pp4.adicionar(p9);
		pp4.adicionar(p10);
		
		
		//ACTIVIDADES
		Actividad a1 = new Actividad(1753, "17/01/23", "andy","maraton",pp1);
		Actividad a2 = new Actividad(2054, "22/04/23", "andy","maraton",pp2);
		Actividad a3 = new Actividad(4536, "30/06/23", "andy","maraton",pp3);
		Actividad a4 = new Actividad(4875, "25/08/23", "andy","maraton",pp4);
		año.adicionar(1, a1);
		año.adicionar(4, a2);
		año.adicionar(6, a3);
		año.adicionar(8, a4);
		año.setNp(12);

		
		//1.DEL MES DE AGOSTO CONTAR LOS PARTICIPANTES DE LA FECHA X
		contar(año, "25/08/23");
		
		//2.Encontrar cual es el mes que tuvo mas actividades donde los participantes tengan un
		//numero primo como edad.
		
		
	}

	private static void contar(MultiPilaA año, String x) {
		PilaA aux = new PilaA();
		Actividad elem = null;
		int ct =  0;
		for (int i = 1; i <= año.getNp(); i++) {
			while (!año.esvacia(i)) {
				elem = año.eliminar(i);
				if (elem.getFecha().equals(x)) {
					ct = ct + elem.getP().nroelem();
				}
				aux.adicionar(elem);
			}
			año.vaciar(i, aux);
		}
		System.out.println("total: "+ct );
	}
	
	//2.Encontrar cual es el mes que tuvo mas actividades donde los participantes tengan un
	//numero primo como edad.
	
}
