/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author caitlyn
 */
abstract class Vehicle { // Class Abstract.
    abstract void running(); // Method Abstract.
    
    void info() { // Method non-Abstract
        System.out.println("Its Vehicle");
    }
}