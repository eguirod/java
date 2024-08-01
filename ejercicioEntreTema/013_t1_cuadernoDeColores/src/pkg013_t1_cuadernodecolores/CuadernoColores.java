/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg013_t1_cuadernodecolores;
import java.util.Scanner;
/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName CuadernoColores
 * @DateCreation 1 ago 2024
 * @TimeCreation 15:33:22
 */
public class CuadernoColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE OBJETOS
        Scanner sc = new Scanner (System.in);
        
        // DECLARACIÓN DE VARIABLES
        int redSheets, blueSheets, greenSheets, totalSheets;
        
        // ENTRADA DE DATOS
        System.out.print("Indique el número de hojas del cuaderno: ");
        totalSheets = sc.nextInt();
        
        // CÁLCULO DEL COLOR DE HOJAS
        redSheets = totalSheets % 3 > 0 ? totalSheets / 3 + 1 : totalSheets / 3;
        greenSheets = totalSheets % 3 > 2 ? totalSheets / 3 + 1 : totalSheets / 3;
        blueSheets = totalSheets / 3;
        
        // SALIDA DE RESULTADOS
        System.out.println("RESULTADOS");
        System.out.println("Hojas rojas: "+ redSheets);
        System.out.println("Hojas verdes: "+ greenSheets);
        System.out.println("Hojas azules: "+ blueSheets);
        
    }

}
