/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author caitlyn
 */
public class Main {
    public static void main(String[] args) {
    // Creating Object.
        // Mobil Ghaib.
        Mobil smk = new Mobil();
        smk.nama = "ESEMKA";
        smk.kecepatan = 0;
        smk.jumlah_pintu = 0;
        
        // Sepeda Motor ... ya itu lah.
        Sepeda_Motor bk = new Sepeda_Motor();     
        bk.nama = "Beat Karbu";
        bk.kecepatan = 60;
        bk.jenis_mesin = "Karburator";
        
    // Show Off.
        System.out.println("\n>>[Root]<<"); // Jeda (biar rapi).
        
        // Root.
        smk.tampilkan_info();
        System.out.println(); // Jeda (biar rapi).
        bk.tampilkan_info();
        
        System.out.println("\n>>[Inherit]<<"); // Jeda (biar rapi).
        
        // Inherit.
        smk.tampilkan_info_mobil();
        System.out.println(); // Jeda (biar rapi).
        bk.tampilkan_info_motor();
    }
}