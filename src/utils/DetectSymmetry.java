package utils;

public class DetectSymmetry {
    public static boolean detectsymmetry(String str) {
        for (int i = 0; i < str.length(); i++) {
            char right = str.charAt(i);
            char left = str.charAt(str.length() - 1 - i);
            System.out.println("----------");
            System.out.println("right = " + right);
            System.out.println("left =" + left);
            if (right != left) {
                return false;
            }
        }
        System.out.println("finished");
        return true;
    }
}
