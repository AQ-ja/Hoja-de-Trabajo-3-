/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

/**
 *
 * @author Quezada
 */

import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import static java.lang.Math.random;
import java.util.Random;


public class Escribir {
    
    public static void main(String[] args) throws IOException{
        
        int numeros = 0;
        
        Random n = new Random();
        try (FileWriter datos = new FileWriter ("C:\\Users\\Quezada\\Desktop\\Hoja-de-Trabajo-3-\\datos.txt")) {
            for (int i=0; i<3001;i++){
                numeros = n.nextInt(4000);
                datos.write( numeros + "\n");
            }
        }
        
          File archivo = null;
          FileReader Fr = null;
          BufferedReader br = null;
    try {
        archivo = new File("C:\\Users\\Quezada\\Desktop\\Hoja-de-Trabajo-3-\\datos.txt"); // Ruta desde donde se lee el txt
        Fr = new FileReader(archivo.toString());
        br = new BufferedReader(Fr);
        String linea;
        String delimiter = ","; //Separador dentro del txt. Cuando crees tu archivo de texto en la maquina separa los números por comas. No los pongas en linea recta, pon uno sobre otro

        String matriz[][] = new String[2][2]; // leera una matriz de 2*2

        int numlinea=0;

        while (((linea = br.readLine()) != null)) {

            String a[]=linea.split(delimiter);

            for(int i=0;i<a.length - 1;i++) {
                matriz[numlinea][i] = a[i];
            }
            numlinea++;
        }
         System.out.println("MATRIZ");
         System.out.println("------");
           for (int filas = 0; filas < matriz.length; filas++) {
                for (int colum = 0; colum < matriz[filas].length; colum++) {
                    System.out.print(matriz[filas][colum]+" ");
                }
                System.out.println();
            }
    } catch (IOException e) {
        System.out.println(e);
    }
        
    }  
}

    


