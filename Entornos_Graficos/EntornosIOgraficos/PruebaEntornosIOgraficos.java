/**
 *  Programa que prueba los metodos los métodos para:
 *      Pedir datos
 *      Mostrar Información
 *      Buscar un archivo
 *
 *  Curso de Programación 2023-1
 *
 *  @author Anayelly Macedo Hernández y Roberto Méndez Méndez
 *  Fecha creación:  10/Sep/22
 *  @version 11/Sep/22
 */

import java.io.File;

public class PruebaEntornosIOgraficos {
    public static void main(String... arg){
        EntornosIOgraficos pd = new EntornosIOgraficos();
        char algo = pd.pideDatoChar("Ingresa un número");
        EntornosIOgraficos.imprimeMensaje("El número ingresado fue: " + algo);

        File archivo = EntornosIOgraficos.recibirArchivo();
    }

}
