/**
 * Ejemplos de definición, acceso y
 * asignación de valor en arreglos
 *
 * Curso: Programación
 *
 * Fecha: 14 marzo de 2022
 * @author: Roberto Méndez
 */

import java.util.Scanner;

public class Def_Acceso_Asigna_Arreglos1D {

    public static void main(String[] algo){
        Scanner datos = new Scanner(System.in);

        double[] comorbilidades = new double[12];

        int[] defunciones = {110000, 123000, 213000};

        /**
         *      Ciclos para recorrer el arreglo
          */

        // foreach
        for (int k:defunciones) {
            System.out.println(k);
        }

        int k=0;
        while( k < defunciones.length){
            System.out.println(defunciones[k]);
            k++;
        }

        for(int i=0; i<12; i++){
            System.out.println("La comorbilidad " + i + " es: ");
            comorbilidades[i] = datos.nextDouble();
        }

        // Asignación de valor a una posición del arreglo
        System.out.println("Ingresa una comorbilidad ");
        comorbilidades[0] = datos.nextDouble();

        double d = comorbilidades[2];
    }


}
