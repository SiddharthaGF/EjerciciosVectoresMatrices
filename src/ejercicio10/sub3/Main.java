package ejercicio10.sub3;

import java.util.Random;
import java.util.Scanner;

/**
 * Buscar un número dentro de un vector de N elemento generado aleatoriamente, el valor debe ser ingresado por teclado
 * e imprimir en que posición se halla dicho número
 */
public class Main {

    static Scanner teclado = new Scanner(System.in);

    private static int[] LlenarVector() {
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

    private static int BuscarNumero(int[] numeros, int numero) {
        for (int i = 1; i < numeros.length; i++) {
            if (numero == numeros[i]){
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = LlenarVector();
        System.out.print("\nIngrese el valor a buscar >> ");
        int numero = teclado.nextInt();
        int posicion = BuscarNumero(numeros, numero);
        if (posicion>0){
            System.out.println("Se encontró el elemento " + numero + " en el vector en la posición " + posicion);
        } else {
            System.out.println("No se encontró el numero en el vector");
        }
    }

}