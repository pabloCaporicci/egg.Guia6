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
public class guia6EjerciciosFund11 {

    public static void main(String[] args) {

          Scanner leer = new Scanner(System.in);
          //Scanner leer = new Scanner(System.in);
          Scanner ingresar = new Scanner(System.in);
          int valor1;
          int valor2;
          int opcion;
          String resp = "";
          
          System.out.println("ingrese 1º valor");
          valor1 = leer.nextInt();
          System.out.println("ingrese 2º valor");
          valor2 = leer.nextInt();
          
          do {
              System.out.println("MENU");
              System.out.println("1. Sumar");
              System.out.println("2. Restar");
              System.out.println("3. Multiplicar");
              System.out.println("4. Dividir");
              System.out.println("5. salir");
              opcion = leer.nextInt();
              
              switch (opcion){
                  case 1:
                      System.out.println("la suma es:" + (valor1+valor2));
                      break;
                  case 2:
                      System.out.println("la resta es:" + (valor1-valor2));
                      break;
                   case 3:
                      System.out.println("la multiplicacion es:" + (valor1*valor2));
                      break;
                   case 4:
                       if (valor2 != 0){
                      System.out.println("la division es:" + (valor1/valor2));
                       }else{
                           System.out.println("no puedo dividir por 0");
                       }
                      break;
                   case 5:
                       System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                       //resp = ingresar.nextLine();
                       resp = leer.next();
                       break;
                   default: 
                       resp = "";
              }
        } while (  !"S".equals(resp));
          System.out.println("saludos");
    }   
}
