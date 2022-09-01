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
public class guia6EjerciciosFund13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
            cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de tu cuadrado");
        int cuadrado = leer.nextInt();  
        for (int i = 0; i < cuadrado; i++) { // columnas
            for (int j = 0; j < cuadrado; j++) { // filas
                if (j == 0 || j == cuadrado - 1 || i == 0 || i == cuadrado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
