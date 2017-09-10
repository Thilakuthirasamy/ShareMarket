import java.io.*;
import java.util.*;
public class Share
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String []str=s.nextLine().split(" ");
      int[] arr=new int[str.length];
      int l=arr.length;
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=Integer.parseInt(str[i]);
      }
      Arrays.sort(arr);
      System.out.print(arr[l-1]-1);
      
    }
}
