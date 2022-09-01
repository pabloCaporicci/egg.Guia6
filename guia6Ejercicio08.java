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
public class guia6Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota = -1;
        while (nota < 0 || nota > 10 ){
            System.out.println("ingrese nota entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
