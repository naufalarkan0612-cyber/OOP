/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author caitlyn
 */

import java.util.ArrayList; // Kalau ditanya ini tahu dari mana? Tanyakan author modul yang tiba-tiba memberi tugas sampai sini padahal materinya belum.
import java.util.List;

public class Keranjang_Belanja {
    // Wadah penampungan produk.
    List<Produk> daftar_produk = new ArrayList<>();

    // Method untuk memasukkan barang belanjaan ke keranjang.
    public void tambah_produk(Produk produk) {
        daftar_produk.add(produk);
    }

    // Method untuk menghitung total semua harga setelah dipotong diskon.
    public double total_harga_setelah_diskon() {
        double total = 0;

        for (Produk p : daftar_produk) {
            // Harga normal dikurangi hasil hitung diskon masing-masing claass.
            double harga_akhir = p.harga - p.hitung_diskon();
            total += harga_akhir;
        }

        return total;
    }
}