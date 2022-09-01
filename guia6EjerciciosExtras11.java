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
public class guia6EjerciciosExtras11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escribir un programa que lea un número entero y devuelva el número de dígitos que
            componen ese número. Por ejemplo, si introducimos el número 12345, el programa
            deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
            de división. Nota: recordar que las variables de tipo entero truncan los números o
            resultados.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("favor ingrese un valor entero");
        int valor = leer.nextInt();
        int digitos=0,dividido10=valor;
        do {
            dividido10 = dividido10/10;
            digitos ++;
        } while (dividido10>0);
        System.out.println("el numero: " + valor + " tiene "+ digitos+" digitos");
    }
}
