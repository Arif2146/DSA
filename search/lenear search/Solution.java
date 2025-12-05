//Given an array nums of integers, return how many of them contain an even number of digits.
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
/* class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(countDigits(num) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public int countDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
} */
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//https://leetcode.com/problems/richest-customer-wealth
/* class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
} */
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//https://leetcode.com/problems/plus-one
/* class Solution {
    public  int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
} */
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//https://leetcode.com/problems/move-zeroes
/* class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        } 
        return ;
    }
} */
//Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array

/* class Solution {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    
} */
//Given an array nums of size n, return the majority element.
//https://leetcode.com/problems/majority-element
/* class Solution {
    public int majorityElement(int[] nums) {
     for(int i = 0; i < nums.length; i++){
         int count = 0;
         for(int j = 0; j < nums.length; j++){
             if(nums[i] == nums[j]){
                 count++;
             }
         }
         if(count > nums.length / 2){
             return nums[i];
         }
     }
     return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }
} */
//You are given an array of integers arr[]. You have to reverse the given array.
/* class Solution {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
} */
//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
//https://takeuforward.org/plus/dsa/problems/second-largest-element
/* class Solution {
    public int secondLargestElement(int[] nums) {
       for(int i = 0; i < nums.length; i++){
           int max = Integer.MIN_VALUE;
           int secondMax = Integer.MIN_VALUE;
           for(int j = 0; j < nums.length; j++){
               if(nums[j] > max){
                   secondMax = max;
                   max = nums[j];
               }
               else if(nums[j] > secondMax && nums[j] != max){
                   secondMax = nums[j];
               }
           }
           return secondMax;
       }
       return -1;
    }
    public static void main(String[] args) {
    System.out.println(new Solution().secondLargestElement(new int[]{8, 8, 7, 6, 5}));
    }
} */
//Given an integer array nums, rotate the array to the left by one.
/* class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }
} */
//Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
/* class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }
    public void rotateArray(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateArrayByOne(nums);
        }
    }
} */