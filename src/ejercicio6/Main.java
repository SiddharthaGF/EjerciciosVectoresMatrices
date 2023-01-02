package ejercicio6;

import java.util.Scanner;

/**
 * Realice un programa que realice el producto punto entre vectores. La dimensión
 * y los valores de los vectores se deben solicitar por teclado
 */
public class Main {

    static Scanner teclado = new Scanner(System.in);

    private static int[] LeerVector(int n) {

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor para la posición " + (i + 1) + " del vector >> ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }

    private static int ProductoPunto(int[] numeros1, int[] numeros2) {
        int n = numeros1.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += numeros1[i] * numeros2[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        System.out.println("Vector 1");
        int[] numeros1 = LeerVector(n);
        System.out.println("Vector 2");
        int[] numeros2 = LeerVector(n);
        int productoPunto = ProductoPunto(numeros1, numeros2);
        System.out.println("El producto punto de los dos vectores es: " + productoPunto);
    }

}