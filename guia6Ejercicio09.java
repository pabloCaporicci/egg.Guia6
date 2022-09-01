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
public class guia6Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int resultadoAcumulado = 0;
        boolean capturoCero = false;
        int valor;
        do {
            contador ++;
            System.out.println("Ingrese " + contador +"º valor de 20");
            valor = leer.nextInt();
            if (valor == 0){
                capturoCero = true;
                break;
            } else if (valor > 0 ) {
                resultadoAcumulado += valor;
            }           
            }while (contador < 20);
        if(capturoCero){
            System.out.println("Se capturó el numero cero");
        }else{
            System.out.println("se ingresaron los 20 valores");
            System.out.println("el acumulado de los positivos es: " + resultadoAcumulado);
        }
    }
    
}
