/**
* Problema: Ejercicio 2 - Cuenta Letras
* Autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Estructura de lista enlazada simple para almacenar caracteres.
*/

public class ListaSimple {
  // apuntador al primer nodo de nuestra lista
    Nodo cabeza;

    /**
     * Crea una lista enlazada simple vacía.
     */
    public ListaSimple() {
        this.cabeza = null;
    }

    /**
     * Agrega una letra al final de la lista.
     *
     * @param dato letra que se va a agregar
     */
    public void agregar(char dato) {
        Nodo nuevo = new Nodo(dato); // Creación del nuevo nodo
        
        // si la lista está vacía, la cabeza será directamente el nuevo nodo
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
           // si ya hay elementos, recorremos la lista hasta llegar al ultimo nodo
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Avanzamos de nodo en nodo
            }
            // Enlazamos el último nodo con el nuevo nodo que creamos
            actual.siguiente = nuevo;
        }
    }

    /**
     * Recorre la lista y cuenta cuántas veces aparece una letra.
     *
     * @param letra letra que se quiere contar
     * @return cantidad de veces que aparece la letra en la lista
     */
    public int contarLetra(char letra) {
        int contador = 0;   // Inicia el contador en cero
        Nodo actual = cabeza; // Empezamos a contar desde la cabeza
        
        // mientras el nodo actual no sea nulo, seguimos revisando
        while (actual != null) {
            // si el nodo tiene la letra que buscamos, sumamos 1 al contador
            if (actual.dato == letra) {
                contador++;
            }
            actual = actual.siguiente; // Avanzamos al siguiente nodo
        }
        
        return contador; // retornamos cuántas veces apareció la letra
    }
}