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

    // Constructor para inicializar el nodo con un valor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}