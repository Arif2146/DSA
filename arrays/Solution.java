/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]. */
import java.util.*;
/*class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
*/
/*Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index. 
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }
        return target;
    }
}*/
/*  A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise. */
/*class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            charSet.add(c);
        }
        return charSet.size() == 26;
    }
}*/
/*Given an array nums of integers, return how many of them contain an even number of digits. */
/*class Solution {
    public int findNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int number = nums[i];
            while (number != 0) {
                number /= 10;
                count++;
            }
            if (count % 2 == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        int evenCount = 0;
        for (int num : nums) {
            evenCount += num;
        }
        return evenCount;
    }
}*/
/*The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices. */
/*class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}*/
/*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k. */
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
    }
}