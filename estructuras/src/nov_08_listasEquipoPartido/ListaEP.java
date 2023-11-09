package nov_08_listasEquipoPartido;

public class ListaEP {
	NodoE1 p;

	public ListaEP() {
		super();
		p = null;
	}

	public NodoE1 getP() {
		return p;
	}

	public void setP(NodoE1 p) {
		this.p = p;
	}
	
	public void adicion(Equipo e1, Equipo e2,Partido p ) {
		NodoE1  nue1 = new NodoE1();
		nue1.setE(e1);
		NodoE2  nue2 = new NodoE2();
		nue2.setB(e2);
		NodoP  nue3 = new NodoP();
		nue3.setC(p);
		
		nue1.setSig(nue3);
		nue1.setEnl(nue2);
		nue2.setEnlP(nue3);
		nue3.setAnt(nue1);
		nue3.setEnl(nue2);
		
		if (getP()==null) {
			setP(nue1);
		}
		else {
			NodoE1 r1 = getP();
			NodoP r2 = r1.getSig();
			while (r2.getSig()!=null) {
				r1 = r2.getSig();
				r2 = r1.getSig();
			}
			r2.setSig(nue1);
		}
	}
		

		public void mostrar() {
			NodoE1 r1 = getP();
			while (r1!=null) {
				NodoP r2 = r1.getSig();
				NodoE2 r3 = r1.getEnl();
				r1.getE().mostrar();
				r3.getB().mostrar();
				r2.getC().mostrar();
				r1=r2.getSig();	
			}
		}
		
}
