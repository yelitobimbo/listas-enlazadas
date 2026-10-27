/**
* Problema: Ejercicio 4 - Inserción en Lista Enlazada
* Autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
* descripción: clase Nodo que guarda un valor entero.
*/

public class Nodo {
  // Variable para almacenar el valor entero
    int dato;
    
   // Apuntador o enlace al siguiente nodo de la lista
    Nodo siguiente;

    /**
     * Crea un nodo que guarda un número entero. Al inicio no apunta a ningún otro nodo.
     *
     * @param dato número que se guarda en el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;       // Asignamos el número recibido
        this.siguiente = null;  // Al crearse, aún no apunta a nada
    }
}