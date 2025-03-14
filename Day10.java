
import java.util.*;

public class Day10 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        //char[] chr = str.split()
        int round = 0;
        int curly = 0;
        int square = 0;
        boolean isValid = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '(':
                    round++;
                    break;
                case '{':
                    curly++;
                    break;
                case '[':
                    square++;
                    break;
                case ')':
                    round--;
                    break;
                case '}':
                    curly--;
                    break;
                case ']':
                    square--;
                    break;
                default:
                    isValid = false;
                    break;
            }
            if (round < 0 || curly < 0 || square < 0) {
                isValid = false;
                break;
            }
            if (i > 0) {
                char prev = str.charAt(i - 1);
                if ((prev == '(' && (ch == '}' || ch == ']'))
                        || (prev == '{' && (ch == ')' || ch == ']'))
                        || (prev == '[' && (ch == ')' || ch == '}'))) {
                    isValid = false;
                    break;
                }
            }
        }
        if (round != 0 || curly != 0 || square != 0) {
            isValid = false;
        }

        System.out.println(isValid);
        sc.close();

    }
}
