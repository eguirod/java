/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg003_t1p10_literalestipoprimitivos;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName Main
 * @DateCreation 8 jul 2024
 * @TimeCreation 15:49:11
 * Declara e inicializa las variables o constantes necesarias en Java, de forma 
 * que encajen con cada uno de los siguientes enunciados:
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de variables
        byte edadNinio = 12;
        final int VELOCIDAD_DE_LA_LUZ = 300000;
        final byte EDAD_MINIMA = 10;
        String email = "vaya@mail.com";
        double pesoAtleta = 40.12;
        final byte NUM_MESES_ANNO = 12;
        char letraDNI = 'C';
        String numeroTelefono = "887-44-42-12";
        final long DISTANCIA_TIERRA_SOL = 147_100_000_000L;
        final double DISTANCIA_RECORRIDA_LUZ = 9_460_740_478_580.8d;
        
        // Salida por pantalla
        System.out.println("La edad de un niño es "+ edadNinio +".");
        System.out.println("La velocidad de la luz es de "+ VELOCIDAD_DE_LA_LUZ +" kilómetros por segundo.");
        System.out.println("La edad mínima para apuntarse a actividades de tiro con arco es de "+ EDAD_MINIMA +" años." );
        System.out.println("El correo electrónico de una persona es "+ email +".");
        System.out.println("El peso de un atleta es de "+ pesoAtleta +" kilogramos.");
        System.out.println("El número de meses del año es "+ NUM_MESES_ANNO +".");
        System.out.println("La letra del DNI de una persona es "+ letraDNI +".");
        System.out.println("El número de teléfono es "+ numeroTelefono +".");
        System.out.println("La distancia de la tierra al sol es de "+ DISTANCIA_TIERRA_SOL +" metros.");
        System.out.println("La distancia que recorre la luz en un año es de "+ DISTANCIA_RECORRIDA_LUZ +" kilómetros.");
    }

}
