package alishevTasks.lesson33Generics;

public class Cat extends Animal {
    public Cat(String name, double age) {
        super(name, age);
        System.out.println("Cat constructor is called.");
        System.out.println("Non static block, or instance block");
    }
    static {
        System.out.println("Cat Static blok is called.");
    }

}
