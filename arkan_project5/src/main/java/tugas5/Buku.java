/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author caitlyn
 */
public class Buku extends Produk {
    @Override
    public double hitung_diskon() {
        return harga * 0.5; // Diskon 5%
    }
}