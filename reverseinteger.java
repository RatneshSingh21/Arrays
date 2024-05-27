      //reverse integer
class Solution {
    public int reverse(int x) {
        int rem=0;
        int n;

        //finding reverse of integer
        while(x!=0)
        {
            n=x%10;

            //check overflow condition
             if(rem>Integer.MAX_VALUE/10 || rem<Integer.MIN_VALUE/10 )
            {
                return 0;
            }
            rem=rem*10+n;
            x=x/10;
        }
        return rem;
    }
}
