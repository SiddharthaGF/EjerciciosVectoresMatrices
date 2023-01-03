package ejercicio10.sub6;

import java.util.Scanner;

/**
 * Leer una palabra o frase e imprimirla al revés, se debe emplear vectores para la resolución
 */
public class Main {

    public static char[] ConvertirCadenaAVector(String cadena) {
        return cadena.toCharArray();
    }

    private static void ImprimirInverso(char[] letras) {
        System.out.print("Palabra/Frase al revés -> ");
        int n = letras.length;
        for (int i=n-1; i >= 0; i--) {
            System.out.print(letras[i]);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase >> ");
        String cadena = teclado.nextLine();
        char[] letras = ConvertirCadenaAVector(cadena);
        ImprimirInverso(letras);
    }

}