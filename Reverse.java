// package array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50,60,70,80};
        int start=0;
        int end=arr.length;
         while(start<end)
         {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;

            start++;
            end--;

         }
         System.out.println(Arrays.toString(arr));
    }
}
