/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class guia6EjerciciosFund20 {

    /**
     * @param args the command line arguments
     */

    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
      suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
      permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
      El programa deberá comprobar que los números introducidos son correctos, es decir,
      están entre el 1 y el 9.*/

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int[][] matrizMagica = new int[3][3];
        int valorReferencia = 0, valorEvaluar = 0;
        boolean esMagica = true;
        System.out.println("complete la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                do {
                    System.out.print("Posición Fila: " + (i+1)+" Columna: "+ (j+1)+" -> ");
                    matrizMagica[i][j] = leer.nextInt();
                } while (matrizMagica[i][j]<0 || matrizMagica[i][j]>10);
            }
            System.out.println(" ");
        }
        
        //la diagona principal sirve para referencia
        for (int i = 0; i < 3; i++) {
            valorReferencia += matrizMagica[i][i];
        }
        
        //primer paso analizar la diagonal secundaria
        int indiceContrario = 2;
        for (int i = 0; i < 3; i++) {
            valorEvaluar += matrizMagica[i][indiceContrario];
            indiceContrario --;
        }
        if (valorReferencia != valorEvaluar ){
            System.out.println("La Diagonal Secundaria No Coincide. NO ES MAGICA");
            esMagica = false;
        }
        //las dos diagonales coinciden validar al sumar cada fila
        if (esMagica){
            for (int i = 0; i < 3; i++) {
                valorEvaluar = 0;
                for (int j = 0; j < 3; j++) {
                    valorEvaluar += matrizMagica[i][j];
                }
                if (valorReferencia != valorEvaluar ){
                    System.out.println("La Fila " + i + " NO Coincide. NO ES MAGICA");
                    esMagica = false;
                    break;
                }                
            }
        }
        //las dos diagonales y las filas coinciden validar al sumar cada columna
        if (esMagica){
            for (int i = 0; i < 3; i++) {
                valorEvaluar = 0;
                for (int j = 0; j < 3; j++) {
                    valorEvaluar += matrizMagica[j][i];
                }
                if (valorReferencia != valorEvaluar ){
                    System.out.println("La columna " + i + " NO Coincide. NO ES MAGICA");
                    esMagica = false;
                    break;
                }                
            }
        }
        if (esMagica){        
            System.out.println("MATRIZ MAGICA¡¡¡¡¡¡");
        }
    }
}
