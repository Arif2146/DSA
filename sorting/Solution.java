// https://leetcode.com/problems/missing-number/
//missing-number
/* class Solution {
    public int missingNumber(int[] nums) {
       for (int i = 0; i <= nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
    public int missingNumber(int[] arr) {
      int i =0;
      while (i< arr.length) {
        int correct = arr[i];
        if (arr[i]<arr.length && arr[correct] != arr[i]) {
          swap(arr, i , correct);
        } else {
          i++;
        }
        
      }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
   static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {3, 0, 1};
        Solution s = new Solution();
        System.out.println(s.missingNumber(nums));
    }

} */
//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number
/* class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }
        return -1;
    }
     static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        Solution s = new Solution();
        System.out.println(s.findDuplicate(nums));
    }
} */