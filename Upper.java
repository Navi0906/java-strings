import java.util.Scanner;

public class Upper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        
        String userUppercase = convertToUppercase(input);
        
        String Uppercase = input.toUpperCase();
        
        boolean compare = compareStrings(Uppercase, userUppercase);
        
        System.out.println("Uppercase: " + userUppercase);
        System.out.println("Are both uppercase results equal? " + compare);
        
    }

    // Method to convert lowercase letters to uppercase
    public static String convertToUppercase(String str) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            
            // Check if the character is lowercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                currentChar = (char) (currentChar - 32);
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