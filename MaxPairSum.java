import java.util.Arrays;

public class MaxPairSum {
    public static void main (String[] args) {
        int[] arr={1,3,2,1,3,2,2};
        int size=arr.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
             if(arr[i]==arr[j])
             {
               
                continue;
               arr[j]=arr[j+1];
               
              
             
             }   
            }
           
            size--;
        }
         int[] newArr = Arrays.copyOf(arr, size);
      System.out.println(Arrays.toString(newArr));
    }
}
