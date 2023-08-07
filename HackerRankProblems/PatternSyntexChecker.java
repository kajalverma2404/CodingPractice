import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntexChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        // Loop through each test case
        while (testCases > 0) {
            // Read the regular expression pattern from input
            String pattern = in.nextLine();

            // Validate the regular expression pattern
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
