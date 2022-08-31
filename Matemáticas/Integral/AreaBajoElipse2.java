/**
 *  Programa que calcula el área bajo la parte superior de una elipse tranladada
 *  a la derecha. Versión 2
 *
 *   y^2    (x - 3)^2
 *   --- +  ---------- = 1
 *   b^2       a^2
 *
 *  Curso de Programación
 *
 *  Temas:  Arreglos ; foreach
 *
 *  @author Roberto Méndez Méndez
 *  Fecha creación:  30-Ago-22
 *  @version 1era
 */
public class AreaBajoElipse2 {
    public static void main(String[] datos){
        // Declara el intervalo
        double[] interval = {1,5};
        // Construye la partición
        double[] partition = new double[20];
        double deltax = (interval[1] - interval[0])/20;
        for(int i=0; i< partition.length; i++ ){
            partition[i] = interval[0] + deltax*i;
        }
        double area = 0.0;
        // longitudes del eje mayor y menor
        double a = (interval[1] - interval[0])/2;
        System.out.println(a);
        double b = a;
        // Calculo del área bajo la curva
        for (double xi: partition
        ) {
            area += Math.sqrt(1 - Math.pow((xi - 3),2)/(a*a))*b*deltax;
            System.out.println(area);
        }
        // Imprime Resultados
        System.out.println("El área bajo la curva es: " + area);
    }
}
