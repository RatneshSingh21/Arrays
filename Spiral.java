class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        
        List<Integer> res = new ArrayList<>();

       
      if (matrix.length == 0) {
      return res;
        }

      int sR=0;
      int sC=0;
      int eR=matrix.length-1;
     int eC = matrix[0].length - 1; 

     while(sR<=eR && sC<=eC)
     {

     // top
     for(int j=sC;j<=eC;j++)
     {
         res.add(matrix[sR][j]);
     }
    
     //right
      for(int i=sR+1;i<=eR;i++)
      {
       res.add(matrix[i][eC]);

      }

     //bottom
      for(int j=eC-1;j>=sC;j--)
     {
        if(sR==eR)
        {
            break;
        }
       res.add(matrix[eR][j]);
     }

      //left
      for(int i=eR-1;i>=sR+1;i--)
      {
        if(sC==eC)
        {
            break;
        }
         res.add(matrix[i][sC]);
      }
      sR++;
      sC++;
      eR--;
      eC--;
    }
    return res;
}
  }
