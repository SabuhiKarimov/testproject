package alishevTasks.lesson33Generics;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    public static int id;
    protected String name;
    protected double age;

    public Animal() {

    }
    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat(){
        System.out.println("Animal is eating.");
    }
    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
    public void showInfo(){
        System.out.println("id: " + id +", " + " name: " + getName() +", " + " age: " + getAge());
    }

}