// l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
import java.util.Arrays;
public class leet2{
    public static void main(String[] args){
        int l1[] = {2,4,3};
        int l2[] = {5,6,4};
        int sum = 0;
      for(int i = l1.length-1; i>=0; i--){
       
        sum = sum+l1[i];
      }
       for(int j = l2.length-1; j>=0; j--){
        leet7.java
        sum= sum+l2[j];
      }
      System.out.println(sum);
    }
}