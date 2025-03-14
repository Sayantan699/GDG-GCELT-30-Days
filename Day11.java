
import java.util.*;

public class Day11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array1: ");
        //String str1 = sc.nextLine();
        String[] input1 = sc.nextLine().split(" ");

        System.out.println("Enter elements of array2: ");
        String[] input2 = sc.nextLine().split(" ");

        int n1 = input1.length;
        int n2 = input2.length;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        int[] result = new int[n1]; //n1 since the maximum possible size of input array is in arr1...
        int counter = 0;

        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[counter] = arr1[i];
                counter++;
            }
        }

        for (int ele : result) {
            if (ele == 0) {
                continue;
            }
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
