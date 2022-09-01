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
public class guia6EjerciciosFund01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1; int num2;   
        //int suma;
        /**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        num1 = leer.nextInt();
        System.out.println("Ingresa otro numero:");
        num2 = leer.nextInt();
        //suma = num1 + num2;
        System.out.println("El resultado es " + (num1 +num2) + " ");
    }
}
