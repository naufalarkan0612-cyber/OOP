/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author caitlyn
 */
public class Hewan {
    String makanan;
    int jumlah;    
    
    public void bersuara() {
        System.out.println("..."); // Ini hewan apa, hey?!
    }
    
    public void makan(String makanan) {
        System.out.println("Aku makan " + makanan); // Manusia kan hewan juga.
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Aku makan " + jumlah + " " + makanan);
    }
}