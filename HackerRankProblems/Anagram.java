public class Anagram {

    static boolean isAnagram2(String a, String b) {
        // Complete the function
        int[] freqArr = new int[26];
        if (a.length() != b.length()) return false;
        
        // convert in lowercase to mitigate case sensitivity 
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        
        
        for (int i = 0; i < a.length(); i++) {
            freqArr[str1.charAt(i) - 'a']++;
            freqArr[str2.charAt(i) - 'a']--;
        }
        
        for (int i : freqArr) {
            if (i != 0) return false;
        }
        return true;
    }
    
     static boolean isAnagram(String a, String b) {
         
         HashMap<Character, Integer> freqMap = new HashMap<>();
         
         if (a.length() != b.length()) return false;
         String str1 = a.toLowerCase();
         String str2 = b.toLowerCase();
         
         for (int i = 0; i < a.length(); i++) {
             if (freqMap.containsKey(str1.charAt(i))) {
                 char c = str1.charAt(i);
                 freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
             }
             freqMap.put(str1.charAt(i), 1);
             
             if (freqMap.containsKey(str2.charAt(i))) {
                 char c = str2.charAt(i);
                 freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
             }
             freqMap.put(str2.charAt(i), -1);
             
         }
         
         for (int i : freqMap.values()) {
             if (i != 0) return false;
         }
         return true;
     }
    
    

// "abcde"
// a = "abc" b = "bCA"
// a = "abc" b ="bca"

// freqArr = [0, 0, 0, 0, 0]


  public static void main(String[] args) {
    
        String a = "abc";
        String b = "BCa";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}