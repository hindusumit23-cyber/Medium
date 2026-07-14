// nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
import java.util.ArrayList;
public class leet34{
    public static void main(String[] args){
        int arr[] = {5,7,7,8,8,10};
        int target = 7;
        int low = 0;
        int up = arr.length - 1;
     while(low<=up){
        int mid = (low + up)/2;
       if(arr[mid] == target){
        if(arr[mid - 1] != target){
          System.out.println(mid);
          break;
        }
        else if(arr[mid + 1] == target){
            System.out.println(mid + 1);
            break;
        }
        else{
            System.out.println(mid - 1);
            break;
        }
        
       }
       else if(arr[mid]<= target){
        low = mid + 1;
       }
       else{
        up = mid - 1;
       }
        
     }
      
       
     
    }
}