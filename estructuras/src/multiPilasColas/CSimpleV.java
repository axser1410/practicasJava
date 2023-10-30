package multiPilasColas;

public class CSimpleV {

    private int max = 100;
    private Vacunador v[] = new Vacunador[max + 1];
    private int ini, fin;

    CSimpleV() {
        ini = fin = 0;
    }

    int nroelem() {
        return ((max + fin - ini) % max);
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return (true);
        }
        return (false);
    }

    boolean esllena() {
        if (nroelem() == max - 1) {
            return (true);
        }
        return (false);
    }

    void adicionar(Vacunador elem) {
        if (!esllena()) {

            fin = (fin + 1) % max;
            v[fin] = elem;
        } else {
            System.out.println("Cola simple llena");
        }
    }

    Vacunador eliminar() {
        Vacunador elem = null;
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola simple vacia");
        }
        return (elem);
    }

    void mostrar() {
        Vacunador elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n VACUNADORES");
            CSimpleV aux = new CSimpleV();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            while (!aux.esvacia()) {
                elem = aux.eliminar();

                adicionar(elem);
            }
        }
    }

    void vaciar(CSimpleV a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }

}