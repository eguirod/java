/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg007_t1_p115_operadorcondicional;
import java.util.Scanner;
/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName CalcularParImpar
 * @DateCreation 23 jul 2024
 * @TimeCreation 23:15:34
 * Sabemos si un número es par o impar (divisible entre dos) si el resto de la 
 * división entera de ese número entre dos es cero o uno. 
 * Escribe un programa en Java que pida un número entero al usuario e indique si
 * ese número es par o impar.
 */
public class CalcularParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        int number;
        double temp;
        String output;
        
        // DECLARACIÓN DE CLASES
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        System.out.print("Indique el número: ");
        number = sc.nextInt();
        
        // CÁLCUO DE SI ES PAR O IMPAR
        temp = number % 2;
        output = temp == 0 ? "es par" : "es impar";
        
        // SALIDA
        System.out.println("El número "+ number +" "+ output +".");
    }

}
