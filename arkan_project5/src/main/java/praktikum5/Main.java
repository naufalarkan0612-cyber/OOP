/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author caitlyn
 */
public class Main {
    public static void main(String[] args) {
        // Overloading.
        Hewan kucing = new Hewan();
        kucing.bersuara();
        kucing.makan("Whiskas"); // Makan polosan.
        
        kucing.makan("Royal Canin", 7); // Makan dengan jumlah.
        
        System.out.println("\n"); // Spacing.
        
        Hewan cat = new Kucing();
        cat.bersuara();
        cat.makan("Whiskas"); // Makan polosan.
        
        cat.makan("Royal Canin", 7); // Makan dengan jumlah.
        
        System.out.println(); // Spacing.
        
        Hewan anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Steak", 6); // Makan dengan jumlah.
    }
}