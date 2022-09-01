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
public class guia6EjerciciosFund05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /** Escribir un programa que lea un número entero por teclado y muestre por pantalla el
            doble, el triple y la raíz cuadrada de ese número.*/
        int num1; int dooble; int triiple;    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        num1 = leer.nextInt();
        //dooble = (num1*2);
        //triiple = (num1*3);
        float rai = (float) Math.sqrt(num1);        
        System.out.println("El doble es:" +  (num1*2) + "  ");
        System.out.println("El triple es: " +  (num1*3) + "  ");
        System.out.println("La Raíz Cuadarada es: " +  rai + " ");
    }
}
