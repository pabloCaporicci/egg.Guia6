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
public class guia6EjerciciosExtras01 {
    /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
       usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de minutos a convertir");
        int enMinutos = leer.nextInt();
        //int dias  = enMinutos/1440;
        //int horas = ((enMinutos-((enMinutos/1440)*1440))/60);
        
        System.out.println("La cantidad de minutos ingresada equivale a: "+(enMinutos/1440)+" dia/s, "+((enMinutos-((enMinutos/1440)*1440))/60)+" horas "+(enMinutos-((enMinutos / 1440)*1440+((enMinutos-((enMinutos/1440)*1440))/60)*60))+" minutos");
        

    }
    
}


/*     Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
        muestre por pantalla.
int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        for (int i = 0; i < 5; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(" ["+vector1[i]+"] ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(" ["+vector2[i]+"] ");
        }
        System.out.println("");*/