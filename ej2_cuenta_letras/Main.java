import java.util.Scanner;

/**
* problema: Ejercicio 2 - Cuenta Letras
* Autor: Yaneli Sanchez Cardenas
* grupo: GTID244
* fecha: 25/10/2026
* descripción: Clase principal para solicitar el texto y contar cuántas veces aparece cada letra.
*/

public class Main {
    /**
     * Lee una palabra, la guarda en la lista e imprime cuántas veces aparece cada letra del alfabeto.
     *
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
    // creamos el Scanner para leer la entrada desde la consola
        Scanner scanner = new Scanner(System.in);
        
       // creamos nuestra propia lista enlazada simple
        ListaSimple lista = new ListaSimple();

      // leemos la palabra completa digitada por el usuario
        if (scanner.hasNextLine()) {
            String texto = scanner.nextLine();
            
            // convertimos la palabra en un arreglo de caracteres y los insertamos uno por uno en la lista
            for (char c : texto.toCharArray()) {
                lista.agregar(c);
            }
        }

        // arreglo con 26 espacios, uno por cada letra del alfabeto (0 = a, 1 = b, ... 25 = z)
        int[] veces = new int[26];
        for (int i = 0; i < 26; i++) {
            veces[i] = lista.contarLetra((char) ('a' + i));
        }

        // primera línea: los 26 números separados por espacio
        String primera = "";
        for (int i = 0; i < 26; i++) {
            if (i > 0) {
                primera = primera + " ";
            }
            primera = primera + veces[i];
        }
        System.out.println(primera);

        // después una línea por cada letra que sí aparece en la cadena
        for (int i = 0; i < 26; i++) {
            if (veces[i] > 0) {
                System.out.println("La letra " + (char) ('a' + i) + " aparece " + veces[i] + " veces");
            }
        }
        
        //cCerramos el scanner
        scanner.close();
    }
}