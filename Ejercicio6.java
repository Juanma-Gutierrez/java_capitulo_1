
/**
 * Exercise: 6
 *
 * @version: 05/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
 */

import java.util.Scanner;

public class Ejercicio6 {
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
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}