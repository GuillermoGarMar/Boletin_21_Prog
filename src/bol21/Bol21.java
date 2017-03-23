/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class Bol21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escribir escri = new Escribir();

        ArrayList<String> listaPalabras = new ArrayList<>();
        String frases = JOptionPane.showInputDialog("escribe");
        System.out.println(frases);
        String cadena[];
        cadena = frases.split(" ");
        listaPalabras.addAll(Arrays.asList(cadena));
        Collections.sort(listaPalabras);
        Escribir.añadir("TextoBol21.txt",listaPalabras);

    }

}
