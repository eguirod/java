/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg012_t1_analisisdeunnumero;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName AnalisisNumero
 * @DateCreation 24 jul 2024
 * @TimeCreation 23:08:45
 */
public class AnalisisNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE OBJETOS
        Scanner sc = new Scanner(System.in);
        
        // DECLARACIÓN DE VARIABLES
        int number;
        boolean isZero, isPositive, less100, isPar;
        
        // ENTRADA DE DATOS
        System.out.print("Introduzca un número entero: ");
        number = sc.nextInt();
        System.out.println("");
        
        // ANÁLISIS DEL NÚMERO
        isZero = number == 0;
        isPositive = number > 0;
        less100 = number < 100;
        isPar = number % 2 == 0;   
        
        // SALIDA
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El número es 0: "+ isZero);
        System.out.println("El número es positivo: "+ isPositive);
        System.out.println("El número es menor que 100: "+ less100);
        System.out.println("El número es par: "+ isPar);
    }

}
