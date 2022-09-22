/**
 *  Programa que modela un punto en RxR
 * en la forma P = (x,y)
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia
 *
 *  @author Roberto Méndez Méndez
 *  Fecha creación:  20-Septiembre-22
 *  @version 1era
 */

package Metricas1;

public class Punto2D {
    private double x;
    private double y;

    public Punto2D(){
        x = 0.0;
        y = 0.0;
    }

    public Punto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "( " + x + "," + y + " )";
    }
}
