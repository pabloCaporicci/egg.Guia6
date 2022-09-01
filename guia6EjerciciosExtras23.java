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
public class guia6EjerciciosExtras23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().*/
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[][] sopa = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = Integer.toString((int)(Math.random()*10)); // SE COMPLETA LA SOPA CON NUMEROS ALEATORIOS DEL 0 AL 9
            }
        }
        int filaP=0 ; // FILA EN CADA PALABRA
        int[] filasNoRepetidas = new int[5]; //VECTOR QUE GUARDA CADA FILA PARA EVITAR QUE SE REPITAN 
        // SE INICIALIZA EN CERO PARA EVITAR ERRORES.. SE VA A RECORRER EN SU TOTALIDAD EN CADA PALABRA
        for (int i = 0; i < 5; i++) {
            filasNoRepetidas[i]=0;
        }
        int columna,ultimaColumnaPosible;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese "+ (i+1) +"º palabra de 3 a 5 caracteres ");
                palabra = leer.nextLine();
            } while (palabra.length()<3 || palabra.length()>5 );
            
            ultimaColumnaPosible = 20-palabra.length();/// achica el rango del aleatorio para evitar que no pueda completar la palabra
            columna = (int)(Math.random()*(1-ultimaColumnaPosible+1)+ultimaColumnaPosible);/// formula para obtener un random en un rango especifico -> (int)(Math.random()*(X-Y+1)+Y) donde X=minimo Y=maximo ambos incluidos
  
            do {
                filaP = (int)(Math.random()*(1-20+1)+20);/// metodo para evitar que se repitan las filas y se superpongan las palabras  
            } while (!RepiteFila(filasNoRepetidas,filaP));
            filasNoRepetidas[i]=filaP;////completo el vector para que lo pueda revisar y no repita fila
            for (int j = 0; j < palabra.length(); j++) {
                sopa[filaP-1][columna-1+j]=palabra.substring(j,j+1);///reemplaza en los numeros por cada letra de cada palabra con la certeza que no repte fila
            }
        }
        // muestra la matriz con las palabras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + sopa[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    public static boolean RepiteFila(int[] filasNoRepetidas, int fila) {
        boolean puede = true;
        for (int i = 0; i < 5; i++) {
            if (filasNoRepetidas[i] == fila) {
                puede = false;
                break;
            }
        }
        return puede;
    }    
}
