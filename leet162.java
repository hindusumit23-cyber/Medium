//  nums = [1,2,3,1]
// Output: 2
public class leet162{
    public static void main(String[] args){
        int arr[] ={1,2,3,1};
        int low = 0;
        int up = arr.length - 1;
        while(low <= up){
            int mid = (low + up)/2;
          if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid +1]){
            System.out.println(mid);
            break;
          }
          else if(arr[mid] < arr[mid - 1]){
            up = mid - 1;
          }
          else{
            low = mid +1;
          }

        }
         System.out.println(low);
    }
}