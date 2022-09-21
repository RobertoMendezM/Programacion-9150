/**
 * Curso: Programación
 *
 * Tema: Arreglos Bidimensionales
 *       Declaración
 *
 * Book: Charatan (2019). Java in Two Semesters, 4th edition, Springer.
 *       cap 6.9 y 6.10
 *
 * Creación: 7/ Dic/ 21
 * Edición: 19/Sep/22
 */

public class UsaArregloMulti {

    public static void main(String [] dat){


        /**
         * Declaración de un arrreglo bidimencional
         */
        double [][] lugares = new double [15][3];

        int[][]  predefinido = {
                                { 38, 2, -5, 9},
                                {-6, 55, 8, 51}
                            };

        // Ragged Array
        char[][] curso = {
                            {'C', 'U', 'R','S','0'}, // 5 columnas
                            {'D','E'},               // 2 columnas
                            {'P','R','O','G','R','A','M','A','C','I','O','N'} // 12 columns
                        };

        //Asignación de valores
        lugares[0][1] = 4.7;
        lugares[12][0] = -12;


        // Forma de recorrer el arreglo
        for (int renglon = 0; renglon < curso.length; renglon++)
        {
            for (int columna = 0; columna < curso[renglon].length ; columna++)
            {
                System.out.print( curso[renglon][columna]);
            }
            System.out.println();
        }

        // Clase para manejar arreglo bidimencionales
        ManejoArregloMultidimensional mam = new ManejoArregloMultidimensional();
        mam.llenaDatos(2,2);
    }

}
