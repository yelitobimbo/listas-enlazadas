/**
* problema: ejercicio 6 - busqueda en Lista Enlazada
* autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* Fecha: 25/10/2026
* descripción: clase Nodo que almacena un valor entero para la busqueda.
*/

public class Nodo {
    // Valor entero guardado en el nodo
    int dato;
    
    // Apuntador al siguiente nodo de la lista
    Nodo siguiente;

    /**
     * Crea un nodo que guarda un número entero. Al inicio no apunta a ningún otro nodo.
     *
     * @param dato número que se guarda en el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}