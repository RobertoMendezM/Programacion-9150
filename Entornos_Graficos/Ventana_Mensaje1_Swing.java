/**
 * Forma elemental de poner un mensaje grafico en pantalla
 *
 * Tema: JOptionPane.showMessageDialog
 *
 * @author Roberto Méndez Méndez
 * @version 11-May-22
 * modifcado 3/Ago/2022
 */

import javax.swing.JOptionPane;

public class Ventana_Mensaje1_Swing {

    public static  void main(String[] args){
        int Alumnos = 27;
        JOptionPane.showMessageDialog(null, "Algo gráfico por fin \n Hola");
        JOptionPane.showMessageDialog(null,"Somos "+ Alumnos + " alumnos");
        JOptionPane.showMessageDialog(null,"Je ,m'apelle Chantal \n" +
                                                                   "Mon âge est  27 \n" +
                                                                   "Je suis étudiant en programmation");
    }

}
