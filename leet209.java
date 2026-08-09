//  target = 7, nums = [2,3,1,2,4,3]
// Output: 2
public class leet209{
    public static void main(String[] args){
      int arr[] = {2,3,1,2,4,3};
       int target = 7;
       int low = 0;
       int up = arr.length - 1;
       
    while(low<=up){
        int count = 0;
        int mid = (low + up)/2;
      if(arr[mid] == target){
         count++;
         System.out.println(count);
      }
      else if(arr[mid] +arr[mid+1] >target){
        up = mid - 1;
      }
      else if(arr[mid] + arr[mid - 1] <target){
         low = mid + 1;
      }
      
       
    }
    System.out.println(low);}
}