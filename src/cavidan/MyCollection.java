package cavidan;

import java.util.Arrays;
import java.util.Scanner;

public class MyCollection {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum = 0;
        int j = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            sum += arr[i];
            j = j*2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Result arr = " + sum);

        int maxElem = 0;
        int minElem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(minElem > arr[i]){
                minElem = arr[i];
            }
            if (maxElem< arr[i]){
                maxElem = arr[i];
            }
        }
        System.out.println("maxElemntsOffArrays = " + maxElem);
        System.out.println("minElementsOffArrays = " + minElem); 

/*        Scanner sc = new Scanner(System.in);
        int[] matrice = new int[5];
        System.out.println("input number:");
        for (int i = 0; i < matrice.length; i++) {
//            matrice[i] = i;

            int num = sc.nextInt();
            matrice [i] = num;

//            System.out.print(matrice[i]);
        }
        System.out.println();

        int arryMid = 0;
        if (matrice.length % 2 != 0) {
            arryMid = matrice.length / 2;
            System.out.println("value of middle index arrays = " + matrice[arryMid]);
            System.out.println("Middle index of arrays = " + arryMid);
        } else {
            System.out.println("Please enter correctly");
        }*/

    }
}

