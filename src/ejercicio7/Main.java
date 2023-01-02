package ejercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa que llene un vector con 20 valores aleatorios entre 150 y
 * 300, este programa debe llenar en un nuevo vector solo con aquellos valores
 * que sean mayores a 225.
 */
public class Main {

    private static int[] LlenarVector() {
        Scanner teclado = new Scanner(System.in);
        int n = 20;
        Random rd = new Random();
        int[] numeros = new int[n];
        System.out.print("Vector generador aleatoriamente -> ");
        for (int i = 0; i < n; i++) {
            numeros[i] = rd.nextInt(300-150+1) + 150;
            System.out.print(numeros[i] + " ");
        }
        return numeros;
    }

    private static void GenerarNuevoVector(int[] numeros) {
        int n = numeros.length;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] > 225) {
                cont++;
            }
        }
        int[] nuevosNumeros = new int[cont];
        int j = 0;
        System.out.print("\nElementos mayores a 225 -> ");
        for (int i = 0; i < n; i++) {
            if (numeros[i] > 225) {
                nuevosNumeros[j] = numeros[i];
                System.out.print(nuevosNumeros[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = LlenarVector();
        GenerarNuevoVector(numeros);
    }

}