/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author caitlyn
 */
// [Milik Kendaraan.java]
//public class Main {
//    public static void main(String[] args) {
//        Kendaraan mobil = new Kendaraan("ESEMKA", "Boga", 2020);
//
//        // Menampilkan data awal
//        System.out.println("Merek: " + mobil.getMerek());
//        System.out.println("Model: " + mobil.getModel());
//        System.out.println("Tahun: " + mobil.getTahun());
//
//        // Mengubah data
//        mobil.setModel("TKJ");
//        mobil.setTahun(2012);
//
//        // Menampilkan data setelah perubahan
//        System.out.println("Model baru: " + mobil.getModel());
//        System.out.println("Tahun baru: " + mobil.getTahun());
//    }
//}

// [Milik Vehicle.java & Mobil.java}
public class Main {
    public static void main(String[] args) {
        // Objek dari Vehicle
        Vehicle motor = new Vehicle("Motor", 120, "Bensin");
        motor.tampilkanInfoVehicle();

        System.out.println();

        // Objek dari Mobil (subclass Vehicle)
        Mobil mobilku = new Mobil("Avanza", 180, "Bensin", 4);
        mobilku.tampilkanInfoMobil();
    }
}