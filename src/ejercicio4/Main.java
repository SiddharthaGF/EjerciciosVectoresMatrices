package ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa que permita dimensionar un vector por teclado, lo llene con
 * valores enteros aleatorios, al final, realice el cálculo de la suma y la media
 * aritmética de todos los elementos del vector
 */
public class Main {

    private static int[] LlenarVector() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        Random rd = new Random();
        int[] numeros = new int[n];
        System.out.print("Vector generador aleatoriamente -> ");
        for (int i = 0; i < n; i++) {
            numeros[i] = rd.nextInt(10);
            System.out.print(numeros[i] + " ");
        }
        return numeros;
    }

    private static void CalcularSumaYMedia(int[] numeros) {
        int n = numeros.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
           suma += numeros[i];
        }
        double media = (double)suma / n;
        System.out.println("\nLa suma es: " + suma);
        System.out.println("La media es: " + media);
    }

    public static void main(String[] args) {
        int[] numeros = LlenarVector();
        CalcularSumaYMedia(numeros);
    }

}