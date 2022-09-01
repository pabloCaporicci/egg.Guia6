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
public class guia6EjerciciosFund19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
          matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
          signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
          denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        //Scanner leer = new Scanner(System.in);
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el tamaño de los lados de la matriz -cuadrada-");
        int lados = leer.nextByte();

        int[][] matriz = new int[lados][lados];
        //int[][] transpuesta = new int[4][4];

        System.out.println("complete la matriz");
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                System.out.print("Posición Fila: " + (i+1)+" Columna: "+ (j+1)+" -> ");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("analisis si es o no AT");
        boolean esAT = true;
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (matriz[i][j] != matriz[j][i] * -1) {
                    esAT = false;
                    break;
                }
            }
            if (!esAT) {
                break;
            }
        }
        if (esAT) {
            System.out.println("la matriz ES AT");
        } else {
            System.out.println("la matriz NO es AT");
        }
    }

}
