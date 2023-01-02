package ejercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa en donde se dispone de N cantidad de temperaturas
 * almacenadas en un vector. Se desea calcular el promedio de las temperaturas y
 * luego imprimir en pantalla las temperaturas mayores o iguales que el promedio
 */
public class Main {

    private static int[] LlenarVector() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        Random rd = new Random();
        int[] temperaturas = new int[n];
        System.out.print("Vector de temperaturas generado aleatoriamente -> ");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = rd.nextInt(200 + 1);
            System.out.print(temperaturas[i] + " ");
        }
        return temperaturas;
    }

    private static double CalcularPromedio(int[] temperaturas) {
        double suma = 0;
        int n = temperaturas.length;
        for (int i = 0; i < n; i++) {
            suma += temperaturas[i];
        }
        return (double)suma/n;
    }

    private static void ImprimirMayoresPromedio(int[] temperaturas, double promedio) {
        System.out.print("\nValor promedio -> " + promedio);
        System.out.print("\nTemperaturas mayores al promedio -> ");
        int n = temperaturas.length;
        for (int i = 0; i < n; i++) {
           if (temperaturas[i] > promedio) {
               System.out.print(temperaturas[i] +  " ");
           }
        }
    }

    public static void main(String[] args) {
        int[] temperaturas = LlenarVector();
        double promedio = CalcularPromedio(temperaturas);
        ImprimirMayoresPromedio(temperaturas, promedio);
    }

}