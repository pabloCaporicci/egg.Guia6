/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class guia6Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int valor1,valor2;
         System.out.println("ingrese 1º valor");
         valor1 = leer.nextInt();
         System.out.println("ingrese 2º valor");
         valor2 = leer.nextInt();
         EsMultiplo(valor1,valor2);   
    }
    public static void EsMultiplo(int valorA,int valorB){
        if (valorA % valorB == 0){
            System.out.println("es multiplo");
        }else{
            System.out.println("NO es multiplo");
        }
    }
}
