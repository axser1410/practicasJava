package nov_15_ListasYLDobles;

public class Principal {
    public static void main(String[] args) {
        //1
        //Lista de participantes
        LSimpleP A = new LSimpleP();
        A.adicionar(1111, "alex", "estudiante", "UMSA");
        A.adicionar(2222, "pedro", "estudiante", "UMSA");
        A.adicionar(3333, "maria", "docente", "UMSA");
        A.adicionar(4444, "ana", "estudiante", "UMSS");
        A.adicionar(5555, "felix", "docente", "UMSS");
        A.adicionar(6666, "armando", "estudiante", "UMSA");
        A.adicionar(7777, "heidy", "estudiante", "UMSA");
        A.adicionar(8888, "leyla", "estudiante", "UMSA");
        A.adicionar(9999, "rocio", "docente", "UMSA");
        A.adicionar(1010, "karen", "docente", "UMSA");
        A.adicionar(1212, "vanessa", "estudiante", "UMSA");
        A.mostrar();
        
        
        
        
        //Lista de inscritos y actividades     
        LSimpleI I1 = new  LSimpleI();
        I1.adicionar(1111, "si");
        I1.adicionar(4444, "si");
        I1.adicionar(8888, "no");
        I1.adicionar(1212, "si");
        LDobleA C = new LDobleA();
        C.adicionar(1, "tutorial", "IA", "14/12/21", "18:00", "atrio", I1); 
        
        LSimpleI I2 = new  LSimpleI();
        I2.adicionar(2222, "si");
        I2.adicionar(3333, "no");
        I2.adicionar(5555, "no");
        I2.adicionar(6666, "si");
        C.adicionar(2, "conferencia", "redes neuronales", "1/2/23", "20:00", "paraninfo", I2); 
        
        LSimpleI I3 = new LSimpleI();
        I3.adicionar(7777, "si");
        I3.adicionar(9999, "si");
        I3.adicionar(1010, "no");
        C.adicionar(3, "taller", "seguridad informatica", "02/01/21", "10:00", "paraninfo", I3); 
        C.mostrar();
        
        
        
        //3. Mostrar a los participantes de la universidad X que sean estudiantes
        mostrar(A, "UMSA");
        
        //4. Cuantos asistieron en cada actividad
        asistieron(C);
        
        //5. De las actividades tipo X mostrar a sus inscritos (nombre) que asistieron
        mostrarInscritosDeX(A,"IA", C);
        
        //6.Registrar a un participante e inscribirlo a todos los tutoriales
        A.adicionar(159753, "Alexandre", "estudiante", "UMSA");
        registrar("Alexandre","tutorial",C, A);
        A.mostrar();
        C.mostrar();
        
    }
    
    //3. Mostrar a los participantes de la universidad X que sean estudiantes
    private static void mostrar(LSimpleP A, String x) {
        NodoP r = A.getP();
        while (r!=null) {            
            if (r.getUniv().equals(x)) {
                System.out.println(r.getNombre()+" "+r.getCi());
            }
            r = r.getSig();
        }
    }
    

    //4. Cuantos asistieron en cada actividad
    private static void asistieron(LDobleA C) {
        NodoA r = C.getP();
        while (r!=null) {            
            System.out.println("De la actividad: "+r.getDescripcion()+" asistieron "+contar(r.getA()));
            r = r.getSig();
        }
    }    
        //metodo contar
    private static int contar(LSimpleI a) {
        NodoI r = a.getP();
        int ct = 0;
        while (r!=null) { 
            if (r.getAsistio().equals("si")) 
                ct++;
            
            r = r.getSig();
        }
        return ct;
    }
    
    
    //5. De las actividades tipo X mostrar a sus inscritos (nombre) que asistieron

    private static void mostrarInscritosDeX(LSimpleP A, String x, LDobleA C) {
       System.out.println("EJ5");
       NodoA r = C.getP();
        while (r!=null) {    
            LSimpleI lista = r.getA();
            if (r.getDescripcion().equals(x)) {
                mostrarInscritos(lista, A);
            }
            r = r.getSig();
        }
    }
                //Metodo mostrar
    private static void mostrarInscritos(LSimpleI l, LSimpleP P) {
        NodoI r = l.getP();
        while (r!=null) {  
            if (r.getAsistio().equals("si")) {
                System.out.println(nombre(r.getCi(), P));
            }
            r = r.getSig();
        }
    }

    private static String nombre(int ci, LSimpleP P) {
        NodoP r = P.getP();
        while (r!=null) {            
            if (r.getCi()==ci) {
                return r.getNombre();
            }
            r = r.getSig();
        }
        
        return "";
    }

    
    //6.Registrar a un participante e inscribirlo a todos los tutoriales
    private static void registrar(String nom, String x, LDobleA C, LSimpleP A) {
        NodoA r = C.getP();
        while (r!=null) {  
            if (r.getTipo().equals(x)) {
                NodoI participante = r.getA().getP();
                LSimpleI lista = r.getA();
                NodoP w = A.getP();
                while (w!=null) {                    
                    if (w.getNombre().equals(nom)) {
                        lista.adicionar(w.getCi(), "si");
                    }
                    
                    w = w.getSig();
                }
                
            }
            
            r = r.getSig();
            
        }
    }

   

    

    
        
}
