package alishevTasks.lesson33Generics;

public class Person extends Animal {
    private String nationality;
    public Person(){
        System.out.println("Person constructor is called!");
    }

    public Person(String name, int age, String nationality) {
        super(name, age);
        this.nationality = nationality;
        System.out.println("Person created.");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Nationality: " + getNationality() + ", id: " + id + ", " + " name: " + getName() + ", " + " age: " + getAge());
    }
}
