import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of lines
        int numLines = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read each line
        for (int i = 0; i < numLines; i++) {
            int lineSize = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            
            // Read integers on this line
            for (int j = 0; j < lineSize; j++) {
                line.add(scanner.nextInt());
            }
            
            lines.add(line);
        }
        
        // Read the number of queries
        int numQueries = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < numQueries; i++) {
            int lineNum = scanner.nextInt();
            int position = scanner.nextInt();
            
            // Check if the line number is valid
            if (lineNum >= 1 && lineNum <= numLines) {
                ArrayList<Integer> line = lines.get(lineNum - 1);
                
                // Check if the position is valid
                if (position >= 1 && position <= line.size()) {
                    System.out.println(line.get(position - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("Line number is out of range.");
            }
        }
        
        scanner.close();
    }
}

