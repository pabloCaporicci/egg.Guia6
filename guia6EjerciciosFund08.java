/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class guia6EjerciciosFund08 {
    
    //String frasePalabra ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in);
      String frasePalabra ;
        System.out.println("favor ingrese frase de 8 caracteres");
      frasePalabra = leer.nextLine();
      if (frasePalabra.length() == 8){
          System.out.println("CORRECTO¡¡¡");
      }else{
          System.out.println("INCORRCTO!!! pediamos 8 caracteres");
      }
    }
}
