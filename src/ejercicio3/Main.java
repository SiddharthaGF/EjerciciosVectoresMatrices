package ejercicio3;

import java.util.Scanner;

/**
 * Realice un programa que solicite 10 nombres ingresados por teclado y que
 * almacene la longitud de estos nombres en un vector de tipo entero
 */
public class Main {

    private static String[] LeerVector() {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un nombre para la posición " + (i + 1) + " del vector >> ");
            nombres[i] = teclado.nextLine();

        }
        teclado.close();
        return nombres;
    }

    private static int[] ContarCaracteres(String[] nombres) {
        int n = nombres.length;
        int[] longitudes = new int[n];
        for (int i = 0; i < n; i++) {
            longitudes[i] = nombres[i].length();
        }
        return longitudes;
    }

    private static void Imprimir(String[] nombres, int[] longitudes) {
        int n = nombres.length;
        System.out.println("Longitudes: ");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " -> " + longitudes[i]);
        }
    }

    public static void main(String[] args) {
        String[] nombres = LeerVector();
        int[] longitudes = ContarCaracteres(nombres);
        Imprimir(nombres, longitudes);
    }

}