package alishevTasks;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        System.out.println("Data input:");
        Scanner sk = new Scanner(System.in);
        String[][] matrica = new String[2][2];
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(i + "," + j + ". ");
                matrica[i][j] = sk.nextLine();
            }
        }
        int count = 0;
        System.out.println("Data printing:");
        for (String[] x : matrica) {
            for (String y : x) {
                System.out.print((count++) + "." + y + " ");
            }
        }
    }
}