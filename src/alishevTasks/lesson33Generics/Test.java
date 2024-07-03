package alishevTasks.lesson33Generics;

public class Test {
    public static void main(String[] args)throws Exception {
        Dog myDog = new Dog("Betxoven", 2, "xaski");
        myDog.eat();
        myDog.showInfo();
        System.out.println("--------------");
        Dog myDog2 = new Dog("Murzik", 5, "street");
        myDog2.eat();
        myDog2.showInfo();
        Dog.foo();
        System.out.println("---------------");
        Person myPerson = new Person("Alex", 22, "Azerbaijan");
        myPerson.showInfo();
        Class.forName("alishevTasks.lesson33Generics.Cat");
        new Person();
        Cat cat = new Cat("Murka",1.5);
    }
}
