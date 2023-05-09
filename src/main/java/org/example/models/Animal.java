package org.example.models;

public abstract class Animal {
    private int id;
    private int age;

    private final String name;
    private int weight;

    public Animal(String name,int id, int age, int weight) {
        this.name = name ;
        this.id = id;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String sound();
    public abstract String move();

    public static void message(){
        System.out.println("Soy un animal abstracto");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
