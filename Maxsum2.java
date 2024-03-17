//optimization procewss to calculate the max sum of array element



import java.io.*;
import java.util.*;

public class Maxsum2 {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int start = 0;start < arr.length;start++) {
            for (int end = start; end< arr.length; end ++) {
                curSum = (start==0)?prefix[end]:prefix[end]-prefix[start-1];
                
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println(maxSum);

    }
}
