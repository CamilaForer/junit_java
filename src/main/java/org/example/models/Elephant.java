package org.example.models;

public class Elephant extends Animal{

    public Elephant(int id, int age, int weight) {
        super("Elefanto",id, age, weight);
    }


    public String take(){
     return "Aguita";
    }

    @Override
    public String sound() {
        return "fffff";
    }

    @Override
    public String move() {
        return "Tiembla";
    }

    @Override
    public String toString() {
        return super.toString() +"_Elephant{}";
    }
}
