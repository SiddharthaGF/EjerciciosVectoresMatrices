package ejercicio10.sub2;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa con vector que guarde números del 1 al 100 y presente en orden descendente.
 */
public class Main {

    private static int[] LlenarVector() {
        System.out.print("Vector de numeros de 1 al 100 -> ");
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
            System.out.print(numeros[i] + " ");
        }
        return numeros;
    }

    private static void ImprimirInverso(int[] numeros) {
        System.out.print("\nVector invertido -> ");
        for (int i = 99; i >= 0; i--) {
            numeros[i] = i + 1;
            System.out.print(numeros[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numeros = LlenarVector();
        ImprimirInverso(numeros);
    }

}