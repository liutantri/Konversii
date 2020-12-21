/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversii;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Konversii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic class Konversii {
        System.out.println("Pilihan Konversi :\n"
                        + " 1. Jam -> Menit\n"
                        + " 2. Detik -> Hari, Jam, Menit, dan Detik");
        System.out.println("\nMasukkan Pilihan");
        try (Scanner options = new Scanner(System.in)) {
            if (!options.hasNextInt()) {
                System.out.println("Itu Alfabet, Anda Salah!!!");
            } else {
                if (options.nextInt() == 1) {
                    System.out.print("Masukkan Jam : ");
                    Scanner hours = new Scanner(System.in);
                    jamKeMenit(hours.nextInt());
                } else {
                    System.out.print("Masukkan Detik : ");
                    try (Scanner seconds = new Scanner(System.in)) {
                        detikKeHari(seconds.nextLong());
                    }
                }
                
            }
            
        }
       }
    public static void jamKeMenit(long jam) {
        long menit = jam * 60;
        System.out.println("Menit: " + menit);
    }
    
    public static void detikKeHari(long detik) {
        //hari
        int hari = (int) (detik / (60 * 60 * 24));
        
        //jam
        detik %= (60 * 60 * 24);
        int jam = (int) (detik / (60 * 60));
        
        //menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);

        
        //detik
        detik %= 60;
        
        System.out.println(hari + " Hari, " + jam + "jam , " +
        menit + " menit, " + detik + " detik");
    }
}
    
  
    

