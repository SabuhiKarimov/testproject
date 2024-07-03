package utils;

public class ArrayUtil {
    public static int[] findMinAndMax(int[] arr) {
        int[] result = new int[2];
        if (arr != null && arr.length > 0) {
            int min = arr[0];
            int max = arr[0];

            for (int i : arr) {
                if (min > i) {
                    min = i;
                }
                if (max < i) {
                    max = i;
                }
            }
            result[0] = min;
            result[1] = max;
        } else {
            result = new int[]{0, 0};
        }
        return result;
    }

    public static int[] FindMinAndMax(int[][] arr) {   // Find minimum & maximum elements of Multidimensional arrays.
        int[] result = new int[2];
        if (arr != null && arr.length > 0) {
            int min = arr[0][0];
            int max = arr[0][0];
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[i].length; j++) {
            for (int[] x : arr) {
                for (int y : x) {
                    if (min > y) {
                        min = y;
                    }
                    if (max < y) {
                        max = y;
                    }
                }
            }
            result[0] = min;
            result[1] = max;

        } else {
            result = new int[]{0, 0};
        }
        return result;

    }
}
