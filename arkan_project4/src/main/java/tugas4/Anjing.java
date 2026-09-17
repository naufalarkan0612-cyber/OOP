/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author caitlyn
 */
public class Anjing extends Hewan {
    public void suara() {
        System.out.println("Arf! Arf!");
    }
    
    @Override
    public void furry_id() {
        super.furry_id();
        suara();
    }
}