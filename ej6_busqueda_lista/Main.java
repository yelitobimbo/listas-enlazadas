import java.util.Scanner;

/**
* problema: Ejercicio 6 - busqueda en Lista Enlazada
* Autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
* descripción: clase principal para leer las cajas de dulces y buscar la suma maxima de k cajas juntas
*/

public class Main {
    /**
     * Lee las cajas de dulces, las guarda en la lista e imprime la suma máxima de k cajas juntas.
     *
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimple lista = new ListaSimple();

    // leemos N (cantidad de cajas) y K (cuantas cajas juntas puede llevar)
        int n = scanner.nextInt();
        int k = scanner.nextInt();
            
          // insertamos los dulces de cada caja en la lista
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            lista.insertar(valor);
        }

      // llamamos al método de búsqueda e imprimimos el resultado
        System.out.println(lista.buscarSumaMaxima(k));

        scanner.close();
    }
}
