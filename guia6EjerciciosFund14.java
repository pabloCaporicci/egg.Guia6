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
public class guia6EjerciciosFund14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/
        
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresa un valor en euros, y la convertiremos a otras divisas");
        float euros = leer.nextFloat();
        String divisa;
        do {
            System.out.println("Ingresa la divisa, Y para Yen, D para Dolar, L para Libra");
            divisa = leer.next();
        } while (!"Y".equals(divisa) && !"D".equals(divisa) && !"L".equals(divisa));
        moneda(euros, divisa);
    }
    
    public static void moneda(float euro, String tipo) {
        double resultado = 0;
        switch (tipo) {
            case "Y":
                resultado = euro * 129.852;
                break;
            case "L":
                resultado = euro * 0.86;
                break;
            case "D":
                resultado = euro * 1.28611;
                break;
        }
        System.out.println("Los euros pasados a la divisa elegida son: " + resultado);
    }    
}
