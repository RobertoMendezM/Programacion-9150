/**
 *  Clase que implementa los métodos para:
 *      Pedir un character
 *      Mostrar Información
 *      Buscar un archivo
 *
 * todos con interfaz gráfica
 *
 *  Curso de Programación 2023-1
 *
 *  @author Anayelly Macedo Hernández y Roberto Méndez Méndez
 *  Fecha creación:  10/Sep/22
 *  @version 11/Sep/22
 */
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.JFileChooser;
public class EntornosIOgraficos {

    /**
     * Lee un caracter de teclado
     * @param mensaje
     * @return el caracter leído
     */
        public char pideDatoChar(String mensaje){
           String recibi = JOptionPane.showInputDialog(null,mensaje);

           return recibi.charAt(0);
        }
    /**
     * Imprime un mensaje
     * @param mensaje
     */
        public static void imprimeMensaje(String mensaje){
            JOptionPane.showMessageDialog(null,mensaje);
        }

    /**
     * Permite seleccionar un archivo mediante un entorno de ventanas
     * @return un objeto de tipo Archivo
     */
        public static File recibirArchivo(){
            File myArchivo= null;
            JFileChooser archivoSel = new JFileChooser();
            int estado = archivoSel.showOpenDialog(archivoSel.getParent());
            if(estado == JFileChooser.APPROVE_OPTION ){
                File tmpArch = archivoSel.getSelectedFile();
                String ruta = tmpArch.getAbsolutePath();
                myArchivo = new File(ruta);
            }else{
                imprimeMensaje("Lo siento no pudimos leer tu archivo");
            }

            return myArchivo;
        }

}
