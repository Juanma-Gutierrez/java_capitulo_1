/**
 * Exercise: 10
 *
 * @version: 05/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Mejora el ejercicio anterior añadiéndole colores.
 */

public class Ejercicio10 {
    public static void main(String args[]) {
        // Output data
        System.out.print("\033[33m");
        System.out.println("    ███████████                  ");
        System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒██                ");
        System.out.println("██▒▒▒▒\033[30;49m█\033[33m▒▒▒▒▒\033[30;49m█\033[33m▒▒▒▒██   \033[94mBienvenido\033[33m");
        System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█      \033[94ma la\033[33m    ");
        System.out.println("█▒▒▒\033[30;49m█\033[33m▒▒▒▒▒▒▒▒▒\033[30;49m█\033[33m▒▒▒█  \033[94mprogramación\033[33m");
        System.out.println("██▒▒▒\033[30;49m█████████\033[33m▒▒▒██    \033[94men JAVA\033[33m   ");
        System.out.println("  ██▒▒▒▒▒▒▒▒▒▒▒██                ");
        System.out.println("    ███████████                  ");
        System.out.print(" \033[39;49m");
    }
}