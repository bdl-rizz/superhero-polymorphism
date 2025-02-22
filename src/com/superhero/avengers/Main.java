/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superhero.avengers;

/**
 *
 * @author ASUS
 */
// Main class untuk run file
public class Main {
    public static void main(String[] args) {
        Superhero ironMan = new IronMan("Iron Man");
        Superhero captainAmerica = new CaptainAmerica("Captain America");
        Superhero thor = new Thor("Thor");

        Avenger[] heroes = {(Avenger) ironMan, (Avenger) captainAmerica, (Avenger) thor};

        for (Avenger hero : heroes) {
            hero.assemble(); // Memanggil method yang sama tapi outputnya akan berbeda (Polymorphism)
            hero.strategize();
            hero.retreat();
        }
    }
}
