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
public class guia6EjerciciosFund16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        
        int[] vector = new int[numero];
        
        for (int i = 0; i < numero; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(" " +vector[i]+ " ");
            }
        System.out.println(" ");
        System.out.println("ingrese un numero");
        int numero2 = leer.nextInt();
        String veces = "";
        int contador = 0;
        for (int i = 0; i < numero; i++) {
            if (numero2 == vector[i]) {
                veces = veces.concat(Integer.toString(i));
                veces = veces.concat(" ");
                contador++;
                }
            }
        if (contador > 0) {
            System.out.println("el valor buscado se encuetra en las siguientes posiciones " + veces);
            System.out.println("el valor se encuentra "+contador+ " veces");
            } else {
            System.out.println("el valor buscado no se encuentra en el vector");
        }
    }
}
