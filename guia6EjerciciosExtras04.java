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
public class guia6EjerciciosExtras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int valor;
        String enRomano="";
        do {
        System.out.println("Ingresa un valor entre 1 y 10");
        valor = leer.nextInt();
        } while (valor < 0 || valor > 10);
        switch (valor) {
            case 1: 
                enRomano = "i";
                break;
            case 2: 
                enRomano = "ii";
                break;            
            case 3: 
                enRomano = "iii";
                break;
             case 4: 
                enRomano = "iv";
                break;
            case 5: 
                enRomano = "v";
                break;            
            case 6: 
                enRomano = "vi";
                break;
            case 7: 
                enRomano = "vii";
                break;
             case 8: 
                enRomano = "viii";
                break;
            case 9: 
                enRomano = "ix";
                break;            
            case 10: 
                enRomano = "x";
                break;
            default:
                enRomano = "valor fuera de lo permitido";
        }
        System.out.println("el valor: "+ valor +" expersado en numeración romana es: "+ enRomano);
    }
    
}
