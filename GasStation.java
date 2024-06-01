// gas station

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,fuel=0,index=0;
         for(int i=0;i<gas.length;i++)
       {
           int dif=gas[i]-cost[i];
           total+=dif;
           fuel +=dif;
         
         //check the fuel is  negative
           if(fuel<0)
           {
               index=i+1;
               fuel=0;
           }
       }
       return (total<0)?-1:index;
    }
}
