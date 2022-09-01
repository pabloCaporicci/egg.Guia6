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
public class guia6Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tipo de motor (1,2,3,4)");
        int tipoMotor = leer.nextInt();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hrmigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimimenticia");
                break;
            default:
                System.out.println("Valor No Valido");
                break;
        }
    }
    
}
