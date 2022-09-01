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
public class guia6EjerciciosExtras06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        
        //float [] vector = new float[n];
        int cont = 0;
        float suma = 0, bajos = 0;
        float alturas;
        for (int i = 0; i < n; i++) {
            alturas = 1 + ((float) (Math.random()));
            System.out.println("{" + alturas + "}");
            if (alturas < 1.6) {
                cont++;
                bajos += alturas;
            }
            suma += alturas;
        }
        if (cont > 0) {
            System.out.println("El promedio de personas con estatura por debajo de 1.6mts es " + ((float) bajos / cont));
        } else {
            System.out.println("El promedio de estatura menor a 1.6mts es cero");
        }
        System.out.println("El promedio de las estaturas en gral es " + ((float) suma / n));
    }
}
    

