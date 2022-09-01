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
public class guia6EjerciciosExtras10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
            dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        
        //alturas = 1 + ((float) (Math.random()));
        Scanner leer = new Scanner(System.in);
        //int producto;
        int adivino,veces=1;
        int valor1, valor2;
        valor1 = (int)(Math.random()*10);
        valor2 = (int)(Math.random()*10);
        //producto = (int) (valor1 * valor2);
        //System.out.println(valor1+"  "+valor2);
        System.out.println("El algoritmo a seleccionado 2 valores enteros entre 0 y 10, favor adivine el producto entre ambos ");
        adivino = leer.nextInt();
        
        while ( adivino !=  (int) (valor1 * valor2)){
            veces ++;
            if (adivino > (int) (valor1 * valor2)) {
                System.out.println("el valor a adivinar debe ser menor, haga otro intento");
            }else{
                System.out.println("el valor a adivinar debe ser mayor, haga otro intento");
            }
            adivino = leer.nextInt();
        }
        System.out.println("enHoraBuena.. ha adivinado le producto es: "+ (int) (valor1 * valor2) + " y los valores eran: "+valor1 + " * "+valor2);
        System.out.println("cantidad de intentos: "+veces);
        
        
    }
    
}
