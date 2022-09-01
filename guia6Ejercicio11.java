/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package egg.introjava;
import java.util.Scanner;

public class guia6Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frasePalabra,respuestaCifrada;
        respuestaCifrada = "";
        do {
            System.out.println("Favor ingresar frase o palabra, termine con un punto (.)");
            frasePalabra = leer.nextLine();    
        } while (!".".equals(frasePalabra.substring(frasePalabra.length() - 1)));
        System.out.println("se procederá a cifrar las vocales");
       
        for (int i = 0; i < frasePalabra.length(); i++) {
            respuestaCifrada = respuestaCifrada.concat(caracter(frasePalabra.substring(i,i+1)));
        }
        System.out.println(respuestaCifrada);
    }
    public static String caracter (String letra ){
        String caracter ;
        switch (letra.toLowerCase()){
            case "a":
                caracter = "@";
                break;
            case "e":
                caracter = "#";
                break;
            case "i":
                caracter = "$";
                break;
            case "o":
                caracter = "%";
                break;
            case "u":
                caracter = "*";
                break;
            default:
                caracter = letra ;
        }
        return caracter ;
    }
}
