// nums = [3,4,5,1,2]
// Output: 1
public class leet153{
    public static void main(String[] args){
      int arr[] = {4,5,6,7,0,1,2};
      int low = 0;
      int up = arr.length - 1;
     while(low<=up){
        int mid = (low+up)/2;
        if(arr[mid] < arr[mid+1] && arr[mid]<arr[mid-1] ){
            System.out.println(arr[mid]);
            break;
        }
        else if(arr[mid] >arr[mid+1]){
            low = mid +1;
        }
        else{
            up = mid-1;
        }
     }
      System.out.println(arr[low]);
    }
}