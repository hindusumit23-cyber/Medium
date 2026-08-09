//  x = -123
// Output: -321
public class leet7{
    public static void main(String[] args){
        int x = -123;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        System.out.println(result);
    }
}