/**
* Problema: Ejercicio 8 - Inversión de Lista Enlazada
* Autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* fecha: 25/10/2026
*descripcion: Lista simple con los metodos para mezclar dos listas ordenadas e invertir el orden de sus elementos.
*/

public class ListaSimple {
    Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // metodo para insertar elementos al final de la lista
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // metodo para mezclar esta lista con otra (las dos ya vienen ordenadas de menor a mayor)
    // regresa una lista nueva con todos los numeros tambien de menor a mayor
    public ListaSimple mezclarCon(ListaSimple otra) {
        ListaSimple resultado = new ListaSimple();
        Nodo p = this.cabeza;   // recorre la primera lista
        Nodo q = otra.cabeza;   // recorre la segunda lista

        // mientras las dos tengan nodos, pasamos al resultado el mas chico
        while (p != null && q != null) {
            if (p.dato <= q.dato) {
                resultado.insertar(p.dato);
                p = p.siguiente;
            } else {
                resultado.insertar(q.dato);
                q = q.siguiente;
            }
        }

        // si a una le sobraron nodos, los pasamos todos
        while (p != null) {
            resultado.insertar(p.dato);
            p = p.siguiente;
        }
        while (q != null) {
            resultado.insertar(q.dato);
            q = q.siguiente;
        }

        return resultado;
    }

    // metodo para invertir los apuntadores de la lista enlazada
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguienteNodo = null;

        while (actual != null) {
            siguienteNodo = actual.siguiente; // guardamos el siguiente nodo temporalmente
            actual.siguiente = anterior;      // invertimos el enlace apuntando hacia atrás
            anterior = actual;                // avanzamos 'anterior' un paso
            actual = siguienteNodo;           // avanzamos 'actual' un paso
        }
        
        // la nueva cabeza de nuestra lista ahora será el último elemento que procesamos
        cabeza = anterior;
    }

    // metodo para mostrar todos los elementos de la lista separados por espacio
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" "); // espacio entre numeros (sin espacio al final)
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
