/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg009_t1_calculosaritmeticos;
import java.util.Scanner;
/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName CalculosAritmeticos
 * @DateCreation 23 jul 2024
 * @TimeCreation 23:53:27
 * Escribe un programa en Java que solicite dos números reales y lleve a cabo 
 * los siguientes cálculos:
 *  el doble del primer número,
 *  la mitad del segundo número,
 *  el cuadrado de la suma de ambos números,
 *  La décima parte de la suma los cuadrados de ambos números.
 * Para ello tendrás que utilizar operadores aritméticos tales como la suma, el
producto o la división. Además, es posible que en algunos casos necesites hacer
uso de los paréntesis.
 */
public class CalculosAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // DECLARACIÓN DE VARIABLES
        // Variables de salida
        double doubleFirstNumber, halfSecondNumber, squared, oneTenth;
        // Variables de entrada
        double number1, number2;
        // DECLARACIÓN DE CLASES
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        System.out.print("Indique el primer número real: ");
        number1 = sc.nextDouble();
        System.out.print("Indique el segundo número real: ");
        number2 = sc.nextDouble();
        System.out.println("");
        
        // CÁLCULO
        doubleFirstNumber = number1 * 2;
        halfSecondNumber = number2 / 2;
        squared = (number1 + number2) * (number1 + number2);
        oneTenth = (number1 * number1 + number2 * number2) / 10;
        
        // SALIDA
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println("El doble del primer número: "+ doubleFirstNumber);
        System.out.println("La mitad del segundo número: "+ halfSecondNumber);
        System.out.println("El cuadrado de la suma de ambos números: "+ squared);
        System.out.println("La décima parte de la suma los cuadrados de ambos números: "+ oneTenth);
    }

}
