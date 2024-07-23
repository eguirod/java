/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg006_t1p111_operadoresaritmeticos_iii;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName Main
 * @DateCreation 23 jul 2024
 * @TimeCreation 22:55:49 
 * El siguiente código pregunta al usuario por la velocidad (en kilómetros por 
 * hora) y el tiempo (en segundos) de un vehículo.
 * ¿Serías capaz de modificarlo para que calculase la distancia recorrida en 
 * kilómetros y en metros? Un ejemplo de salida sería: 
 * Velocidad en kilometros por hora:30 
 * Tiempo en segundos:90
 * Distancia recorrida en kilometros:0.75 
 * Distancia recorrida en metros:750.0
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTES
        final short UNA_HORA_EN_SEGUNDOS = 3600;
        final short UN_KM_EN_M = 1000;
        
        // VARIABLES
        double kmRecorridos;
        double mRecorridos;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Velocidad en kilometros por hora: ");
        double velocidad = scanner.nextDouble();
        System.out.print("Tiempo en segundos: ");
        int segundos = scanner.nextInt();
        
        // Cálculo de distancia recorrida en KM
        kmRecorridos = velocidad / UNA_HORA_EN_SEGUNDOS * segundos;
        
        // Cálculo de distancia recorrida en M
        mRecorridos = kmRecorridos * UN_KM_EN_M;
        
        // SALIDA POR PANTALLA 
        System.out.println("Distancia recorrida en kilometros: "+ kmRecorridos);
        System.out.println("Distancia recorrida en METROS : "+ mRecorridos);
        
    }

}
