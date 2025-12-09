//Product array puzzle
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
import java.util.Arrays;
class Solution {
    public static int[] productExceptSelf(int arr[]) {
       int[] muiltiple = new int[arr.length];
        muiltiple[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            muiltiple[i] = muiltiple[i - 1] * arr[i - 1];
        }
        int right = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            muiltiple[i] = muiltiple[i] * right;
            right = right * arr[i];
        }
        return muiltiple; 
}

    
    public static void main(String[] args) {
        int arr[] = { 12, 0 };
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(arr)));
    }
} 

