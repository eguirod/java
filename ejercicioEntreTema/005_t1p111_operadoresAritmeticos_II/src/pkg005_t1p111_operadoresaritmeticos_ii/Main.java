/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg005_t1p111_operadoresaritmeticos_ii;

import java.util.Scanner;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName Main
 * @DateCreation 8 jul 2024
 * @TimeCreation 16:29:03 
 * ¿Podrías modificar el código siguiente para que mostrara el precio con IVA de
 * la siguiente forma? (ten en cuenta que el IVA es del 21%):
 * [ Introduce el precio del producto: 8,4
 * Importe del IVA: 1.764
 * Precio con IVA: 10.164 ]
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        double importeIVA;
        double precioConIVA;
        // Declaración de constantes
        final double IVA = 0.21d;
        
        Scanner scanner = new Scanner(System.in);
        
        // Programa
        System.out.print("Introduce el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        importeIVA = precioProducto * IVA;
        precioConIVA = precioProducto + importeIVA;
        System.out.println("Importe del IVA: "+ importeIVA);
        System.out.println("Precio con IVA: "+ precioConIVA);
    }

}
