/**
* Problema: Ejercicio 4 - Insercion en lista enlazada
* Autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
* descripción: lista simple con operaciones para insertar, mostrar e insertar un -1 antes de cada impar.
*/

public class ListaSimple {
    // apuntador principal al inicio de la lista
    Nodo cabeza;

   // constructor que inicializa la lista vacía
    public ListaSimple() {
        this.cabeza = null;
    }

    // metodo para insertar un numero al final de la lista
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato); // Creamos el nuevo nodo con su valor
        
        // si la lista está totalmente vacía, la cabeza apunta al nuevo nodo
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            // si ya existen nodos, recorremos hasta llegar al último nodo actual
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Pasamos al siguiente nodo
            }
            // conectamos el puntero del último nodo hacia nuestro nuevo nodo
            actual.siguiente = nuevo;
        }
    }

    // metodo que inserta un nodo con -1 antes de cada nodo con numero impar
    // regresa cuantos nodos inserto
    public int insertarAntesDeImpares() {
        int insertados = 0;     // contador de nodos nuevos
        Nodo anterior = null;   // nodo que va antes del actual
        Nodo actual = cabeza;   // empezamos desde la cabeza

        while (actual != null) {
            // si el numero es impar, metemos un -1 antes de el
            if (actual.dato % 2 != 0) {
                Nodo nuevo = new Nodo(-1);
                nuevo.siguiente = actual;   // el -1 apunta al impar

                if (anterior == null) {
                    cabeza = nuevo;             // el -1 queda al inicio de la lista
                } else {
                    anterior.siguiente = nuevo; // el nodo de atrás ahora apunta al -1
                }
                insertados++;
            }
            anterior = actual;          // avanzamos (anterior siempre es un nodo original)
            actual = actual.siguiente;
        }

        return insertados;
    }

    // metodo para recorrer la lista e imprimirla con el formato 1 -> 2 -> NULL
    public void mostrar() {
        Nodo actual = cabeza; // Comenzamos el recorrido desde la cabeza
        
        // mientras existan nodos por procesar
        while (actual != null) {
            System.out.print(actual.dato + " -> "); // Imprimimos el valor y la flecha
            actual = actual.siguiente;              // Avanzamos al nodo que sigue
        }
        
        System.out.println("NULL"); // al final de la lista imprimimos NULL
    }
}
