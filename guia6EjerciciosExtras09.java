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
public class guia6EjerciciosExtras09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        
        Scanner leer = new Scanner(System.in);
        
        int dividendo;
        
        do {
            System.out.println("Ingrese el  primer valor (que sea mayor a 1)"); 
            dividendo = leer.nextInt();
        } while (dividendo < 1);

        int divisor;
        do {
            System.out.println("Ingrese el  segundo valor (que sea mayor a 1 y menor al valor anterior)"); 
            divisor = leer.nextInt();
        } while (divisor < 1 || divisor >= dividendo);
        
        int cociente=0;
        int resto = dividendo;
        
        do {
            cociente ++;
            resto -= divisor;
        } while (resto >= divisor);
        
        System.out.println("El cociento es: " + cociente +" el resto es: " + resto );
        
    }
    
}
