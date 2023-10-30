package colasPilasPE4;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		CSimpleP P = new CSimpleP();
		
		PilaV V = new PilaV();
		//                          nombre id precio
		Producto p1 = new Producto("leche", 111, 20);
		Producto p2 = new Producto("arroz", 222, 150);
		Producto p3 = new Producto("fideo", 333, 170);
		Producto p4 = new Producto("aceite", 444, 40);
		Producto p5 = new Producto("pan", 555, 10);
		Producto p6 = new Producto("azucar", 666, 110);
		Producto p7 = new Producto("tomate", 777, 5);
		Producto p8 = new Producto("harina", 888, 170);
		Producto p9 = new Producto("cebolla", 999, 45);
		P.adicionar(p1);
		P.adicionar(p2);
		P.adicionar(p3);
		P.adicionar(p4);
		P.adicionar(p5);
		P.adicionar(p6);
		P.adicionar(p7);
		P.adicionar(p8);
		P.adicionar(p9);
		P.mostrar();
		//                   id  nroprod  ci
		Venta v1 = new Venta(111, 5, 11111);
		Venta v2 = new Venta(222, 7, 22222);
		Venta v3 = new Venta(999, 6, 33333);
		Venta v4 = new Venta(666, 1, 44444);
		Venta v5 = new Venta(222, 8, 55555);
		Venta v6 = new Venta(666, 5, 11111);
		Venta v7 = new Venta(777, 6, 77777);
		Venta v8 = new Venta(555, 5, 88888);
		Venta v9 = new Venta(999, 9, 11111);
		V.adicionar(v1);
		V.adicionar(v2);
		V.adicionar(v3);
		V.adicionar(v4);
		V.adicionar(v5);
		V.adicionar(v6);
		V.adicionar(v7);
		V.adicionar(v8);
		V.adicionar(v9);
		V.mostrar();
		
		//1.CALCULAR EL MONTO TOTAL PAGADO POR EL CLIENTE CON EL CI X
		//System.out.println("-----------1----------");
		//calcular(V,P, 11111);
		
		//2.MOSTRAR EL NOMBRE Y EL PRECIO DEL PRODUCTO MAS VENDIDO
		//System.out.println("-----------2----------");
		//mostrar(V,P);
		
		//3.HALLAR CUAL ES EL PROMEDIO QUE GASTA UN CLIENTE EN LA TIENDA
		System.out.println("-----------3----------");
		promediar(P,V,11111);
		
		
		
	}

	private static void promediar(CSimpleP p, PilaV v, int i) {
		double total = 0,promedio=0;
		int ct = 0;
		PilaV aux = new PilaV();
		Venta elem = null;
		while (!v.esvacia()) {
			elem = v.eliminar();
			if (elem.getCi()==i) {
				int id = elem.getId();
				double precio = precioProducto(id,p);
				total = total + (precio*elem.getNroProductos());
				ct++;
			}
			aux.adicionar(elem);
		}
		promedio = total/ct;
		v.vaciar(aux);
		System.out.println("ci "+i+"   el promedio es:   "+promedio);
		
	}

	//1.CALCULAR EL MONTO TOTAL PAGADO POR EL CLIENTE CON EL CI X
	private static void calcular(PilaV v, CSimpleP p, int i) {
		double total = 0;
		PilaV aux = new PilaV();
		Venta elem = null;
		while (!v.esvacia()) {
			elem = v.eliminar();
			if (elem.getCi()==i) {
				int id = elem.getId();
				double precio = precioProducto(id,p);
				total = total + (precio*elem.getNroProductos());
			}
			aux.adicionar(elem);
		}
		v.vaciar(aux);
		System.out.println("ci "+i+"   total   "+total);
	}

	private static double precioProducto(int id, CSimpleP p) {
		double devolver = 0;
		CSimpleP aux = new CSimpleP();
		Producto elem = null;
		while (!p.esvacia()) {
			elem = p.eliminar();
			if (elem.getId()==id) {
				 devolver = elem.getPrecio();
			}
			aux.adicionar(elem);
		}
		p.vaciar(aux);
		return devolver;
	}
	
	
	//                                      nombre id precio
//                        id  nroprod  ci
	//                            venta     producto  
	//2.MOSTRAR EL NOMBRE Y EL PRECIO DEL PRODUCTO MAS VENDIDO
	private static void mostrar(PilaV v, CSimpleP p) {
		ArrayList<Integer>cis = new ArrayList<Integer>();
		int producto = 0;
		int mayor = 0;
		CSimpleP auxP = new CSimpleP();
		PilaV auxV = new PilaV();
		PilaV auxV2 = new PilaV();
		Producto elemP = new Producto();
		Venta elemV = new Venta();
		Venta elemV2 = new Venta();
		while (!v.esvacia()) {
			elemV = v.eliminar();
			producto = elemV.getNroProductos();
			while (!v.esvacia()) {
				elemV2 = v.eliminar();
				if (elemV.getId() == elemV2.getId()) {
					producto = producto+elemV2.getNroProductos();
				}
				auxV2.adicionar(elemV2);
			}
			if (producto>mayor) {
				mayor = producto;
			}
			v.vaciar(auxV2);
			auxV.adicionar(elemV);
		}
		v.vaciar(auxV);
		
		while (!v.esvacia()) {
			elemV = v.eliminar();
			producto = elemV.getNroProductos();
			while (!v.esvacia()) {
				elemV2 = v.eliminar();
				if (elemV.getId() == elemV2.getId()) {
					producto = producto+elemV2.getNroProductos();
				}
				auxV2.adicionar(elemV2);
			}
			if (producto==mayor) {
				cis.add(elemV.getId());
			}
			v.vaciar(auxV2);
			auxV.adicionar(elemV);
		}
		v.vaciar(auxV);
		
		while (!p.esvacia()) {
			elemP = p.eliminar();
			for (int i = 0; i < cis.size(); i++) {
				if (elemP.getId() == cis.get(i)) {
					System.out.println("productos mas vendidos: "+elemP.getNombre()+" "+elemP.getPrecio());
				}
			}
			auxP.adicionar(elemP);
		}
		p.vaciar(auxP);
	}
}
