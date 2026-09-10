/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this ;emplate
 */
package tugas3;

/**
 *
 * @author caitlyn
 */
public class Main {
    public static void main(String[] args) {
        Pekerja Mage = new Pekerja("Stein", 134, "Penyihir", 666);
        Mage.to_string();
        
        Mage.set_nama("Rey");
        Mage.to_string();
        
        System.out.println(Mage.nama);
        System.out.println(Mage.usia);
        System.out.println(Mage.gaji);
    }    
}