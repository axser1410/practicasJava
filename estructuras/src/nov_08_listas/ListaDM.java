package nov_08_listas;

public class ListaDM {
	private NodoD p;

	public NodoD getP() {
		return p;
	}

	public void setP(NodoD p) {
		this.p = p;
	}

	public ListaDM() {
	
	}
	public void adicion(int a, String b, String c, String d, String e ) {
		NodoD nueD = new NodoD();
		nueD.setCi(a);
		nueD.setNombre(b);
		
		NodoM nueM = new NodoM();
		nueM.setNombre(c);
		nueM.setTipo(d);
		nueM.setEdad(e);
		
		nueD.setEnl(nueM);
		
		if (getP()==null) {
			setP(nueD);
		}
		else {
			NodoD r = getP();
			while (r.getSig()!=null) {
				 r=r.getSig();
			}
			r.setSig(nueD);
		}
	}
		public void mostrar() {
			NodoD r = getP();
			while (r!=null) {
				System.out.println("<DUEÑO "+r.getNombre()+" "+r.getCi());
				System.out.println("\tMascota "+r.getEnl().getNombre()+" "+r.getEnl().getTipo()+" "+r.getEnl().getEdad());
				r = r.getSig();
			}
		}
	}
	
	

