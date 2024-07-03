package alishevTasks;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        String[] arr = new String[5];
//        System.out.println("Filling the array;");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sk.nextLine();
//        }
//
//        System.out.println("Printing Array:");
//        for (String string : arr) {
//            System.out.println(string);
//        }

        arr[0] = "Hello";
        arr[1] = "World";
        arr[2] = "!";
        arr[3] = "Backend";
        arr[4] = "Developer.";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == 1) {
                continue;
            }
            System.out.print(" ");
        }
    }
}


