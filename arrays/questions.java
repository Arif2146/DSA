//Q:Find largest number in a array

/*
public class questions {
        public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
}
public static int largest(int[] arr) {
          int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
    
}
    public static void main(String[] args) {
        int[] arr = takeInput();
        int lar = largest(arr);
        System.out.println(lar);
    }

}
 */
/*
 Problem Description: You are given with a random integer array A with its size and an element
x. You need to search this element x in the given array, using linear search. Return the index of
element in the input. If the element is not found in the array, return -1.
For example: Size: 7
 arr[]=2 13 4 1 3 6 28
 Element x: 3
For this input, output should be 4, as 3 is located at index 4.
 */
/*public class questions {
        
public static int search(int x) {
        int[] arr = {2,13,4,1,3,6,28};
          for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
          }
            return -1;

}
    public static void main(String[] args) {
        System.out.println(search(2));
    }

}*/






/*class questions {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }
} */

/*class questions {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{0,2,1,5,3,4})));
    }
} */
/*
class questions {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ans[i] = nums[i];
            } else {
                ans[i] = ans[i - 1] + nums[i];
            }
        }
        return ans;
    }

}*/
/*
class questions  {
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            accounts[i][0] = sum;   
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] > max) {
                max = accounts[i][0];
            }
        }
        return max;
    }
    
}*//*
class questions {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}*//* 
class questions {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}*//* 
class questions {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}*/