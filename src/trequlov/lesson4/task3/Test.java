package trequlov.lesson4.task3;

import org.w3c.dom.ls.LSOutput;

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }

    public void salaryOfPerson() {
        this.salary *= 2;
        System.out.println("Employee is id:" + this.id + ", surname: " + this.surname + ", age: " + this.age + ", Department: " + this.department + ", Salary:" + this.salary);

    }

}

public class Test {
    public static void main(String[] args) {
        Employee pl = new Employee(1, "Mamedov", 22, 355.34, "Finance");
        Employee pl2 = new Employee(2, "Rzayev", 33, 220.66, "Purchasing");
        pl.salaryOfPerson();
        pl2.salaryOfPerson();


    }

}

