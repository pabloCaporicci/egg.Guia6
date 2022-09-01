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
public class guia6Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingresoValores = new Scanner(System.in);
        System.out.println("ingrese primer entero");
        int primerValor = ingresoValores.nextInt();
        
        System.out.println("ingrese segundo entero");
        int segundoValor = ingresoValores.nextInt();
        
        if (primerValor>25 || segundoValor>25){
            System.out.println("al menos uno de los valores ingresado es > que 25");
        }else{
            System.out.println("ambos valores son menores o iguales que 25");
        }
        
        
        
    }
    
}
