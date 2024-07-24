/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg008_t1_palosbaraja;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName PalosBaraja
 * @DateCreation 23 jul 2024
 * @TimeCreation 23:48:00
 */
public class PalosBaraja {
    
    // Declaración del enumerado
    enum PalosDeLaBaraja {OROS, COPAS, BASTOS, ESPADAS};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PALOS DE LA BARAJA ESPAÑOLA");
        System.out.println("---------------------------");
        System.out.println("Palo 1: " + PalosDeLaBaraja.OROS);
        System.out.println("Palo 2: " + PalosDeLaBaraja.COPAS);
        System.out.println("Palo 3: " + PalosDeLaBaraja.BASTOS);
        System.out.println("Palo 4: " + PalosDeLaBaraja.ESPADAS);
    }

}
