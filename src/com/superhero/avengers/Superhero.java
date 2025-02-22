/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superhero.avengers;

/**
 *
 * @author ASUS
 */

// Abstract Class dengan Enkapsulasi
abstract class Superhero {
    private String name; // Atribut private untuk enkapsulasi

    Superhero(String name) {
        this.name = name;
    }

    // Method getter
    public String getName() {
        return name;
    }

    // Method setter
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void usePower();
    abstract void train();
    abstract void defend();
}
