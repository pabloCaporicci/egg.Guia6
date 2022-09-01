/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author PABLO
 */
public class guia6Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(new Locale("en", "US"));

        Scanner ingresoPorTeclado = new Scanner(System.in);
        System.out.println("ingrese valor booleano...");
        //boolean variableB = ingresoPorTeclado.nextBoolean();
        
        
        System.out.println("ingrese valor con Decimales...");
        double variableD = ingresoPorTeclado.nextDouble();
         
        System.out.println("ingrese un caracter");
        //char variableC =  ingresoPorTeclado.next().charAt(1);
        //System.out.println("el caracter es:" + variableC);
        
    }
    
}
