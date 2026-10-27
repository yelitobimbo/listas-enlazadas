import java.util.Scanner;

/**
* problema: Ejercicio 4 - insercion en Lista Enlazada
* autor: Yaneli Sanchez Cardenas
* Grupo: GTID244
* Fecha: 25/10/2026
* descripción: clase principal que lee los numeros hasta el final, los inserta y agrega un -1 antes de cada impar.
*/

public class Main {
    /**
     * Lee los números hasta el final de los datos, los inserta, agrega un -1 antes de cada impar e imprime el resultado.
     *
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
      // creamos el objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);
        
        // Creamos la instancia de nuestra lista enlazada propia
        ListaSimple lista = new ListaSimple();

        // leemos un numero por linea hasta que se acaben los datos (EOF)
        while (scanner.hasNextInt()) {
            int valor = scanner.nextInt();
            lista.insertar(valor); // Llamada a nuestro método de inserción
        }

        // insertamos el -1 antes de cada impar y guardamos cuantos metimos
        int insertados = lista.insertarAntesDeImpares();

        // primera linea: cantidad de nodos insertados
        System.out.println(insertados);

        // segunda linea: la lista ya actualizada
        lista.mostrar();
        
        // cerramos la lectura de la consola
        scanner.close();
    }
}
