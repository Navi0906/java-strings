import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check palindrome using the three methods
        boolean isPalindromeIterative = isPalindromeIterative(input);
        boolean isPalindromeRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean isPalindromeCharArray = isPalindromeCharArray(input);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Logic 1: " + (isPalindromeIterative ? "Yes" : "No"));
        System.out.println("Logic 2: " + (isPalindromeRecursive ? "Yes" : "No"));
        System.out.println("Logic 3: " + (isPalindromeCharArray ? "Yes" : "No"));

    }

    // Iterative method to check if the text is a palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to check if the text is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; 
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recursive call
    }

    // Method to check if the text is a palindrome using character arrays
    public static boolean isPalindromeCharArray(String text) {
        char[] originalArray = text.toCharArray(); 
        char[] reverseArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; 
            }
        }
        return true; 
    }

    
}

/*
Input:
Enter a string: racecar

Output:
Palindrome Check Results:
Iterative Method: Yes
Recursive Method: Yes
Character Array Method: Yes

*/