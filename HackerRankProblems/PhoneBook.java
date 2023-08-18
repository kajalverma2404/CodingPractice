import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();
        int numEntries = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < numEntries; i++) {
            String name = scan.nextLine().trim();
            String phoneNumber = scan.nextLine().trim();
            phoneBook.put(name, phoneNumber);
        }
        
        while (scan.hasNextLine()) {
            String query = scan.nextLine().trim();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        scan.close();
    }
}
