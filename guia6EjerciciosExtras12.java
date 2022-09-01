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
public class guia6EjerciciosExtras12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
            0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
            Ejemplo:
            0-0-0
            0-0-1
            0-0-2
            0-0-E
            0-0-4
            0-1-2
            0-1-E
            Nota: investigar función equals() y como convertir números a String.*/
        //int cont1=0,cont2=0,cont3=0;
        String aCadena;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    aCadena = "";
                    if (i != 3) {
                        aCadena = Integer.toString(i);
                        aCadena = aCadena.concat(" - ");   
                    }else {
                        aCadena = aCadena.concat("E");
                        aCadena = aCadena.concat(" - ");   
                    }
                    if (j != 3) {
                        aCadena = aCadena.concat(Integer.toString(j));
                        aCadena = aCadena.concat(" - ");   
                    }else {
                        aCadena = aCadena.concat("E");
                        aCadena = aCadena.concat(" - ");   
                    }
                    if (k != 3) {
                        aCadena = aCadena.concat(Integer.toString(k));
                    }else {
                        aCadena = aCadena.concat("E");
                    }
                    System.out.println(aCadena);
                }
            }
        }
    }
}
