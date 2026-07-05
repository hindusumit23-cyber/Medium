public class leet167{
    public static void main(String[] args){

        int arr[] = {12,24,34,43,51};
        int target = 58;

        int left = 0;
        int right = arr.length-1;

          while(left<right){
            int sum = arr[left] + arr[right];
        if(sum == target){
          System.out.println(left+" , "+right);
          break;
          }
          else if(sum>target){
            right = right - 1;
          }
          else{
            left = left+1;
          }
        
    }
    System.out.println("null");
}}