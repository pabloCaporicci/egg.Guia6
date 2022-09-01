/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;

/**
 *
 * @author PABLO
 */
public class guia6Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroB = 15;
        int numeroA = 4;
        float sumatoria = numeroB + numeroA;
        double cociente = numeroB / (float)numeroA;
        int resta = numeroB - numeroA;
        int multiplicacion = numeroA * numeroB;
        
        boolean bandera = numeroA*2 < numeroB*4;
        
        numeroA ++;
        numeroB --;
        System.out.println(numeroA);
        System.out.println(numeroB);
        System.out.println(sumatoria);
        System.out.println(cociente);
        
        
        
    }
    
}
