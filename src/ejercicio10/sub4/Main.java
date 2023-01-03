package ejercicio10.sub4;

import java.util.Scanner;

/**
 * Leer dos vectores con numeros y unirlos en no solo
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

    private static int[] Unirvectores(int[] vector1, int[] vector2) {
        int n = vector1.length;
        int m = vector2.length;
        int[] resultado = new int[n+m];
        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i];
        }
        for (int i = 0; i < m; i++) {
            resultado[n+i] = vector2[i];
        }
        return  resultado;
    }

    public static void ImprimirVector(int[] vector) {
        System.out.print("\nVector unido -> ");
        int n = vector.length;
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] vector_1 = LeerVector();
        int[] vector_2 = LeerVector();
        int[] vectoresUnidos = Unirvectores(vector_1, vector_2);
        ImprimirVector(vectoresUnidos);
    }

}