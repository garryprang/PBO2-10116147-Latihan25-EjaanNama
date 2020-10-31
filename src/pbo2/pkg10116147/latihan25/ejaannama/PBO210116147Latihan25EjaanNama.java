/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan25.ejaannama;

import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan ejaan sebuah nama.
 */

public class PBO210116147Latihan25EjaanNama {

    public static void ejaan(String nama, int jumlahKarakter){
        for (int i = 0; i<jumlahKarakter; i++) {
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-" + no + ": " + eja);
        }
    }
    
    public static void main(String[] args) {
        String nama;
        int jumlahKarakter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama untuk dieja: ");
        nama = input.next();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan nama " + "'" + nama + "'" + " adalah...");
        ejaan(nama,jumlahKarakter);
        System.out.println("\nDeveloped by Garry Prang");
    }
    
}
