/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Libreria {

    ArrayList<Libro> libros = new ArrayList();

    public void engadirLibro() {
        String tit = JOptionPane.showInputDialog("Introduce o titulo");
        String aut = JOptionPane.showInputDialog("Introduce o autor");
        String IS = JOptionPane.showInputDialog("Introduce o ISBN");
        int prz = Integer.parseInt(JOptionPane.showInputDialog("introduzca o prezo"));
        int nu = Integer.parseInt(JOptionPane.showInputDialog("introduzca a numero de libro"));
        Libro l = new Libro(tit, aut, IS, prz, nu);
        libros.add(l);
    }

    public void venderLibro() {
        String t = JOptionPane.showInputDialog("Introduce el titulo");
        for (Libro l : libros) {
            if (l.titulo.equals(t)) {
                libros.remove(l);
                break;
            }
        }
    }

    public void AmosarLibros() {
        String [] aux = new String [100];
        int cont=0;
        for (Libro l : libros) {
            aux[cont]=(l.titulo);
            cont++;
        }
        Arrays.sort(aux);
        Iterator it = libros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void Dardebaixa() {
        for (Libro l : libros) {
            if (l.nunid == 0) {
                libros.remove(l);
                break;
            }
        }
    }

    public void consultarLibro() {
        String t = JOptionPane.showInputDialog("Introduce el titulo");
        for (Libro l : libros) {
            if (l.titulo.equals(t)) {
                System.out.println(l);
            }
        }
    }
}
