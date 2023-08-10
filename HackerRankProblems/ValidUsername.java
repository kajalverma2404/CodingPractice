import java.util.Scanner;

class UsernameValidator {
    /*
     * Regular expression for username validation.
     * It requires the username to start with a letter, followed by
     * 7 to 29 characters which can be letters, numbers, or underscores.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class ValidUsername {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine()); // Number of usernames to validate
        
        while (n-- != 0) {
            String userName = scan.nextLine(); // Read the username
            
            // Validate the username using the regular expression
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
