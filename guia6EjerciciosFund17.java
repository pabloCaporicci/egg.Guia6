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
public class guia6EjerciciosFund17 {
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int contador1d = 0,contador2d = 0,contador3d = 0,contador4d = 0,contador5d = 0;
        
        String aCadena;
        int tamanio = leer.nextInt();
       
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            vector[i] = (int) (Math.random() * 10000);
            aCadena = Integer.toString(vector[i]); 
            System.out.print(" ["+vector[i]+"] ");
            switch  (aCadena.length()){
                case 1:
                    contador1d ++;
                    break;
                case 2:
                    contador2d ++;
                    break;
                case 3:
                    contador3d ++;
                    break;
                case 4:
                    contador4d ++;
                    break;
                default:
                    contador5d ++;
            }
        }
        System.out.println("");
        System.out.println("valores de 1 digito: "+contador1d);
        System.out.println("valores de 2 digitos: "+contador2d);
        System.out.println("valores de 3 digitos: "+contador3d);
        System.out.println("valores de 4 digitos: "+contador4d);
        System.out.println("valores de 5 o mas digitos: "+contador5d);
    }
    
}
