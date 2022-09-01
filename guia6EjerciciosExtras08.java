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
public class guia6EjerciciosExtras08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num, pares=0, impares=0, cont=0;        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont++;
            if (num>0){
                switch (num % 2){
                  case 0:
                        pares++;
                        break;
                  default:
                        impares++;
                }
            }
        } while (num % 5 != 0);
        
        System.out.println("La cantidad de números leídos es " +cont); 
        System.out.println("La cantidad de números pares es " +pares);
        System.out.println("La cantidad de números impares es " +impares);
    }
    
}
