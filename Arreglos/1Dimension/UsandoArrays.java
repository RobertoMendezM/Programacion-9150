/**
 * Programa que muestra un uso de la clase Arrays,
 * IntStream y OptionalInt
 * 
 * Curso: Programación Ciclo 2023-1
 *
 * Temas: Uso de Arrays, IntStream y OptionalInt
 *        Además manejo de Exception
 *
 * @author Roberto Méndez Méndez
 * Fecha: 16/ Marzo/ 22
 * Editado: 20/Septiembre/22
 */

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class UsandoArrays {

    public static void main(String[] algo){

        int[] profit = {155538, 218885, 150303};

        // Ordena el arreglo 
        Arrays.sort(profit);
        
        System.out.println("El arreglo ordenado es: ");
        for (int k:profit) {
            System.out.print(k + ", ");
        }

        // llama al método máximo
        int max = UsandoArrays.maximo(profit);
        System.out.println("\n El máximo valor del arreglo fue: " + max);

    }

    /**
     * Obtiene el máximo valor entero  en el arreglo. Hace uso de las clases
     * Arrays, IntStream y OptionalInt
     * @param datos
     * @return el máximo valor en el arroglo
     */
    public static int maximo(int[] datos){
        int max = 0;
        IntStream myIntSetram = Arrays.stream(datos);
        OptionalInt seraEntero = myIntSetram.max();
        try {
            max = seraEntero.getAsInt();
        }
        catch (NoSuchElementException e){
            System.err.println("Ni modo, no era un entero");
        }
        return max;
    }
}
