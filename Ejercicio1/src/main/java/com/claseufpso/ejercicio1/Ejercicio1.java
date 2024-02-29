package com.claseufpso.ejercicio1;

import People.Character;
public class Ejercicio1 {

    public static void main(String[] args) {
        Character Homero = new Character("Homero", 39, 'M', "A la grande le puse cuca");
        Homero.saySomething();
        
        Character Bart = new Character("Bart", 10, 'M', "Ay caramba!");
        Bart.saySomething();
        
        Character Apu = new Character();
        Apu.setName("Apu");
        Apu.setPhrase("vuelva prontos");
        
        Apu.saySomething();
    }
}
