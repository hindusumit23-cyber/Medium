//  matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
import java.util.Arrays;
public class leet74{
    public static void main(String[] args){
      int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
      int target = 3;
      int r = 0;
      int c = arr.length - 1;
     while(r<=c){
        if(arr[r][c] == target){
            System.out.println(arr[r][c]);
            break;
        }
        else if(arr[r][c] > target){
            c--;
        }
        else{
            r++;
        }
     }
     System.out.println(Arrays.toString(arr));
     
    }
}