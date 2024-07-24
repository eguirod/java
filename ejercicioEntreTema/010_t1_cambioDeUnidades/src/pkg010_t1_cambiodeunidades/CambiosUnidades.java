/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg010_t1_cambiodeunidades;
import java.util.Scanner;
/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName CambiosUnidades
 * @DateCreation 24 jul 2024
 * @TimeCreation 13:53:26
 */
public class CambiosUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE OBJETOS.
        Scanner sc = new Scanner(System.in);
        
        // DECLARACIÓN DE VARIABLES
        double meters, decimeters, centimeters, milimeters, inchs, yards, feet;
        
        // ENTRADA DE DATOS
        System.out.print("Indique los metros a transformar: ");
        meters = sc.nextDouble();
        System.out.println("");
        
        // CÁLCULO DE MEDIDAS
        decimeters = meters * 10;
        centimeters = meters * 100;
        milimeters = meters * 1000;
        inchs = centimeters / 2.54;
        feet = inchs / 12;
        yards = feet / 3;
        
        // SALIDA
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("");
        System.out.println("SISTEMA INTERNACIONAL");
        System.out.println("---------------------");
        System.out.println("Decímetros: "+ decimeters);
        System.out.println("Centímetros: "+ centimeters);
        System.out.println("Milímetros: "+ milimeters);
        System.out.println("");
        System.out.println("SISTEMA ANGLOSAJÓN");
        System.out.println("------------------");
        System.out.println("Pulgadas: "+ inchs);
        System.out.println("Pies: "+ feet);
        System.out.println("Yardas: "+ yards);
    }

}
