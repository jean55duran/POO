package com.claseufpso.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Character Homero = new Character("Homero", 39, 'M', "A la grande le puse cuca");
        Homero.saySomething();
        
        Character Bart = new Character("Bart", 10, 'M', "Ay caramba!");
        Bart.saySomething();
    }
        
    
    static class Character {
        String name;
        int age;
        char gender;
        String catchPhrase;
        
        private Character(String name, int age, char gender, String catchPhrase) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.catchPhrase = catchPhrase;
    }
        
        void saySomething(){
            System.out.println(this.catchPhrase);
        }
    }
}
