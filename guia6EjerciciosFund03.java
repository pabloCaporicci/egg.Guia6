/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author PABLO
 */
public class guia6EjerciciosFund03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /** Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
            en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
         */
        
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese una frase:");
       
       String frase = leer.nextLine( );        
       System.out.println("La frase ingresada en minuscula es:" + toLowerCase(frase));
       System.out.println("La frase ingresada en mayuscula es:" + toUpperCase(frase));     
    }
}
