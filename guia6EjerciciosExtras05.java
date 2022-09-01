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
public class guia6EjerciciosExtras05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresa el valor del tratamiento");
        float valor = leer.nextFloat();
        String plan;
        do {
            System.out.println("Ingresa el Plan A, B, C.");
            plan = leer.next();
        } while (!"A".equals(plan) && !"B".equals(plan) && !"C".equals(plan));
        System.out.println("el importe a pagar por el asociado segun su plan es " + costoAsociado( valor, plan) );
    }
    
    public static float costoAsociado(float importe, String planSocio) {
        float resultado = 0;
        switch (planSocio) {
            case "A":
                resultado = (float) (importe * 0.5);
                break;
            case "B":
                resultado = (float) (importe * 0.65);
                break;
            case "C":
                resultado = importe;
                break;
        }
        return resultado;
    } 
    
}
