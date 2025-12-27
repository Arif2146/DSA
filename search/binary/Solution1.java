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

/* import java.util.ArrayList;

class Solution1 {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) {
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr)); // Output: 1
    }
} */

//704. Binary Search
//https://leetcode.com/problems/binary-search
/* class Solution1 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
           int mid = start + (end - start) / 2;
           if(nums[mid]>target){
                end = mid - 1;
              } else if(nums[mid]<target){
                start = mid + 1;
              } else {
                return mid;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(sol.search(nums, target)); // Output: 4
    }
} */