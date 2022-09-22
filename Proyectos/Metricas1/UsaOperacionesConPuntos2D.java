/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        Punto2D a = new Punto2D(1,-3);
        Punto2D b = new Punto2D();
        double norma = OperacionesConPuntos2D.norma(a);
        System.out.println("La norma de " + a + " es : " + norma);

    }
}
