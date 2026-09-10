/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author caitlyn
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan  = pekerjaan;
        this.usia = usia;
    }
    
    public String get_nama() {
        return nama;
    }
    
    public void set_nama(String nama) {
        this.nama = nama;
    }
    
    public int get_usia() {
        return usia;
    }
    
    public void set_usia(int usia) {
        this.usia = usia;
    }
    
    public String get_pekerjaan() {
        return pekerjaan;
    }
    
    public void set_pekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}