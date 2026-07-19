// nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
public class leet33{
    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int low = 0 ;
        int up = arr.length - 1;
      while(low<=up){
          int mid = (low+up)/2;
         if(arr[mid] == target){
            System.out.println(mid);
            break;
         }
         else if(arr[low] <= arr[mid]){
            if(target > arr[low] && target <arr[mid]){
                up = mid-1;
            }
            else{
                low = mid+1;
            }
         }
         else if(arr[mid] <= arr[up]){
            if(target > arr[arr[mid] && target <arr[up]){
                low = mid+1;
            }
            else{
                up = mid-1;
            }
         }
      }
      System.out.println(low);
    }
}