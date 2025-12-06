/*
 * Given the array nums, for each nums[i] find out how many numbers in the array
 * are smaller than it. That is, for each nums[i] you have to count the number
 * of valid j's such that j != i and nums[j] < nums[i].
 */
/*
 * class Solution {
 * public int[] smallerNumbersThanCurrent(int[] nums) {
 * int n = nums.length;
 * int[] result = new int[n];
 * for (int i = 0; i < n; i++) {
 * int count = 0;
 * for (int j = 0; j < n; j++) {
 * if (nums[j] < nums[i]) {
 * count++;
 * }
 * }
 * result[i] = count;
 * }
 * return result;
 * }
 * }
 */
/*
 * Given two arrays of integers nums and index. Your task is to create target
 * array under the following rules:
 * 
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the
 * value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and
 * index.
 * class Solution {
 * public int[] createTargetArray(int[] nums, int[] index) {
 * ArrayList<Integer> targetList = new ArrayList<>();
 * for (int i = 0; i < nums.length; i++) {
 * targetList.add(index[i], nums[i]);
 * }
 * int[] target = new int[nums.length];
 * for (int i = 0; i < nums.length; i++) {
 * target[i] = targetList.get(i);
 * }
 * return target;
 * }
 * }
 */
/*
 * A pangram is a sentence where every letter of the English alphabet appears at
 * least once.
 * 
 * Given a string sentence containing only lowercase English letters, return
 * true if sentence is a pangram, or false otherwise.
 */
/*
 * class Solution {
 * public boolean checkIfPangram(String sentence) {
 * Set<Character> charSet = new HashSet<>();
 * for (char c : sentence.toCharArray()) {
 * charSet.add(c);
 * }
 * return charSet.size() == 26;
 * }
 * }
 */
/*
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 */
/*
 * class Solution {
 * public int findNumbers(int[] nums) {
 * for (int i = 0; i < nums.length; i++) {
 * int count = 0;
 * int number = nums[i];
 * while (number != 0) {
 * number /= 10;
 * count++;
 * }
 * if (count % 2 == 0) {
 * nums[i] = 1;
 * } else {
 * nums[i] = 0;
 * }
 * }
 * int evenCount = 0;
 * for (int num : nums) {
 * evenCount += num;
 * }
 * return evenCount;
 * }
 * }
 */
/*
 * The transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 */
/*
 * class Solution {
 * public int[][] transpose(int[][] matrix) {
 * int rows = matrix.length;
 * int cols = matrix[0].length;
 * int[][] transposed = new int[cols][rows];
 * 
 * for (int i = 0; i < rows; i++) {
 * for (int j = 0; j < cols; j++) {
 * transposed[j][i] = matrix[i][j];
 * }
 * }
 * return transposed;
 * }
 * }
 */
/*
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 */
/*
 * class Solution {
 * public int[] twoSum(int[] nums, int target) {
 * for (int i = 0; i < nums.length; i++) {
 * for (int j = i + 1; j < nums.length; j++) {
 * if (nums[i] + nums[j] == target) {
 * return new int[]{i, j};
 * }
 * }
 * }
 * return new int[0];
 * }
 * }
 */
/*
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 * class Solution {
 * public void rotate(int[] nums, int k) {
 * int n = nums.length;
 * k = k % n; // In case k is greater than n
 * reverse(nums, 0, n - 1);
 * reverse(nums, 0, k - 1);
 * reverse(nums, k, n - 1);
 * }
 * 
 * private void reverse(int[] nums, int start, int end) {
 * while (start < end) {
 * int temp = nums[start];
 * nums[start] = nums[end];
 * nums[end] = temp;
 * start++;
 * end--;
 * }
 * }
 * }
 */
/*
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */
/*
 * class Solution {
 * public boolean containsDuplicate(int[] nums) {
 * Arrays.sort(nums);
 * int n = nums.length;
 * for (int i = 1; i < n; i++) {
 * if (nums[i] == nums[i - 1])
 * return true;
 * }
 * return false;
 * }
 * }
 */
/*
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * class Solution {
 * public int findDuplicate(int[] nums) {
 * Arrays.sort(nums);
 * int n = nums.length;
 * for (int i = 1; i < n; i++) {
 * if (nums[i] == nums[i - 1])
 * return nums[i];
 * }
 * return -1;
 * }
 * }
 */
// You are given an array of integers arr[]. You have to reverse the given
// array.
/*
 * class Solution {
 * public void reverseArray(int arr[]) {
 * int start = 0;
 * int end = arr.length - 1;
 * while (start < end) {
 * int temp = arr[start];
 * arr[start] = arr[end];
 * arr[end] = temp;
 * start++;
 * end--;
 * }
 * 
 * }
 * }
 */
// Given an array arr[]. Your task is to find the minimum and maximum elements
// in the array.
/*
 * class Solution {
 * public ArrayList<Integer> getMinMax(int[] arr) {
 * int min = Integer.MAX_VALUE;
 * int max = Integer.MIN_VALUE;
 * for (int num : arr) {
 * if (num < min) {
 * min = num;
 * }
 * if (num > max) {
 * max = num;
 * }
 * }
 * ArrayList<Integer> result = new ArrayList<>();
 * result.add(min);
 * result.add(max);
 * return result;
 * 
 * }
 * }
 */
// Given an array nums with n objects colored red, white, or blue, sort them
// in-place so that objects of the same color are adjacent, with the colors in
// the order red, white, and blue.
/*
 * class Solution {
 * public void sortColors(int[] nums) {
 * for (int i = 0; i < nums.length; i++) {
 * for (int j = i + 1; j < nums.length; j++) {
 * if (nums[j] < nums[i]) {
 * int temp = nums[i];
 * nums[i] = nums[j];
 * nums[j] = temp;
 * }
 * }
 * }
 * return;
 * }
 * }
 */
// Given an array arr[], check whether it is sorted in non-decreasing order.
// Return true if it is sorted otherwise false.
/*
 * class Solution {
 * public boolean isSorted(int[] arr) {
 * for (int i = 1; i < arr.length; i++) {
 * if (arr[i] < arr[i - 1]) {
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */
// Given an array, arr[] of n integers, and an integer element x, find whether
// element x is present in the array. Return the index of the first occurrence
// of x in the array, or -1 if it doesn't exist

/*
 * class Solution {
 * public int search(int arr[], int x) {
 * // code here
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] == x) {
 * return i;
 * }
 * }
 * return -1;
 * }
 * }
 */
// Given an array arr[]. The task is to find the largest element and return it.
/*
 * class Solution {
 * public static int largest(int[] arr) {
 * // code here
 * int max = Integer.MIN_VALUE;
 * for (int num : arr) {
 * if (num > max) {
 * max = num;
 * }
 * }
 * return max;
 * }
 * }
 */