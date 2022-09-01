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
public class guia6EjerciciosFund04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /** Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        int num1; float F ;    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados:");
        num1 = leer.nextInt();
        F = 32 + (9 * (float) num1 / 5);        
        System.out.println("Son: " +  F + " grados Fahrenheit ");
    }
    
}
