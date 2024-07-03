package trequlov.lesson4;

import java.text.DecimalFormat;

class Student {
    public String name;
    public String surname;
    public int course;
    public double m;
    public double eco;
    public double e;
    public double grade = ((m + eco + e) / 3);
    public static int countId;

    public Student() {
        countId++;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.00");
        Student s1 = new Student();
        s1.name = "Mamed";
        s1.surname = "Mamedov";
        s1.m = 5;
        s1.eco = 5;
        s1.e = 5;
        System.out.println("Средняя оценка студента номером " + Student.countId + " имя:" + s1.name + ", фамилия:" + s1.surname + ' ' + '"' + (df.format((s1.m + s1.eco + s1.e) / 3)) + "\".");

        Student s2 = new Student();
        s2.name = "Alex";
        s2.surname = "Wildberg";
        s2.m = 2;
        s2.eco = 3;
        s2.e = 2;
        System.out.println("Средняя оценка студента номером " + Student.countId + " имя:" + s2.name + ", фамилия:" + s2.surname + ' ' + '"' + (df.format((s2.m + s2.eco + s2.e) / 3)) + "\".");

        Student s3 = new Student();
        s3.name = "Sabina";
        s3.surname = "Bayverdiyeva";
        s3.m = 3;
        s3.eco = 4;
        s3.e = 2;
        System.out.println("Средняя оценка студента номером " + Student.countId + " имя:" + s3.name + ", фамилия:" + s3.surname + ' ' + '"' + (df.format((s3.m + s3.eco + s3.e) / 3)) + "\".");

        Student s4 = new Student();
        s4.name = "Zaur";
        s4.surname = "Trequlov";
        s4.m = 7.8;
        s4.eco = 9.5;
        s4.e = 5.8;
        System.out.println("Средняя оценка студента номером " + Student.countId + " имя:" + s4.name + ", фамилия:" + s4.surname + ' ' + '"' + (df.format((s4.m + s4.eco + s4.e) / 3)) + "\".");

        Student s5 = new Student();
        s5.name = "Samir";
        s5.surname = "Aliyev";
        s5.course = 1;
        s5.m = 9.80;
        s5.eco = 7.59;
        s5.e = 2.86;
        System.out.println("Средняя оценка студента " + s5.course + "-го курса под номером " + Student.countId + " имя:" + s4.name + ", фамилия:" + s4.surname + ' ' + '"' + (df.format((s4.m + s4.eco + s4.e) / 3)) + "\".");
    }
}


