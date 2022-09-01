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
public class guia6EjerciciosExtras13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar. Ejemplo: si se ingresa el número 3:
        1
        12
        123*/
        
        Scanner leer = new Scanner(System.in);
        int valor;
        String aCadena="";
        do {
            System.out.print("favor ingrese un valor entero entre 1 y 10 -> ");
            valor = leer.nextInt();
            System.out.println("");
        } while (valor>10 || valor<1);
        for (int i = 0; i < valor; i++) {
            aCadena = aCadena.concat(Integer.toString(i+1));
            System.out.println(aCadena);
        }
        
    }
    
}
