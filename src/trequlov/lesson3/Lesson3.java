package trequlov.lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        System.out.println("Первое вырожения: " + (a-- - --a + ++a + a++ + a));
        System.out.println("Второе вырожения: " + (++b - b++ + ++b - --b));
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + ',' + b);

    }
}
