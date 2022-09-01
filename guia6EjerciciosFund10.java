/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class guia6EjerciciosFund10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("favor ingrese un valor positivo como limite");
           int limite = leer.nextInt();
           int sumatoria = 0;
           int valores ;
           do {
               System.out.println("ingrese valores");
               valores = leer.nextInt();
           
               sumatoria += valores;
        } while (sumatoria <= limite );
        System.out.println("salio del bucle...saludos");
    }
    
}
