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
public class guia6EjerciciosExtras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        Scanner leer = new Scanner(System.in);
        String letra;
        do {
            System.out.println("ingrese una letra");
            letra = leer.nextLine();
        } while (letra.length()!=1);
        
        if (letra.toLowerCase().equals("a") ||  "e".equals(letra.toLowerCase()) || "i".equals(letra.toLowerCase()) || "o".equals(letra.toLowerCase()) || "u".equals(letra.toLowerCase())){
            System.out.println("a introducido una vocal");
        } else {
            System.out.println("a introducido un caracter que no es vocal ni mayuscula ni minuscula");
        }
    }
}

        /*Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
        almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
        debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
        Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.*/
        /*Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int N = leer.nextInt();
        String[] vectorNames = new String[N];
        int[] vectorLong = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("ingrese "+(i+1)+"º nombre al vector");
            vectorNames[i] = leer.next();
            vectorLong[i]  = vectorNames[i].length();
        }
        for (int i = 0; i < N; i++) {
            System.out.println((i+1)+"º nombre: " +vectorNames[i]+" ["+vectorLong[i]+"]" );
        }*/