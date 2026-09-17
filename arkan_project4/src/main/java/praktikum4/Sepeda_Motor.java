/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author caitlyn
 */
public class Sepeda_Motor extends Kendaraan{
    String jenis_mesin;
    
    // Harusnya di sini pakai @Override. Tapi pertemuan sebelumnya aku nggak sengaja melewati langkah override, jadinya sekarang aku juga mau nggak pake @Override
    // Versi dengan @Override
//    @Override
//    public void tampilkan_info() {
//        super.tampilkan_info();
//        System.out.println("Jumlah Info: " + jenis_mesin);
//    }
    
    // Versi tanpa @Override
    public void tampilkan_info_motor() {
        super.tampilkan_info();
        System.out.println("Jenis_pintu: " + jenis_mesin);
    }
}