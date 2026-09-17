/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author caitlyn
 */
public class Mobil extends Kendaraan {
    int jumlah_pintu;
    
      // Harusnya di sini pakai @Override. Tapi pertemuan sebelumnya aku nggak sengaja melewati langkah override, jadinya sekarang aku juga mau nggak pake @Override
//    @ Versi dengan Override
//    public void tampilkan_info() {
//        super.tampilkan_info();
//        System.out.println("Jumlah Info: " + jumlah_pintu);
//    }
    
    // Versi tanpa @Override
    public void tampilkan_info_mobil() {
        super.tampilkan_info();
        System.out.println("Jumlah Pintu: " + jumlah_pintu);
    }
}