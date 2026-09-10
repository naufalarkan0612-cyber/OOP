/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author caitlyn
 */
public class Pekerja extends Manusia{
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    public int get_gaji() {
        return gaji;
    }

    public void set_gaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void to_string() {
        System.out.println("Info Pekerja:");
        System.out.println("\tNama: " + get_nama());
        System.out.println("\tUsia: " + get_usia());
        System.out.println("\tPekerjaan: " + get_pekerjaan());
        System.out.println("\tGaji: " + get_gaji());
    }
}