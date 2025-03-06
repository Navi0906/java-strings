import java.util.Scanner;

public class Lower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        
        String userLowercase = convertToLowercase(input);
        
        String Lowercase = input.toLowerCase();
        
        boolean compare = compareStrings(Lowercase, userLowercase);
        
        System.out.println("Lowercase: " + userLowercase);
        System.out.println("Are both lowercase results equal? " + compare);
        
    }

    // Method to convert lowercase letters to uppercase
    public static String convertToLowercase(String str) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            
            if (currentChar < 'a' ) {
                currentChar = (char) (currentChar + 32);
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    // Method to compare two strings
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