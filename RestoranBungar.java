/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restoran_Bungar;

/**
 *
 * @author ASUS
 */
import java.io.IOException;
import java.util.Scanner;

public class RestoranBungar {
//    String nama_menu;
    int jmlhOrang;
    String nama;
    int a, b, c, d, e;
    double harga_nasgor = 999.99,
                harga_ayam = 12345.67,
                harga_steak = 21108.40,
                harga_kwetiau = 13579.13,
                harga_kambing = 98765.43;
    double menu1,
            menu2, 
            menu3,
            menu4, 
            menu5;
    Scanner inputan = new Scanner(System.in);

    public void menu () 
    {
        System.out.println("\n Menu spesial untuk hari ini");
        System.out.println("===========================");
        
        System.out.println("    1. Nasi Goreng Spesial             @ Rp" + harga_nasgor);
        System.out.println("    2. Ayam Bakar Spesial              @ Rp" + harga_ayam);
        System.out.println("    3. Steak Sirloin Spesial           @ Rp" + harga_steak); 
        System.out.println("    4. Kwetiaw Siram Spesial           @ Rp" + harga_kwetiau);
        System.out.println("    5. Kambing Guling Spesial          @ Rp" + harga_kambing);
    }
    
    public void inputPesanan()
    {                
        System.out.println("\nPesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("1. Nasi Goreng Spesial     = ");
            int a = inputan.nextInt();
        System.out.print("2. Ayam Bakar Spesial      = ");
            int b = inputan.nextInt();
        System.out.print("3. Steak Sirloin Spesial   = ");
            int c = inputan.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial   = ");
            int d = inputan.nextInt();
        System.out.print("5. Kambing Guling Spesial  = ");
            int e = inputan.nextInt();
            
//        =============PROSES TRANSAKSI============
        double menu1 = (a * harga_nasgor);
        double menu2  = (b * harga_ayam);
        double menu3 = (c * harga_steak);
        double menu4 = (d * harga_kwetiau);
        double menu5 = (e * harga_kambing);
        
        double total = menu1 + menu2 + menu3+ menu4 + menu5;
        double diskon = total*10/(float)100;
        double total_bayar = total-diskon;
        double pembelian_perorang = total_bayar/jmlhOrang;
        
        
//        ===========PEMBELIAN===========
        System.out.println("\nSelamat menikmati makanan anda...");
        System.out.println("\nPembelian: ");
        System.out.println("1. Nasi Goreng Spesial     " + a + " Porsi * Rp" + harga_nasgor + "    = Rp        " + menu1);
        System.out.println("2. Ayam Bakar Spesial      " + b + " Porsi * Rp" + harga_ayam + "  = Rp        " + menu2);
        System.out.println("3. Steak Sirloin Spesial   " + c + " Porsi * Rp" + harga_steak + "   = Rp        " + menu3); 
        System.out.println("4. Kwetiaw Siram Spesial   " + d + " Porsi * Rp" + harga_kwetiau + "  = Rp        " + menu4);
        System.out.println("5. Kambing Guling Spesial  " + e + " Porsi * Rp" + harga_kambing + "  = Rp        " + menu5 + "\t+");
        
        System.out.println("==============================================================================");
        System.out.println("Total Pembelian                                  = Rp        " + total);
        System.out.println("\nDisc. 10 x (Masa Promosi)                        = Rp        " + diskon + "\t-");
        System.out.println("===============================================================================");
        System.out.println("Total pembelian setelah disc. 10 x               = Rp        " + total_bayar);
        System.out.println("\nPembelian per orang (Untuk " + jmlhOrang +" orang)             = Rp        " + pembelian_perorang);
        System.out.println("\n                   TERIMA KASIH ATAS KUNJUNGAN ANDA                ");
        System.out.print("                    ...tekan ENTER untuk keluar...                ");
        try{
            System.in.read();
        }catch(IOException ioe) {
            System.exit(0); // Generally used to indicate successful termination.
        }
        System.exit(0);
    }
    
    public static void main(String[] args) {     
        RestoranBungar coba = new RestoranBungar();
        
        System.out.println("Selamat siang...");
        
        System.out.print("Pesan untuk berapa orang  :  ");
        coba.jmlhOrang = coba.inputan.nextInt();
        
        System.out.print("Pesanan atas nama :  ");
        coba.nama = coba.inputan.next();
        
        coba.menu();
        coba.inputPesanan();
    }
}
