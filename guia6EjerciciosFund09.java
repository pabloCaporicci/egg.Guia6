/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class guia6EjerciciosFund09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      String frasePalabra ;
        System.out.println("favor ingrese frase ");
      frasePalabra = leer.nextLine();
     
      if ("A".equals(frasePalabra.substring(0,1))){
          System.out.println("CORRECTO¡¡¡");
      }else{
          System.out.println("INCORRCTO!!! favor la proxima que empiece con A");
      }
    }
    
}
