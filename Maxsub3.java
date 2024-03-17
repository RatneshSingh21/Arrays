// max possible sum of subarray in java  by kadan's algorithm


public class Maxsub3 {
    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1, 5,-3};
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            curSum =curSum+arr[i];
            if(curSum<0)
            {
                curSum=0;
            }
            if(maxSum<curSum)
            {
                maxSum=curSum;
            }
            

        }
        System.out.println(maxSum);
    }
}
