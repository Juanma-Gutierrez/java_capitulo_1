
/**
 * Exercise: 7
 *
 * @version: 05/10/2022
 * @author: Juan Manuel Gutiérrez
 * https://github.com/Juanma-Gutierrez
 */

/*
 * Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe ver únicamente el contorno hecho con asteriscos).
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int alt = sc.nextInt();
        if (alt <= 0) {
            System.out.print("Ha introducido una altura no válida: ");
        } else {
            for (int i = 1; i <= alt; i++) {
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
        sc.close();
    }
}