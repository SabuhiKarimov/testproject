package trequlov.lesson6;

public class Overloading {
    int sum() {
        return 0;
    }

    int sum(int i1, int i2) {
        return i1 + i2;
    }

    int sum(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    int sum(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }

    int sum(int i1, int i2, int i3, int i4, int i5) {
        return i1 + i2 + i3 + i4 + i5;
    }

}

class Overloading2 {
    public static void main(String[] args) {
        Overloading ov = new Overloading();
        System.out.println(ov.sum(5, 7, 6, 3, 89));

    }
}
