package ejercicio2;

import java.util.Scanner;

/**
 * Realice un programa que cuente el número de elementos impares en posiciones
 * pares de un array.
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

    private static void ContNumImpPosImp(int[] numeros) {
        int cont = 0;
        int n = numeros.length;
        System.out.print("Números -> ");
        for (int i = 0; i <= n; i+=2) {
            if (numeros[i] % 2 == 1) {
                System.out.print(numeros[i] + " ");
                cont++;
            }
        }
        System.out.println("\nEl numero de numeros impares en posiciones pares es: " + cont);
    }

    public static void main(String[] args) {
        int[] numeros = LeerVector();
        ContNumImpPosImp(numeros);
    }

}