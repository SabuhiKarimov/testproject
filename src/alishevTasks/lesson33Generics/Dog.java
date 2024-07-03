package alishevTasks.lesson33Generics;

public class Dog extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, double age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog created.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
    static{
        System.out.println("Static method.");
    }
    public static void foo() {
        System.out.println("Foo method.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Dog's info: Breed of dog is " + getBreed() + "id: " + id +", " + " name: " + getName() +", " + " age: " + getAge());
    }
}
