
/**
 * Exercise: 8
 *
 * @version: 05/10/2022
 * @author: Juan Manuel Gutiérrez
 * https://github.com/Juanma-Gutierrez
 */

/*
 * Igual que el programa anterior, pero esta vez la pirámide debe aparecer invertida, con el vértice hacia abajo.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        // Var declarations
        int alt;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la altura de la pirámide: ");
        alt = sc.nextInt();

        // Process
        if (alt <= 0) {
            System.out.print("Ha introducido una altura no válida: ");
        } else {
            for (int i = alt; i >= 1; i--) {
                for (int j = 1; j <= alt - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    if (j <= 1 || j >= i * 2 - 1 || i == alt)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
        }

        // Close scanner
        sc.close();
    }
}