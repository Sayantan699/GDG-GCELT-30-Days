
/*
 * Maximum product of two numbers 7
 * Given an array arr of non-negative integers, return the maximum product of two numbers possible.
 * 
 */
import java.util.*;

class Day2 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array: ");
        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        if (n < 2 || n > 10000000) {
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);

            if (arr[i] < 0 || arr[i] > 1000000000) {
                return;
            }
        }

        int max1 = Math.max(arr[0], arr[1]);
        int max2 = Math.min(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println((long) max1 * max2);

        sc.close();
    }
}
