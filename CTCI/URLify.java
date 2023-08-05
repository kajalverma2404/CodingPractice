package CTCI;

public class URLify {
    
    static String urlify(String str, int n) {

        char[] charArr = new char[str.length()];

        int j = str.length() - 1;
        for (int i = n - 1; i>=0; i--) {
            // System.out.println(str.charAt(i));
            if (str.charAt(i) == ' ') {
                charArr[j--] = '0';
                charArr[j--] = '2';
                charArr[j--] = '%';
            } else {
                charArr[j--] = str.charAt(i);
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith      ";
        int n = 13;
        System.out.println("URLifed " + urlify(input, n));
    }
}
