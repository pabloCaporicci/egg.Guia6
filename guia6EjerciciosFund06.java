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
public class guia6EjerciciosFund06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** Crear un programa que dado un numero determine si es par o impar.*/    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1 = leer.nextInt();
        if (num1 %2 == 0){
            System.out.println("El numero es par");
        } else if (num1 %2 != 0) {
            System.out.println("El numero es impar");
        }
    }    
}
