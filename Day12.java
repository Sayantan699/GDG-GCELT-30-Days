
import java.util.*;

public class Day12 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();

        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the Array elements: ");
        String[] input = sc.nextLine().split(" ");

        // Check if the input length matches the expected length
        if (input.length != len) {
            System.out.println("Error: The number of elements entered does not match the specified length.");
            sc.close();
            return;
        }

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Using Selection sort to sort in descending order
        for (int i = 0; i < len - 1; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println("Sorted array in descending order: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        for (int i = 0; i < len; i++) {
            if (k == i + 1) {
                System.out.println(arr[i]);
                break;
            }
        }

        sc.close();
    }
}
