//Q:Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

//import java.util.Scanner;
//Q:TEMPLATE
/*class solution {
    static int findNthTerm(int n) {
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(findNthTerm(n));}
};*/

/*class solution {
    static int evenlyDivides(int n) { 
        int original = n;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;  // Remove the last digit
        }

        return count; 
        
       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(evenlyDivides(n));
    }
}*/
//Q:You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
/*public class Solution {
    public static int reverseDigits(int n) {
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  
            // Remove this check if you want to include zeros
            if (digit != 0) { 
                count = count * 10 + digit;
            }
            n /= 10;  
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(reverseDigits(n));
    }
}*/
//Q:Create the multiplication table from 1 to 10 for a given number n and return the table as an array.
/*class solution {
    static ArrayList<Integer> getTable(int n) {
        while(n>0){
            ArrayList<Integer> table = new ArrayList<>();
            for(int i=1;i<=10;i++){
                table.add(n*i);
            }
            return table;
        }
        return null;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(getTable(n));
    }
}
*/
//Q:Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…
/*class solution {
    static int findNthTerm(int n) {
        
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(findNthTerm(n));}
};*/
//Q:Given three integers p, r and t, denoting Principal, Rate of Interest and Time period respectively. Your task is to calculate Simple Interest.
/*class solution {
    double simpleInterest(int P, int R, int T) {
        
        return (P*R*T)/100;
    }
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        sc.close();
        System.out.println(simpleInterest(P,R,T));}
};*/
//Q:Given n, a and d as the number of terms, first term and common difference respectively of an Arthimetic Series. Find the sum of the series upto nth term
/*class Solution {
    public int sum_of_ap(int n, int a, int d) {
        return (n*(2*a+(n-1)*d))/2;
        
    }
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        System.out.println(sum_of_ap(n,a,d));}
}*/
//Q:Given a number n, find the cube root of n.
/*class solution {
    static int cubeRoot(int n) {

        return (int)Math.cbrt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(cubeRoot(n));}
};*/
//Q:You are given an Integer n. Return true if It is a Leap Year otherwise return false.
/*class solution {
    static boolean isLeap(int N) {
        while (N>0) {
            if( N%100!=0 && N%4==0 || N%400==0){
                return true;
            }
            else{
                return false;
            }
        }
        return null != null;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isLeap(n));}
}*/
//Q:Given a positive integer n, check if it is perfect square or not.
//NOTE: Try to solve the question using only addition and subtraction operation.
/*class solution {
    static long isPerfectSquare(long n) {
        while (n>0) {
            if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n){
                return 1;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPerfectSquare(n));}
};*/
//Q:Given a number n, determine whether it is a prime number or not.
//Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
/*class solution {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }
        return true; // No divisors found, so n is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
    }
}*/