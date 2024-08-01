/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg012_t1_estilosdenatacion;

import java.util.Scanner;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName EstilosNatacion
 * @DateCreation 26 jul 2024
 * @TimeCreation 16:15:27
 */
public class EstilosNatacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        double lengthPool, crolLengths, backLengths, braceLengths, crolDistance, backDistance, braceDistance, totalDistance; 
        int numberLengths;
        
        // DECLARACIÓN DE OBJETOS
        Scanner sc = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        System.out.print("Indique la cantidad de largos realizados: ");
        numberLengths = sc.nextInt();
        System.out.print("Indique el largo de la piscina: ");
        lengthPool = sc.nextDouble();
        System.out.println("");
        
        // CÁLCULOS
        totalDistance = numberLengths * lengthPool / 1000;
        backLengths = numberLengths / 2;
        crolLengths = numberLengths % 2 != 0 ? numberLengths / 2  + 1 : numberLengths - backLengths;       
        backDistance = backLengths * lengthPool;
        crolDistance = crolLengths * lengthPool;
        
        // SALIDA DE DATOS
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println("Se han nadado "+ crolDistance +" metros a crol y "+ backDistance +
            " metros a espalda, de un total de "+ totalDistance +" kilómetros.");
        System.out.println("");
        // CÁLCULOS UNA SEMANA DESPUÉS
        crolLengths = numberLengths % 4 != 0 ? numberLengths / 4 + 1 : numberLengths / 4;
        braceLengths = numberLengths % 4 == 3 ? numberLengths / 4 + 1 : numberLengths / 4;
        backDistance = backLengths * lengthPool;
        crolDistance = crolLengths * lengthPool;
        braceDistance = braceLengths * lengthPool;
        
        System.out.println("RESULTADOS TRAS UNA SEMANA");
        System.out.println("");
        System.out.println("Se han nadado "+ crolDistance +" metros a crol, " + backDistance +
            " metros a espalda y "+ braceDistance +" a brazan de un total de "+ totalDistance +" kilómetros.");
        System.out.println("");
    }

}
