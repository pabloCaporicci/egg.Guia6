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
public class guia6EjerciciosExtras17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
        Scanner leer = new Scanner(System.in);    
        System.out.println("ingrese un entero... averiguaremos si es o no primo...");
        int numeroEvaluado = leer.nextInt();
        if (esPrimo(numeroEvaluado)) {
            System.out.println("EL NUMERO ES PRIMO¡¡¡¡¡¡");
        }else{
            System.out.println("El NUMERO NO ES PRIMO !!!!!!");
        }
        
    }
    
    public static boolean esPrimo(int aEvaluar) {    
        boolean esOnoEsPrimo = false;
        int vecesDivisible = 0;
        for (int i = 0; i < aEvaluar; i++) {
            if (i != 0 && i != 1 &&aEvaluar % i == 0    ) {
                vecesDivisible ++;
                break;
            }
        }
        if (vecesDivisible == 0) {
            esOnoEsPrimo = true;
        }
        return  esOnoEsPrimo;
    }
    
}
    