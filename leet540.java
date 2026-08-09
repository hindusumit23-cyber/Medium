// nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
public class leet540{
    public static void main(String[] args){
     int arr[] = {1,1,2,3,3,4,4,8,8};
         int low = 0;
         int up = arr.length - 1;
      while(low<up){
        int mid = (low+up)/2;
       if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
          System.out.println(arr[mid]);
       }
       else if(arr[mid] == arr[mid + 1]){
        low= mid+1;
       }
       else{
        up = mid-1;
       }
      }
       System.out.println(arr[low]);
    }
}