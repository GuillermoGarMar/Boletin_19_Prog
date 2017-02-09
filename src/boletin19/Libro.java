/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author ggarciamartinez
 */
public class Libro {

    public String titulo, autor, ISBN;
    public int prezo, nunid;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, int prezo, int nunid) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.nunid = nunid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", nunid=" + nunid + '}';
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getNunid() {
        return nunid;
    }

    public void setNunid(int nunid) {
        this.nunid = nunid;
    }

}
