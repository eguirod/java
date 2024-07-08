/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg002_t1p94_enumerados;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName Main
 * @DateCreation 8 jul 2024
 * @TimeCreation 15:37:23
 * 
 * Crea un enumerado que contenga las unidades de medida de volumen que van 
 * desde mililitro hasta hectolitro, después muestra por pantalla cada valor del
 * enumerado.
 */
public class Main {
    
    // Declaración del enumerado
    enum MedidaDeVolumen {MILILITRO, CENTILITRO, DECILITRO, LITRO, DECALITRO, HECTOLITRO};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("UNIDADES DE VOLUMEN");
        System.out.println("-------------------");
        System.out.println(MedidaDeVolumen.MILILITRO);
        System.out.println(MedidaDeVolumen.CENTILITRO);
        System.out.println(MedidaDeVolumen.DECILITRO);
        System.out.println(MedidaDeVolumen.LITRO);
        System.out.println(MedidaDeVolumen.DECALITRO);
        System.out.println(MedidaDeVolumen.HECTOLITRO);
    }

}


