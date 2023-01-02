package ejercicio9;

import java.util.Objects;
import java.util.Scanner;

/**
 * Realice un programa que determine si un vector de palabras (String) es capicúa,
 * esto es, para determinar si la primera y última palabra del vector son la misma,
 * la segunda y la penúltima palabra también lo son, y así sucesivamente. El
 * programa debe imprimir un mensaje indicando si el vector es o no capicúa
 */
public class Main {

    static Scanner teclado = new Scanner(System.in);

    private static boolean EsCapicua(String[] palabras) {
        int i = 0;
        int j = palabras.length - 1;
        int n = j / 2;
        while (i <= n){
            if (!Objects.equals(palabras[i], palabras[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese una frase >> ");
        String[] palabras = teclado.nextLine().split(" ");

        if (EsCapicua(palabras)) {
            System.out.println("la frase es capicúa");
        } else {
            System.out.println("La frase NO es capicúa");
        }

    }

}