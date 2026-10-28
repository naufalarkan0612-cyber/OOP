/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author caitlyn
 */
public class Main {
    public static void main (String[] args) {
        Vehicle Car = new Car();
        Vehicle Bicycle = new Bicycle();
        
        Car.running();
        Car.info();
        
        System.out.println();
        
        Bicycle.running();
        Bicycle.info();
    }
}