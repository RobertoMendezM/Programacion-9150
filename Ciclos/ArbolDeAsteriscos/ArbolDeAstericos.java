/**
 * Curso: Programación
 *
 *  Árbol de Asteriscos
 *
 * Temas Matemáticos: Series
 *                  horizontal: s(n) = 2n - 1
 *                  vertical:   s2(n) = n          n en {1,2,3,...,high}
 * Tema Computacional: Ciclos
 *
 * @author Roberto Méndez Méndez
 * @version 24/ Ago/ 22
 *
 */

import java.util.Scanner;

public class ArbolDeAstericos {

    public static void main(String... algo){
        Scanner size = new Scanner(System.in);
        System.out.print("Give me tree's size: ");
        int high = size.nextInt();
        System.out.println("Ok, Here is your tree :) \n \t Hope you like it. ");

        /**
         * Ciclos que imprime el arbol
         * high = áltura del árbol
         * NOTA: hazlo por partes y verifica que corre una  a la vez
         */
        for(int i=1; i <= high; i++) {
            for (int j = 1; j <= high - i; j++) {
                System.out.print(" ");
            }
            // System.out.println("*");
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(j%2 != 0) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
