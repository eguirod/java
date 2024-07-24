/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg011_t1_volumendepiramide;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName VolumenPiramide
 * @DateCreation 24 jul 2024
 * @TimeCreation 22:52:52
 */
public class VolumenPiramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE OBJETOS
        Scanner sc = new Scanner(System.in);
        
        // DECLARACIÓN DE VARIABLES
        double height, sideLengthBase, volume, squareArea;
        int equivalenceOlympicPool;
        
        // DECLARACIÓN DE CONSTANTES
        final short OLYMPIC_POOL = 2500;
        
        // ENTRADA DE DATOS
        System.out.print("Indique el lado de la base de la pirámide: ");
        sideLengthBase = sc.nextDouble();
        System.out.print("Indique la altura de la pirámide: ");
        height = sc.nextDouble();
        System.out.println("");
        
        // CÁLCULOS
        squareArea = sideLengthBase * sideLengthBase;
        volume = squareArea * height / 3;
        equivalenceOlympicPool = (int)(volume / OLYMPIC_POOL);
        
        // SALIDA DE DATOS
        System.out.println("RESULTADOS");
        System.out.println("----------");
        System.out.println("Volumen de la pirámide: "+ volume);
        System.out.println("Equivale aproximadamente a "+ equivalenceOlympicPool + " piscinas olímpicas.");
    }

}
