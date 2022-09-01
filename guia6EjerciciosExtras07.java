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
public class guia6EjerciciosExtras07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
            de n números (n>0). El valor de n se solicitará al principio del programa y los números
            serán introducidos por el usuario. Realice dos versiones del programa, una usando el
            bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int n;
        do {
             n = leer.nextInt();
        } while (n < 0);
        
        int valor=0,contador=0,minimo=0,maximo=0,acumulador=0;
        
        do {
            contador ++;
            System.out.println("ingrese el "+contador+"º valor");
            valor = leer.nextInt();
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo || contador == 1 ) {
                minimo = valor;
            }
            acumulador += valor;
            
        } while (contador <n);

        
        
        /*while (contador < n) {
            contador ++;
            System.out.println("ingrese el "+contador+"º valor");
            valor = leer.nextInt();
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo || contador == 1 ) {
                minimo = valor;
            }
            acumulador += valor;
        }*/
        System.out.println("el valor maximo ingresado es de: " + maximo );
        System.out.println("el valor minimo ingresado es de: " + minimo );
        System.out.println("el valor promedio es: " + (float) acumulador / n );
    }
    
}
