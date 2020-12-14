package arrays;

import java.util.Arrays;

public class twonumbersum {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,2,-1};
        System.out.println(Arrays.toString(twoNumberSum(list, 9)));


    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[] { i, j};
                }
            }

        }
     return new int[] {};
    }
}
