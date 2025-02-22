/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superhero.avengers;

/**
 *
 * @author ASUS
 */
// Child class dari Superhero dan mengimplements dari interace Avenger)
class IronMan extends Superhero implements Avenger {
    IronMan(String name) {
        super(name);
    }

    @Override
    void usePower() {
        System.out.println(getName() + " menembakkan sinar laser.");
    }

    @Override
    void train() {
        System.out.println(getName() + " sedang mengupgrade armor.");
    }

    @Override
    void defend() {
        System.out.println(getName() + " mengaktifkan nano shield.");
    }

    @Override
    public void assemble() {
        System.out.println(getName() + " bergabung dengan para Avengers.");
    }

    @Override
    public void strategize() {
        System.out.println(getName() + " merancang strategi pertempuran.");
    }

    @Override
    public void retreat() {
        System.out.println(getName() + " terbang menjauh dari musuh.");
    }
}