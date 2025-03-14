
import java.util.*;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        sc.close();

        String longestsubstr = "";
        String currentsubstr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character exists in current substring
            int j;
            for (j = 0; j < currentsubstr.length(); j++) {
                if (currentsubstr.charAt(j) == ch) {
                    break; // Found duplicate, break loop
                }
            }

            // If character is duplicate, reset current substring from next character
            if (j < currentsubstr.length()) {
                currentsubstr = currentsubstr.substring(j + 1);
            }

            // Add new character to current substring
            currentsubstr += ch;

            // Update longest substring if necessary
            if (currentsubstr.length() > longestsubstr.length()) {
                longestsubstr = currentsubstr;
            }
        }

        System.out.println("Longest substring without repeating characters: " + longestsubstr);
        System.out.println(longestsubstr.length());

        sc.close();
    }
}
