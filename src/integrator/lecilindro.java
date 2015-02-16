/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integrator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author marcosmalta
 */
public class lecilindro  {
    
 public ArrayList<String> linhas = new ArrayList<String> ();
    
    
   public  void learquivo()  {
      try {
         
         
          
          
          BufferedReader in = new BufferedReader(new FileReader("preface.txt"));
         String str, nota = "a";
         
       //  while ((str = in.readLine()) != null) {
           while ((str = in.readLine()) != null) {
               
            linhas.add(str);
         }
          
           for (int i = 0; i < linhas.size(); i++) {  //imprime o array list
            System.out.println(linhas.get(i));  
           }
          
           
           System.out.println("Quantidades de Linhas "+ linhas.size() );  //imprime a quantidade de linhas do arraylist
             
        }
         catch (IOException e) { System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());

         }
     
   }
   
}
