/**
 *  Programa que calcula el area bajo la parte superior de una elipse tranladada
 *  a la derecha
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
 *
 *
 *  
 *  Fecha creación:  30-Ago-22
 *  @version 1era
 */
public class AreaBajoElipse1 {
    
   public static void main(String[] datos){
       double[] particion = {1, 2,3,4,5};
       double deltax = particion[1] - particion[0];
       double area = 0.0;
       double a = particion[particion.length - 1]  - (particion[particion.length - 1] + particion[0])/2;
       System.out.println(a);
       double b = a;
       for (double xi: particion
            ) {
           area += Math.sqrt(1 - Math.pow((xi - 3),2)/(a*a))*b*deltax;
           System.out.println(area);
       }

       System.out.println("El área bajo la curva es: " + area);
       
       
       
   } 
}
