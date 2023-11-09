package nov_08_listasEquipoPartido;

public class Principal {
	public static void main(String[] args) {
		ListaEP P = new ListaEP();
		Equipo e1 = new Equipo("Bolivar", 11,12);
		Equipo e2 = new Equipo("Strongest", 11,10);
		Equipo e3 = new Equipo("Oriente Petrolero", 11,7);
		Equipo e4 = new Equipo("Bloming", 11,10);
		Equipo e5 = new Equipo("Real Madrid", 11,9);
		Equipo e6 = new Equipo("Barcelona", 11,12);
		Equipo e7 = new Equipo("Real Madrid", 11, 7);
		Equipo e8 = new Equipo("Manchester United", 10, 8);
		Equipo e9 = new Equipo("FC Bayern Munich", 12, 6);
		Equipo e10 = new Equipo("Juventus", 11, 7);
		Equipo e11 = new Equipo("Paris Saint-Germain", 11, 7);
		Equipo e12 = new Equipo("AC Milan", 11, 7);
		Equipo e13 = new Equipo("Liverpool", 10, 8);
		Equipo e14 = new Equipo("Atletico Madrid", 11, 7);
		
		Partido p1 = new Partido("1 nov", "12:00", 3,1);
		Partido p2 = new Partido("4 nov", "14:00", 0,1);
		Partido p3 = new Partido("12 dic", "16:00", 1,1);
		Partido p4 = new Partido("7 ene", "16:00", 4,2);
		Partido p5 = new Partido("15 feb", "16:00", 2,2);
		Partido p6 = new Partido("20 jul", "16:00", 3,4);
		Partido p7 = new Partido("3 ago", "16:00", 1,3);
		
		P.adicion(e1, e2, p1);
		P.adicion(e3, e4, p2);
		P.adicion(e5, e6, p3);
		P.adicion(e7, e8, p4);
		P.adicion(e9, e10, p5);
		P.adicion(e11, e12, p6);
		P.adicion(e13, e14, p7);
		//P.mostrar();
		
		//1.MOSTRAR LOS PARTIDOS DE LA LISTA QUE TERMINARON EN EMPATE
		mostrarEmpates(P);
		
		//2.MOSTRAR EL PARTIDO QUE SE JUGO EN FECHA X
		mostarFecha(P,"7 ene");
		
		//3.CALCULAR LA CANTIDAD DE GOLES DE LSO EQUIPOS GANADORES
		calcular(P);
		
		//4.ENCONTRAR EL EQUIPO CON MAS GOLES EN UNA LISTA DE PARTIDOS
		encontrar(P);
		
		//5.ENCONTRAR EL EQUIPO CON MENOS TITULARES EN UNA LISTA DE EQUIPOS
		menosTitulares(P);
		
	}


	//1.MOSTRAR LOS PARTIDOS DE LA LISTA QUE TERMINARON EN EMPATE
	private static void mostrarEmpates(ListaEP p) {
		System.out.println("lista de partidos que terminaron en empate");
		NodoE1 r = p.getP();
		int golEquipo1,golEquipo2 ;
		String nombre1,nombre2;
		while (r != null) {
			NodoP nodoPartido = r.getSig();
			golEquipo1 = nodoPartido.getC().getNroGE1();
		    golEquipo2 = nodoPartido.getC().getNroGE2();
			nombre1 = r.getE().getNombre();
			nombre2 = r.getEnl().getB().getNombre();
			if (golEquipo1==golEquipo2) {
				System.out.println("\t"+nombre1+" "+golEquipo1+"    vs.    "+golEquipo2+" "+nombre2);
			}
			r = nodoPartido.getSig();
		}
		
	}
	

	//2.MOSTRAR EL PARTIDO QUE SE JUGO EN FECHA X
	private static void mostarFecha(ListaEP p, String x) {
		System.out.println("\nEn la fecha "+x+" se jugo:");
		String fecha,nombre1,nombre2;
		int golEquipo1,golEquipo2 ;
		NodoE1 r = p.getP();
		while (r!=null) {
			NodoP nodoPartido = r.getSig();
			golEquipo1 = nodoPartido.getC().getNroGE1();
		    golEquipo2 = nodoPartido.getC().getNroGE2();
			nombre1 = r.getE().getNombre();
			nombre2 = r.getEnl().getB().getNombre();
			fecha = nodoPartido.getC().getFecha();
			if (fecha.equals(x)) {
				
				System.out.println(nombre1+"  "+golEquipo1+"   "+golEquipo2+"  "+nombre2+"a horas "+nodoPartido.getC().getHora());
			}
			r = nodoPartido.getSig();
		}
	}
	
	//3.CALCULAR LA CANTIDAD DE GOLES DE LOS EQUIPOS GANADORES, DESCARTANDO LOS EMPATES
	private static void calcular(ListaEP p) {
		int ct = 0;
		int golEquipo1,golEquipo2 ;
		NodoE1 r = p.getP();
		while (r!=null) {
			NodoP nodoPartido = r.getSig();
			golEquipo1 = nodoPartido.getC().getNroGE1();
		    golEquipo2 = nodoPartido.getC().getNroGE2();
			if (golEquipo1>golEquipo2) {
				ct = ct+golEquipo1;
			}
			else {
				ct = ct+golEquipo2;
			}
			r = nodoPartido.getSig();
		}
		System.out.println("el total de goles de equipos ganadores es: "+ct);
		
	}
	

	
	//4.ENCONTRAR EL EQUIPO CON MAS GOLES EN UNA LISTA DE PARTIDOS
	private static void encontrar(ListaEP p) {
		int mayor = 0;
		String nombre1,nombre2,nombre="";
		int golEquipo1,golEquipo2 ;
		NodoE1 r= p.getP();
		while (r!=null) {
			NodoP nodoPartido = r.getSig();
			golEquipo1 = nodoPartido.getC().getNroGE1();
		    golEquipo2 = nodoPartido.getC().getNroGE2();
		    nombre1 = r.getE().getNombre();
			nombre2 = r.getEnl().getB().getNombre();
			if (golEquipo1>mayor) {
				mayor = golEquipo1;
				nombre = nombre1;
			}
			if (golEquipo2>mayor) {
				mayor = golEquipo2;
				nombre = nombre2;
			}
			r = nodoPartido.getSig();
		}
		System.out.println("el equipo con mas goles es "+nombre+" con "+mayor+" goles ");	
	}
	
	
	
	//5.ENCONTRAR EL EQUIPO CON MENOS TITULARES EN UNA LISTA DE EQUIPOS
	private static void menosTitulares(ListaEP p) {
		int menor = 100000,titularese1=0,titularese2=0;
		String nombre1,nombre2,nombre="";
		NodoE1 r = p.getP();
		while (r!=null) {
			NodoP nodoPartido = r.getSig();
			titularese1 = r.getE().getNroJT();
			titularese2 = r.getEnl().getB().getNroJT();
			nombre1 = r.getE().getNombre();
			nombre2 = r.getEnl().getB().getNombre();
			if (titularese1<menor) {
				menor = titularese1;
				nombre = nombre1;
			}
			if (titularese2<menor) {
				menor = titularese2;
				nombre = nombre2;
			}
			r = nodoPartido.getSig();
		}
		System.out.println("el equipo con menos titulares es "+nombre+" con "+menor+" titulares");
		
	}



}
