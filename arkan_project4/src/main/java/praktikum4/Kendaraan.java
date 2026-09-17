/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author caitlyn
 */
public class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkan_info() {
       System.out.println("[Info Kendaraan]");
       System.out.println("> Nama: " + nama + ".");
       System.out.println("> Kecepatan: " + kecepatan + "Km/jam.");
    }
}
