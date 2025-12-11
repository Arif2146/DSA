//Product array puzzle
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
/* import java.util.Arrays;
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
 */
//Majority element
//https://leetcode.com/problems/majority-element
/* class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
        return nums[nums.length / 2]; 
         int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2};
        Solution s=new Solution();
        System.out.println(s.majorityElement(arr));
    }
}
 */
//334. Increasing Triplet Subsequence
//https://leetcode.com/problems/increasing-triplet-subsequence
/* class Solution {
    public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int n : nums) {
        if (n <= first) {
            first = n;
        } else if (n <= second) {
            second = n;
        } else {
            return true; // means first < second < n
        }
    }

    return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        Solution s=new Solution();
        System.out.println(s.increasingTriplet(arr));
    }
} */