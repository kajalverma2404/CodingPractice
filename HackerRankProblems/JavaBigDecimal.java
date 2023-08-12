import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of strings to be sorted
        String[] s = new String[n + 2]; // Array to store the input strings

        // Reading input strings
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close(); // Close the input scanner to release resources

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                // Compare adjacent strings as BigDecimal numbers
                if (new BigDecimal(s[j]).compareTo(new BigDecimal(s[j - 1])) > 0) {
                    // Swap if the current string is greater than the previous string
                    String temp = s[j];
                    s[j] = s[j - 1];
                    s[j - 1] = temp;
                } else {
                    break; // Break the loop if the condition is not met (no further swaps needed)
                }
            }
        }

        // Output the sorted strings
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

//tc:- O(n^2) 
//sc:-O(n) 