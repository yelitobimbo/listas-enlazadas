/**
* problema: Ejercicio 6 - Búsqueda en Lista Enlazada
* autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Lista simple con el metodo para buscar la suma maxima de K nodos seguidos.
*/

public class ListaSimple {
   // apuntador al inicio de la lista
    Nodo cabeza;

    /**
     * Crea una lista enlazada simple vacía.
     */
    public ListaSimple() {
        this.cabeza = null;
    }

    /**
     * Inserta un número al final de la lista.
     *
     * @param dato número que se va a insertar
     */
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

    /**
     * Busca la suma más grande que se puede hacer con k nodos seguidos de la lista.
     *
     * @param k cantidad de nodos seguidos que se suman
     * @return la suma máxima encontrada
     */
    public int buscarSumaMaxima(int k) {
        int maxima = 0;         // la mejor suma que hemos encontrado
        Nodo inicio = cabeza;   // desde que nodo empezamos a sumar

        // probamos empezar en cada nodo de la lista
        while (inicio != null) {
            int suma = 0;           // suma de este grupo
            int contados = 0;       // cuantos nodos llevamos en este grupo
            Nodo actual = inicio;

            // sumamos k nodos seguidos (o hasta que se acabe la lista)
            while (actual != null && contados < k) {
                suma = suma + actual.dato;
                contados++;
                actual = actual.siguiente; // Avanzamos al siguiente nodo
            }

            // solo cuenta si si alcanzaron los k nodos y la suma es mejor
            if (contados == k && suma > maxima) {
                maxima = suma;
            }

            inicio = inicio.siguiente; // el siguiente grupo empieza un nodo despues
        }

        return maxima;
    }
}
