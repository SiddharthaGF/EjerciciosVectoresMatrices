package ejercicio10.sub1;

import java.nio.file.ProviderMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Genere un arreglo de tamaño N con números reales leídos desde teclado. Calcule el promedio e indique cuántos
 * elementos del arreglo son mayores que el promedio y cuántos menores o iguales.
 */
public class Main {

    private static int[] LlenarVector() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        Random rd = new Random();
        System.out.print("Números generados aleatoriamente -> ");
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = rd.nextInt(10);
            System.out.print(numeros[i] + " ");
        }
        return numeros;
    }

    private static double Promedio(int[] numeros) {
        int suma = 0;
        int n = numeros.length;
        for (int i = 0; i < n; i++) {
            suma += numeros[i];
        }
        return (double) suma / n;
    }

    private static void MayMenPromedio(int[] numeros, double promedio) {
        int cont_may = 0, cont_men = 0, cont_igu = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= promedio) {
                cont_may++;
            } else if (numeros[i] <= promedio) {
                cont_men++;
            } else {
                cont_igu++;
            }
        }
        System.out.println("\nHay " + cont_may + " numeros mayores al promedio");
        System.out.println("Hay " + cont_men + " numeros menores al promedio");
        System.out.println("Hay " + cont_igu + " numeros iguales al promedio");
    }

    public static void main(String[] args) {
        int[] numeros = LlenarVector();
        double promedio = Promedio(numeros);
        MayMenPromedio(numeros, promedio);
    }

}