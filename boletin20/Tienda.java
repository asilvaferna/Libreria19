/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author Adri
 */
public class Tienda {

    private ArrayList<Libro> libreria = new ArrayList<>();

    public ArrayList<Libro> getLibreria() {
        return libreria;
    }

    public void añadeLibro(Libro l) {
        Iterator itLibreria = getLibreria().iterator();
        while (itLibreria.hasNext()) {
            Libro objeto = (Libro) itLibreria.next();
            if (l.getISBN().equals(objeto.getISBN())) {
                objeto.setUds(objeto.getUds() + 1);
            } else {
                getLibreria().add(l);
            }
        }
    }
    
    public void vendeLibro(Libro l) {
        Iterator itLibreria = getLibreria().iterator();
        while (itLibreria.hasNext()) {
            Libro objeto = (Libro) itLibreria.next();
            if (l.getISBN().equals(objeto.getISBN())) {
                if (objeto.getUds() > 1) {
                    objeto.setUds(objeto.getUds() - 1);
                } else {
                    getLibreria().remove(objeto);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El libro no existe");
            }
        }
    }

    public void mostrarOrdenado() {
        Collections.sort(getLibreria());
        Iterator itLibreria = getLibreria().iterator();
        while (itLibreria.hasNext()) {
            Libro objeto = (Libro) itLibreria.next();
            JOptionPane.showMessageDialog(null, "Titulo: " + objeto.getTitulo() + ", autor: " + objeto.getAutor() + ", ISBN: " + objeto.getISBN() + ", precio: " + objeto.getPrecio() + "€" + ", nº unidades: " + objeto.getUds());
        }
    }

    public void borrarSinUnidades() {
        Iterator itLibreria = getLibreria().iterator();
        int acum = 0;
        while (itLibreria.hasNext()) {
            Libro objeto = (Libro) itLibreria.next();
            if (objeto.getUds() == 0) {
                acum++;
                getLibreria().remove(objeto);
            }
        }
        JOptionPane.showMessageDialog(null, acum + " unidades eliminadas");
    }

    public void mostrarLibro(String isbn) {
        Iterator itLibreria = getLibreria().iterator();
        while (itLibreria.hasNext()) {
            Libro objeto = (Libro) itLibreria.next();
            if (objeto.getISBN().equals(isbn)) {
                JOptionPane.showMessageDialog(null, "Titulo: " + objeto.getTitulo() + ", autor: " + objeto.getAutor() + ", ISBN: " + objeto.getISBN() + ", precio: " + objeto.getPrecio() + "€" + ", nº unidades: " + objeto.getUds());
            }
        }

    }
}
