package ejercicio10.sub5;

import java.util.Scanner;

/**
 * definir un programa que leer un vector de numeros enteros de N elementos, si un elemento es impar se le sumara 1,
 * el vector resultante debe contener solamente numeros pares
 */
public class Main {

    private static int[] LeerVector() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos del vector >> ");
        int n = teclado.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor para la posición " + (i + 1) + " del vector >> ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }

    private static int[] ImparesAPares(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n; i++) {
            if (numeros[i]%2==1) {
                numeros[i]++;
            }
        }
        return numeros;
    }

    private static void ImprimirVector(int[] numeros) {
        System.out.print("Elementos del vector -> ");
        int n = numeros.length;
        for (int i = 0; i<n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numeros = LeerVector();
        System.out.println("Vector original");
        ImprimirVector(numeros);
        int[] numerosPares = ImparesAPares(numeros);
        System.out.println("\nVector convertido");
        ImprimirVector(numerosPares);
    }

}