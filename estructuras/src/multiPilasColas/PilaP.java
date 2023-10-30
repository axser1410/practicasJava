package multiPilasColas;

public class PilaP {

    private int max = 30;
    private Propietario v[] = new Propietario[max + 1];
    private int tope;

    PilaP() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    int nroelem() {
        return (tope);
    }

    void adicionar(Propietario elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    Propietario eliminar() {
        Propietario elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    void mostrar() {
        Propietario elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("Mascotas de la Pila ");
            PilaP aux = new PilaP();
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

    void vaciar(PilaP a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }

    }

}