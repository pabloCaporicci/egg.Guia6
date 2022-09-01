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
public class guia6EjerciciosFund18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).*/
        // TODO code application logic here
        
        int[][] matriz = new int[4][4];
        //int[][] transpuesta = new int[4][4];
        System.out.println("MATRIZ ALEATORIA 4x4");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ["+matriz[i][j]+"] ");
                //transpuesta[j][i] = matriz[i][j];
            }
            System.out.println(" ");   
        }
        System.out.println("SU TRANSPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" ["+matriz[j][i]+"] ");
            }
            System.out.println(" ");
        }
    }
    
}
