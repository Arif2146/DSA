 //852. Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array
/* class Solution1 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid]> arr[mid+1]) {
            end =  mid;
        } else {
            start = mid + 1;
        }
        }
        return start;
    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] arr = {1,2,3,4,5,2,1,0};
        System.out.println(sol.peakIndexInMountainArray(arr)); // Output: 1
    }
} */