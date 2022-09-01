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
public class guia6Ejercicio13y14 {

    /**
     13
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
     define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
     * 14
     * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("ingrese "+(i+1)+"º nombre del Equipo");
            Equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("participante "+(i+1)+": " + Equipo[i]);
        }
    }
    
}
