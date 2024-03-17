
    import java.util.Scanner;
import java.util.Arrays;
public class DeleteAnElement {
    public static void main (String[] args) {
      int arr[] = { 1, 2, 3, 4, 5 };
      int key =3;
      int size=arr.length;
      for(int i=0;i<size;i++)
      {
          if(arr[i]==key)
          {
              for (int j = i; j < size - 1; j++) {
             arr[j]= arr[j+1];
              }
            size--;
            i--;
          }
          
      }
      int[] newArr = Arrays.copyOf(arr, size);
      System.out.println(Arrays.toString(newArr));
    }
}

