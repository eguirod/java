/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg004_t1p111_operadoresaritmeticos_I;

/**
 *
 * @author Elena Guijarro <elenaguiro@gmail>
 * @nickName eguirod
 * @FileName Main
 * @DateCreation 8 jul 2024
 * @TimeCreation 16:22:14
 * Partiendo de una variable entera llamada x cuyo valor inicial es 6, haz que 
 * se muestre por pantalla la secuencia de números siguiente, aplicando una 
 * operación matemática sobre x: 6, 10, -4, 12, 3, 2, 9, -6, 0
 * Para hacer este ejercicio deberás realizar 9 operaciones matemáticas sobre la
 * variable x, y deberás utilizar cada uno de los operadores vistos en este 
 * apartado al menos una vez.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x-0);
        System.out.println(x+4);
        System.out.println(x-10);
        System.out.println(x*2);
        System.out.println(x/2);
        System.out.println(x%4);
        System.out.println(x+3);
        System.out.println(-x);
        System.out.println(x-x);
    }

}
