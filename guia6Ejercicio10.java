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
public class guia6Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("debe ingresar 4 valores positivos entre 1 y 20");

        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("ingrese " + (i + 1) + "º valor");
                numeros[i] = leer.nextInt();
            } while (numeros[i] < 1 || numeros[i] > 20);
        }
        System.out.println("Se procederá a imprimir cada valor + * segun valor");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
