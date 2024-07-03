package alishevTasks;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("Data input:");
        int[][] matrica = new int[3][5];
        Scanner sk = new Scanner(System.in);
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = sk.nextInt();
            }
        }
        System.out.println("Data printing:");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
