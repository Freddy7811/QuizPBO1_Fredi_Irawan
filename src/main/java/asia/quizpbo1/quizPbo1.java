/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.quizpbo1;

/**
 *
 * @author Fredi Irawan
 */


import java.util.Scanner;

public class quizPbo1 {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = scanner.nextInt();

     
        int hasil = nilai1 + nilai2;

        
        System.out.printf("Nilai %d + Nilai %d = %d%n", nilai1, nilai2, hasil);

        
        System.out.println("Dikerjakan oleh Fredi Irawan NIM = 23201276");
    }
}
