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
public class guia6EjerciciosExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
          una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
          tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
            iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el valor de A: ");
        int A = leer.nextInt();
        System.out.print("ingrese el valor de B: ");
        int B = leer.nextInt();
        System.out.print("ingrese el valor de C: ");
        int C = leer.nextInt();
        System.out.print("ingrese el valor de D: ");
        int D = leer.nextInt();
        System.out.println("A = " +A+" debe toma el valor de D entonces A = "+ D);
        System.out.println("B = " +B+" debe toma el valor de C entonces B = "+ C);
        System.out.println("C = " +C+" debe toma el valor de A entonces C = "+ A);
        System.out.println("D = " +D+" debe toma el valor de B entonces C = "+ B);
        System.out.println("se procede a asignar los valores segun el enunciado utilizando solo una variable auxiliar");
        int aux = B;  
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A tomo el valor de D entonces A = "+ A);
        System.out.println("B tomo el valor de C entonces B = "+ B);
        System.out.println("C tomo el valor de D entonces A = "+ C);
        System.out.println("D tomo el valor de C entonces B = "+ D);

    }
}


/*Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
        usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.*/
        /*Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int acumulador = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("ingrese "+(i+1)+"º valor del vector");
            vector[i] = leer.nextInt();
            acumulador += vector[i];        
        }
        System.out.println("el promedio es: "+((float)acumulador/N));*/