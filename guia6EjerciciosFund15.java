/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

/**
 *
 * @author PABLO
 */
public class guia6EjerciciosFund15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.*/
        int vector [] = new int [100];
        for (int i=0 ; i<100 ; i++){
            vector[i] = i+1;
        }
        for (int i=99; i >= 0 ; i--){
            System.out.print(vector[i]);
        }
        System.out.println(" ");
    }
}
 
    

