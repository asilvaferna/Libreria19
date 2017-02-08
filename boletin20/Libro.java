/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.Comparator;

/**
 *
 * @author Adri
 */
public class Libro implements Comparable<Libro> {

    private String titulo, autor, ISBN;
    private long precio;
    private int uds;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, long precio, int uds) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.uds = uds;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public long getPrecio() {
        return precio;
    }

    public int getUds() {
        return uds;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setUds(int uds) {
        this.uds = uds;
    }

    @Override
    public int compareTo(Libro o) {
        String a = new String(String.valueOf(this.getTitulo()));
        String b = new String(String.valueOf(o.getTitulo()));
        return a.compareTo(b);
    }

}
