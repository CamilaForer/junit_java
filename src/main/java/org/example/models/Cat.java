package org.example.models;

public class Cat extends Animal {
    private int teethNumber;
    public Cat(int id, int age, int weight,int teethNumber) {
        super("Gato",id, age, weight);
        this.teethNumber = teethNumber;
    }

    public Cat(int id, int age, int weight) {
        this(id,age,weight,5);
    }


    public int getTeethNumber() {
        return teethNumber;
    }

    public void setTeethNumber(int teethNumber) {
        this.teethNumber = teethNumber;
    }
    public String jump(){
        return "Salto";
    }

    @Override
    public String sound() {
        return "Miauuu";
    }

    @Override
    public String move() {
        return "Levito";
    }

    @Override
    public String toString() {
        return super.toString()+ "_Cat{" +
                "teethNumber=" + teethNumber +
                '}';
    }
}
