package bol21;


import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guille
 */
public class Escribir {

    public static void añadir(ArrayList<String> lista) {
        
        
        FileWriter fich = null;
        PrintWriter añad = new PrintWriter(fich);
        try {
            añad = new PrintWriter(new FileWriter("TextoBol21.txt",true));
            for(int i=0; i<lista.size();i++){
               añad.println(lista.get(i)+" ");
            }
            añad.println("\n");
        } catch (IOException ex) {
            System.out.println("Error 1: "+ex.getMessage());
        } finally {
            añad.close();
        }
    }
}
