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
public class guia6EjerciciosFund21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.
        Ejemplo:
        Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
        4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.*/
        int[][] matriz = new int[10][10];
        int[][] matrizP = new int[3][3];
        int veces = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
           //     matriz[i][j] = leer.nextInt();
               // matriz[i][j]=j+1;
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("ingrese los valores de la matrizP");
        for (int j = 0; j < 3; j++) {
            for (int h = 0; h < 3; h++) {
                System.out.print("Posición Fila: " + (j+1)+" Columna: "+ (h+1)+" -> ");
                matrizP[j][h] = leer.nextInt();
            }
            System.out.println(" ");
        }
        //String cadena = "";
        int contador= 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == matrizP[0][0]) {
                    if (i + 2 < 10 && j + 2 < 10) {
                        contador = 0;
                        for (int h = 0; h < 3; h++) {
                            for (int k = 0; k < 3; k++) {
                                if (matriz[i + h][j + k] != matrizP[h][k]) {
                                    contador++;
                                    break;
                                }
                                if (contador>0){
                                    break;
                                }
                            }
                        }
                        if (contador == 0){
                            veces ++;
                            System.out.println(veces + "º Aparición... seguimos Analizando");
                            System.out.println("la matrizP se encuentra en la posicion: "+i+ ","+j);
                        }
                    }
                }
            }
        }
        if (veces==0){
            System.out.println("la matrizP NO se encuentra en matriz");
        }else{
            System.out.println("Total de Apariciones: "+ veces);
        }
    }    
}
