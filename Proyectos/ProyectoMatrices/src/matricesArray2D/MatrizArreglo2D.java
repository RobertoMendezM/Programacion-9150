/**
 * Curso: Programación
 *
 * Temas: Arreglos Bidimensionales aplicados
 *          para representar matrices
 *
 * @author Roberto Méndez Méndez
 * @version 1/Oct/22
 *
 *  Actividad para el alumno:
 *    Reescrobr el método toString pata que imprima algo de la forma
 *     (a11 a12 ... a1n
 *      a21 a22 ... a2n
 *       .   .   .   .
 *      an1 an2 ... ann)
 */
package matricesArray2D;

import java.util.Scanner;

public class MatrizArreglo2D {
private int renglon;
private int columna;
private double[][] miArreglo ;

    public MatrizArreglo2D(){
        this.renglon = 2;
        this.columna = 2;
        miArreglo = new double[renglon][columna];
    }

    public MatrizArreglo2D(int renglon, int columna){
        this.renglon = renglon;
        this.columna = columna;
        miArreglo = new double[renglon][columna];
    }

    public void setMiArreglo(double[][] miArreglo) {
        this.miArreglo = miArreglo;
    }

    public double[][] getMiArreglo() {
        return miArreglo;
    }

    /**
     * Metodo que permite llenar manualmente un arreglo 2 dimensional
     * de r*n entradas.
     * @param r  número de renglones
     * @param c  número de columnas
     * @return un arreglo 2 dimensional
     */
    public void llenaDatos(int r, int c){
        Scanner lee = new Scanner(System.in);
        String usuario;

        for (int renglon = 0; renglon < miArreglo.length; renglon++)
        {
            for (int columna = 0; columna < miArreglo[renglon].length; columna++)
            {
                System.out.println("Dame el dato para la posición " + (renglon + 1)  + (columna + 1) );
                miArreglo[renglon][columna] = Double.parseDouble(lee.nextLine());
            }
            System.out.println();
        }


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
