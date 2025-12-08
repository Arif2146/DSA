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