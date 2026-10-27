import java.util.Scanner;

/**
* Problema: Ejercicio 8 - inversion de Lista Enlazada
* autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
*descripción: Clase principal para leer dos listas ordenadas, mezclarlas e invertirlas.
*/

public class Main {
    /**
     * Lee dos listas ordenadas, las mezcla, las invierte e imprime el resultado de mayor a menor.
     *
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimple lista1 = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();

        // leemos N (cuantos numeros tiene cada lista)
        int n = scanner.nextInt();

        // leemos la primera lista
        for (int i = 0; i < n; i++) {
            lista1.insertar(scanner.nextInt());
        }

        // leemos la segunda lista
        for (int i = 0; i < n; i++) {
            lista2.insertar(scanner.nextInt());
        }

        // mezclamos las dos listas (queda de menor a mayor)
        ListaSimple mezclada = lista1.mezclarCon(lista2);

        // invertimos la lista utilizando nuestra lógica de punteros (queda de mayor a menor)
        mezclada.invertir();

        // mostramos la lista ya invertida
        mezclada.mostrar();
        
        scanner.close();
    }
}
