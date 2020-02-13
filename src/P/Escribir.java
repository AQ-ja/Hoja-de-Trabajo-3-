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
//Importacion de paquetes a utilizar
import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import static java.lang.Math.random;
import java.util.Random;

//Se define la clase inical
public class Escribir {
    
    public static void main(String[] args) throws IOException{
        
        int numeros = 0; 
        
        Random n = new Random(); //Crear funcion random para el txt 
        try (FileWriter datos = new FileWriter ("C:\\Users\\Quezada\\Desktop\\Hoja-de-Trabajo-3-\\datos.txt")) {  //Creacion del txt 
            for (int i=0; i<3001;i++){ // for para la cantidad de numeros 
                numeros = n.nextInt(4000);
                datos.write( numeros + "\n"); //guardamos los numeros en el txt 
            }
        }
        
          File archivo = null; // empezamos con el metodo de lectura del txt 
          FileReader Fr = null;
          BufferedReader br = null;
    try {
        archivo = new File("C:\\Users\\Quezada\\Desktop\\Hoja-de-Trabajo-3-\\datos.txt"); // Ruta desde donde se lee el txt
        Fr = new FileReader(archivo.toString());
        br = new BufferedReader(Fr);
        String linea;
        String delimiter = ","; //Separador dentro del txt

        String matriz[][] = new String[2][2]; // leera una matriz de 2*2

        int numlinea=0;

        while (((linea = br.readLine()) != null)) {

            String a[]=linea.split(delimiter);

            for(int i=0;i<a.length - 1;i++) {
                matriz[numlinea][i] = a[i];
            }
            numlinea++;
        }
         System.out.println("MATRIZ"); //print de la matriz 
         System.out.println("------");
           for (int filas = 0; filas < matriz.length; filas++) {
                for (int colum = 0; colum < matriz[filas].length; colum++) {
                    System.out.print(matriz[filas][colum]+" ");
                }
                System.out.println(); // termina la impresion de la matriz 
            }
    } catch (IOException e) {
        System.out.println(e);
    }
     //empezamos con la definicon de los Sorts 
    SelectionSort ob = new SelectionSort();
    MergeSort ob2 = new MergeSort();
    QuickSort ob3 = new QuickSort();
    RadixSort ob4 = new RadixSort();
    HeadSort ob5 = new HeadSort();
    
    
    
    
    
    
    
    }
}

    


