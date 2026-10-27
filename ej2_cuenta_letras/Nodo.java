/**
* Problema: Ejercicio 2 - Cuenta Letras
* Autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
* descripción: Clase que representa cada nodo individual de la lista.
*/

public class Nodo {
  // guardamos el carácter  ya sea letra, espacio o símbolo, en este nodo
    char dato;
    
    // puntero o referencia que apunta al siguiente nodo en la lista
    Nodo siguiente;

    // constructor que recibe el carácter al momento de crear el nodo
    public Nodo(char dato) {
        this.dato = dato;       // Asignamos el carácter recibido
        this.siguiente = null;  // Al inicio no apunta a ningún otro nodo
    }
}