/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean r = false;
        int cas = 0;
        Libreria lib = new Libreria();
        while (r == false) {
            JOptionPane.showMessageDialog(null, "Elixe a opcion que precise:");
            JOptionPane.showMessageDialog(null, "1 para engadir un libro\n2 para vender un libro\n3 para amosar os libros\n4 para der de baixa un libro\n5 para consultar un libro\n 6 para salir");
            cas = Integer.parseInt(JOptionPane.showInputDialog("introduzca la opcion"));

            switch (cas) {
                case 1:
                    lib.engadirLibro();
                    break;

                case 2:
                    lib.venderLibro();
                    break;

                case 3:
                    lib.AmosarLibros();
                    break;

                case 4:
                    lib.Dardebaixa();
                    break;

                case 5:
                    lib.consultarLibro();
                    break;

                case 6:
                    r = true;
            }
        }

    }

}
