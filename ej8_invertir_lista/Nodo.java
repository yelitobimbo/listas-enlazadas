/**
* Problema: Ejercicio 8 - inversion de lista enlazada
* Autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripcion: clase Nodo que almacena un valor entero
*/

public class Nodo {
    // valor entero que almacena el nodo
    int dato;
    
    // puntero que apunta al siguiente nodo de la lista
    Nodo siguiente;

    // constructor para inicializar el nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}