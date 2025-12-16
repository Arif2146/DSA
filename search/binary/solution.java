//Triplet Sum in Array
/* import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        int arr[] = {40, 20, 10, 3, 6, 7};
        int target = 24;
        Solution s = new Solution();
        System.out.println(s.hasTripletSum(arr, target));
    }
    public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == target) {
                    return true;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
} */
//3Sum Closest
//https://leetcode.com/problems/3sum-closest
  import java.util.Arrays;
class Solution {
     public static void main(String[] args) {
        int arr[] = {-1,2,1,-4};
        int target = 1;
        Solution s = new Solution();
        System.out.println(s.threeSumClosest(arr, target));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum; // Exact match found
                }
            }
        }

        return closestSum;
    }
}
