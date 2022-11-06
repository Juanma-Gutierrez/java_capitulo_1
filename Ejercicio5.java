/**
 * Exercise: 5
 *
 * @version: 05/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada
 * asignatura de un color diferente.
 */

public class Ejercicio5 {
        public static void main(String args[]) {
                // Output results
                System.out.println("+-------------+-----------+-----------+-----------+-----------+-----------+");
                System.out.println("|    Hora     |   Lunes   |   Martes  | Miércoles |   Jueves  |  Viernes  |");
                System.out.println("+-------------+-----------+-----------+-----------+-----------+-----------+");
                System.out.println(
                                "| 08:15-09:15 |\033[90m Programa. \033[39;49m|\033[34m Sist.Inf. \033[39;49m|\033[95m Ent.Desa. \033[39;49m|\033[90m Programa. \033[39;49m|\033[33m Form.Or.L \033[39;49m|");
                System.out.println(
                                "| 09:15-10:15 |\033[90m Programa. \033[39;49m|\033[34m Sist.Inf. \033[39;49m|\033[95m Ent.Desa. \033[39;49m|\033[90m Programa. \033[39;49m|\033[33m Form.Or.L \033[39;49m|");
                System.out.println(
                                "| 10:15-11:15 |\033[91m Len.Marc. \033[39;49m|\033[34m Sist.Inf. \033[39;49m|\033[90m Programa. \033[39;49m|\033[91m Len.Marc. \033[39;49m|\033[33m Form.Or.L \033[39;49m|");
                System.out.println(
                                "| 11:45-12:45 |\033[91m Len.Marc. \033[39;49m|\033[90m Programa. \033[39;49m|\033[90m Programa. \033[39;49m|\033[91m Len.Marc. \033[39;49m|\033[34m Sist.Inf. \033[39;49m|");
                System.out.println(
                                "| 12:45-13:45 |\033[96m   BBDD    \033[39;49m|\033[90m Programa. \033[39;49m|\033[96m   BBDD    \033[39;49m|\033[96m   BBDD    \033[39;49m|\033[34m Sist.Inf. \033[39;49m|");
                System.out.println(
                                "| 13:45-14:45 |\033[96m   BBDD    \033[39;49m|\033[95m Ent.Desa. \033[39;49m|\033[96m   BBDD    \033[39;49m|\033[96m   BBDD    \033[39;49m|\033[34m Sist.Inf. \033[39;49m|");
                System.out.println("+-------------+-----------+-----------+-----------+-----------+-----------+");
        }
}
