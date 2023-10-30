package multiPilasColas;

public class Principal {
	public static void main(String[] args) {
        PilaM A = new PilaM();
        PilaM B = new PilaM();
        
        Mascota m1 = new Mascota("rocky", "perro",13);
        Mascota m2 = new Mascota("pelusa","perro",10);
        Mascota m3 = new Mascota("kira","perro",7);
        Mascota m4 = new Mascota("jacky","perro",5);
        Mascota m5 = new Mascota("emy","gato",9);
        Mascota m6 = new Mascota("manchas","perro",15);
        Mascota m7 = new Mascota("batuki","perico",3);
        Mascota m8 = new Mascota("choca","gato",12);
        Mascota m9 = new Mascota("perla","gato",15);
        A.adicionar(m1);
        A.adicionar(m2);
        A.adicionar(m3);
        A.adicionar(m4);
        A.adicionar(m5);
        A.adicionar(m6);
        A.adicionar(m7);
        A.adicionar(m8);
        A.adicionar(m9);
        System.out.println("PILA A");
        A.mostrar();
        
        System.out.println("\nPILA B");
        B.mostrar();
        //1.
        
        System.out.println("\n\n------------1-----------");
        System.out.println("mover de la pila A a la pila B las mascotas de especie x");
        solucion1(A,B,"perico");
        System.out.println("PILA A");
        A.mostrar();
        
        System.out.println("\nPILA B");
        B.mostrar();
        //2
        
        
        CSimpleV V = new CSimpleV();
        Vacunador v1 = new Vacunador("15/15/15", "raul");
        Vacunador v2 = new Vacunador("15/3/4","oscar");
        Vacunador v3 = new Vacunador("10/10/12","alex");
        Vacunador v4 = new Vacunador("12/12/12","sergio");
        V.adicionar(v1);
        V.adicionar(v2);
        V.adicionar(v3);
        V.adicionar(v4);
        System.out.println("COLA DE VACUNADORES");
        V.mostrar();
        
        
        MultiPilaP D = new MultiPilaP();
        CCircularM cc1 = new CCircularM();
        cc1.adicionar(m1);
        cc1.adicionar(m2);
        cc1.adicionar(m3);
        Propietario p1 = new Propietario("juan", "111", "123", cc1);
        D.adicionar(1, p1);
        
        CCircularM cc2 = new CCircularM();
        cc2.adicionar(m4);
        cc2.adicionar(m5);
        cc2.adicionar(m6);
        Propietario p2 = new Propietario("Ana", "222", "555", cc2);
        D.adicionar(2, p2);
        
        CCircularM cc3 = new CCircularM();
        cc3.adicionar(m7);
        Propietario p3 = new Propietario("oscar", "333", "999", cc3);
        D.adicionar(3, p3);
        
        CCircularM cc4 = new CCircularM();
        cc4.adicionar(m7);
        cc4.adicionar(m8);
        Propietario p4 = new Propietario("gabriel", "444", "352", cc4);
        D.adicionar(4, p4);
        
        CCircularM cc5 = new CCircularM();
        cc5.adicionar(m9);
        Propietario p5 = new Propietario("maria", "417", "000", cc5);
        D.adicionar(4, p5);
        D.setNp(5);
        System.out.println("\n\nMULTIPILA DE VACUNACION");
        D.mostrar();
        
        //CONTAR LAS MASCOTAS DE LA ESPECIE X VACUNADAS POR EL VACUNDAOR Y
        System.out.println("---------------------2-------------------");
        //contar(V, D, "perro","raul");
        System.out.println(D.getNp());
    }

    private static void solucion1(PilaM A, PilaM B, String x) {
        CCircularM aux = new CCircularM();
        B.vaciar(A);
        while (!B.esvacia()) {            
            Mascota mx = B.eliminar();
            if (mx.getEspecie().equals(x)) {
                aux.adicionar(mx);
            }else{
                A.adicionar(mx);
            }
        }
        while (!aux.esvacia()) {            
            B.adicionar(aux.eliminar());
        }
    }

    private static void contar(CSimpleV V, MultiPilaP D, String x, String y) {
        int s = 0, c = 0;
        CSimpleV AA = new CSimpleV();
        while (!V.esvacia()) {            
            Vacunador vx = V.eliminar();
            c = c+1;
            if (vx.getNombre().equals(y)) {
                s = s+contar(D,c,x);
            }
            AA.adicionar(vx);
        }
        V.vaciar(AA);
        System.out.println("total "+s);
    }

    private static int contar(MultiPilaP D, int c, String x) {
        PilaP aux = new PilaP();
        int z = 0;
        
        while (!D.esvacia(c)) {
            Propietario px = D.eliminar(c);
            int n = px.getM().nroelem();
            for (int i = 1; i <= n; i++) {
                Mascota mx = px.getM().eliminar();
                if (mx.getEspecie().equals(x)) {
                    z = z+1;
                }
                px.getM().adicionar(mx);
            }
            aux.adicionar(px);
        }
        D.vaciar(c, aux);
        return z;
    }
}
