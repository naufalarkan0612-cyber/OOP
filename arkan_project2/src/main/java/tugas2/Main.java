/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author caitlyn
 */
public class Main {
    public static void main(String[] args) {
        Mobil pertama = new Mobil("ESEMKA", "MYN", 2012, "Hoax");
        pertama.displayInfo();
        pertama.startEngine();
        
        System.out.println("\n");
        
        Mobil kedua = new Mobil("ESEMPEH", "FFB", 2007, "Ghaib");
        kedua.displayInfo();
        kedua.startEngine();
    }
}