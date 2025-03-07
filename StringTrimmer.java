import java.util.Scanner;

public class StringTrimmer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int[] trimPoints = trimSpaces(input);
        String trimmedString = createSubstring(input, trimPoints[0], trimPoints[1]);
        
        String builtIn = input.trim();
        
        boolean compare = compareStrings(trimmedString, builtIn);
        
        System.out.println("Trimmed String : "+ builtIn );
        System.out.println("Are both trimmed strings equal? " + compare);
        
    }
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // Return start and end points
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString(); 
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
}