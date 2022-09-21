/**
 * Curso: Programación
 *
 * Temas: Arreglos Multidimensionales
 *
 * Fecha: 7/ Dic/ 21
 * @version 20/Sep/22
 */

import java.util.Scanner;

public class ManejoArregloMultidimensional {

    public ManejoArregloMultidimensional(){

    }


    /**
     * Metodo que permite llenar manualmente un arreglo 2 dimensional de r*n entradas.
     * @param r  número de renglones
     * @param c  número de columnas
     * @return un arreglo 2 dimensional
     */
    public  double[][] llenaDatos(int r, int c){
        Scanner lee = new Scanner(System.in);
        String usuario;
        double[][] datos = new double[r][c];
        for (int renglon = 0; renglon <= datos.length-1; renglon++)
        {
            for (int columna = 0; columna <= datos[renglon].length - 1; columna++)
            {
                System.out.println("Dame el dato para la posición " + (renglon + 1)  + (columna + 1) );
                datos[renglon][columna] = Double.parseDouble(lee.nextLine());
            }
            System.out.println();
        }

        return datos;
    }


}
