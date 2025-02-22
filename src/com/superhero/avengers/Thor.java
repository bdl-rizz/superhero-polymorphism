/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superhero.avengers;

/**
 *
 * @author ASUS
 */
// Child class dari Superhero dan mengmplements dari interface Avenger
class Thor extends Superhero implements Avenger {
    Thor(String name) {
        super(name);
    }

    @Override
    void usePower() {
        System.out.println(getName() + " memanggil petir dengan Mjolnir.");
    }

    @Override
    void train() {
        System.out.println(getName() + " mengasah kemampuan bertarungnya di Asgard.");
    }

    @Override
    void defend() {
        System.out.println(getName() + " melindungi Asgard.");
    }

    @Override
    public void assemble() {
        System.out.println(getName() + " turun ke Bumi karena ada panggilan Avengers.");
    }

    @Override
    public void strategize() {
        System.out.println(getName() + " membuat combo maut dengan Hulk.");
    }

    @Override
    public void retreat() {
        System.out.println(getName() + " kembali ke Asgard.");
    }
}
