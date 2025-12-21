//https://www.geeksforgeeks.org/dsa/rearrange-array-arri/
//Rearrange an array such that arr[i] = i
/* class Solution1 {
    
// Function to transform the array
  static void modifyArray(int ar[], int n)
{
    int i, j, temp;
    
    // Iterate over the array
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            
            // Check is any ar[j]
            // exists such that
            // ar[j] is equal to i
            if (ar[j] == i) 
            {
                temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
                break;
            }
        }
    }
 
    // Iterate over array
    for(i = 0; i < n; i++)
    {
        
        // If not present
        if (ar[i] != i)
        {
            ar[i] = -1;
        }
    }
 
    // Print the output
    
    for(i = 0; i < n; i++) 
    {
        System.out.print(ar[i] + " ");
    }
}

 
public static void main(String[] args)
{
    int n, ar[] = { -1, -1, 6, 1, 9, 
                     3, 2, -1, 4, -1 };
    n = ar.length;
  
    modifyArray(ar, n);
}
}
 */
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
//Best Time to Buy and Sell Stock
/*     class Solution1 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        Solution1 s=new Solution1();
        s.maxProfit(arr);
        System.out.println(s.maxProfit(arr));
    }
} */
//Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
/* class Solution1 {
    boolean twoSum(int arr[], int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1 ,-2, 1, 0 ,5};
        Solution1 s=new Solution1();
        System.out.println(s.twoSum(arr,0));
    }
}
 */
//Given a unsorted array arr[] of positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.
/* class Solution1 {
    public int findUnique(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        return res; 

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5, 3, 2, 1};
        Solution1 s=new Solution1();
        System.out.println(s.findUnique(arr));
    }
} */
//https://leetcode.com/problems/move-zeroes
//Move Zeroes
/* import java.util.Arrays;
class Solution1 {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        Solution1 s=new Solution1();
        s.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
} */
//1217. Minimum Cost to Move Chips to The Same Position
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position
/* class Solution1 {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Solution1 s=new Solution1();
        System.out.println(s.minCostToMoveChips(arr));
    }
} */