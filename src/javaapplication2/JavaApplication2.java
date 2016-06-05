/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LUCEK
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
         lista.add(1);
          lista.add(1);
           lista.add(1);
            lista.add(0);
            lista.add(3);
            lista.add(3);
            
        Random generator = new Random();

        for(int i=0; i<lista.size(); i++)
        {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println("");
        lista.remove(0);
          for(int i=0; i<lista.size(); i++)
        {
            System.out.print(lista.get(i) + ", ");
        }
    }
    
}
