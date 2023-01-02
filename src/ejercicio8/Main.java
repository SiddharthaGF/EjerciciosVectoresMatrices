package ejercicio8;

import java.util.Scanner;

/**
 * Realice un programa que llene un vector de dimensión N con palabras
 * ingresadas por teclado y muestre en pantalla aquellas palabras que tengan una
 * dimensión mayor a un número ingresado por teclado y muestre también aquellas
 * palabras con más de 3 vocales
 */
public class Main {


    static Scanner teclado = new Scanner(System.in);

    private static String[] LeerVector() {
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        String[] palabra = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese una palabra para la posición " + (i + 1) + " del vector >> ");
            palabra[i] = teclado.next();
        }
        return palabra;
    }

    private static void ImprimirPalabras(String[] palabras){
        int n = palabras.length;
        System.out.print("Ingrese la cantidad de caracteres >> ");
        int cant_caracteres = teclado.nextInt();
        System.out.print("Palabras con mas de " + cant_caracteres + " caracteres -> ");
        for (int i = 0; i < n; i++) {
            if (palabras[i].length() > cant_caracteres) {
                System.out.print(palabras[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] palabras = LeerVector();
        ImprimirPalabras(palabras);
    }

}