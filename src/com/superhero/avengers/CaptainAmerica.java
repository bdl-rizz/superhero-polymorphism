/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superhero.avengers;

/**
 *
 * @author ASUS
 */
// Child class dari Superhero dan mengimplements dari interface Avenger
class CaptainAmerica extends Superhero implements Avenger {
    CaptainAmerica(String name) {
        super(name);
    }

    @Override
    void usePower() {
        System.out.println(getName() + " melempar perisainya ke musuh.");
    }

    @Override
    void train() {
        System.out.println(getName() + " berlatih layaknya super soldier.");
    }

    @Override
    void defend() {
        System.out.println(getName() + " menahan serangan dengan perisai.");
    }

    @Override
    public void assemble() {
        System.out.println(getName() + " memimpin Avengers dalam pertempuran.");
    }

    @Override
    public void strategize() {
        System.out.println(getName() + " merumuskan taktik tim.");
    }

    @Override
    public void retreat() {
        System.out.println(getName() + " kembali ke Avengers tower dengan tim.");
    }
}
