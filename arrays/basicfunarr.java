package arrays; import java.util.Scanner;

public class basicfunarr {
    public static void printArray(int[] arr) {
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
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
   public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
    }}