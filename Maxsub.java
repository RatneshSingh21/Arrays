// max possible sum of subarray in java

public class Maxsub {
    public static void main(String[] args) {
        int []arr= {1,-2,6,-1,3};
        // int[] arr = { 2, 4, 6, 8, 10 };
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i;j<arr.length;j++)
            {
                 curSum =0;
                for(int k=i;k<=j;k++)
                {
                  curSum +=arr[k];
                }
                if(maxSum<curSum)
                {
                    maxSum=curSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
