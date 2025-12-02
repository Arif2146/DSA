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
