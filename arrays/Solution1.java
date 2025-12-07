import java.util.*;
//https://www.geeksforgeeks.org/dsa/rearrange-array-arri/
//Rearrange an array such that arr[i] = i
class Solution1 {
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i) {
                arr[arr[i]] = arr[i];
                arr[i] = i;
            }
            else {
                arr[i] = arr[arr[i]];
                arr[arr[i]] = i;
            }
        }  
       
    }
     public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2};
        modifyArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}