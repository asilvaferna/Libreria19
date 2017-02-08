/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import javax.swing.JOptionPane;
import libreriaprueba.Operaciones;

/**
 *
 * @author Adri
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda libreria = new Tienda();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n 1. Añadir libro\n 2. Vender libro\n 3. Mostrar libros ordenados\n 4. Borar libros sin unidades\n 5. Consultar libro\n 6. Salir"));
        Operaciones.validarInt(num1);
        while (num1 > 0 && num1 < 6) {
            switch (num1) {
                case 1: //Añadir libro
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n 1. Añadir libro nuevo\n 2. Añadir libro existente\n 3. Retroceder"));
                    while (num2 > 0 && num2 < 3) {
                        switch (num2){
                            case 1: //Añadir libro nuevo
                                
                                break;
                            case 2: //Añadir libro existente
                                break;
                                
                        }
                    }

                    break;


                case 2: //Vender libro

                    break;
                case 3: //Mostrar libros ordenados
                    libreria.mostrarOrdenado();
                    break;
                case 4: //Dar de baja libros sin uds
                    libreria.borrarSinUnidades();
                    break;
                case 5: //Consultar libro
                    String isbn = JOptionPane.showInputDialog("Introduce el ISBN a consultar: ");
                    libreria.mostrarLibro(isbn);
                    break;

            }
            num1 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n 1. Añadir libro\n 2. Vender libro\n 3. Mostrar libros ordenados\n 4. Borar libros sin unidades\n 5. Consultar libro\n 6. Salir"));
        }
    }

}
