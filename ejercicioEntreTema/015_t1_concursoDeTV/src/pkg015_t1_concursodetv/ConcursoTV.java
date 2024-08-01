/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg015_t1_concursodetv;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName ConcursoTV
 * @DateCreation 1 ago 2024
 * @TimeCreation 16:10:51
 */
public class ConcursoTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE OBJETOS
        Scanner sc = new Scanner(System.in);
        
        // DECLARACIÓN DE VARIABLES
        String name, surname1, surname2, lowerCaseName, chain;
        char firstLetter, lastLetter;
        boolean lettersAreSame, sameNumLettersSurnames;
        
        // ENTRADA DE DATOS
        System.out.print("Indique el nombre: ");
        name = sc.nextLine();
        System.out.print("Indique el primer apellido: ");
        surname1 = sc.nextLine();
        System.out.print("Indique el segundo apellido: ");
        surname2 = sc.nextLine();
        System.out.println("");
        
        // PROCESAMIENTO DEL NOMBRE
        lowerCaseName = name.toLowerCase();
        firstLetter = lowerCaseName.charAt(0);
        lastLetter = lowerCaseName.charAt(name.length()-1);
        lettersAreSame = firstLetter == lastLetter;
        sameNumLettersSurnames = surname1.length() == surname2.length();
        chain = lettersAreSame && sameNumLettersSurnames ? "APTA" : "NO APTA";
        
        // SALIDA DE RESULTADOS
        System.out.println("RESULTADOS");
        System.out.println(name +" "+ surname1 +" "+ surname2+ ". Persona "+ chain +
                " para participar en el concurso.");
    }

}
