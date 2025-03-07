import java.util.Scanner;

public class NonRepeatingCharacter {

		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findNonRepeating(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

    }

    // Method to find the first non-repeating character in a string
    public static char findNonRepeating(String text) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }

        return '\0'; 
    }

    
}

/*
Input:
Enter a string: okay

Output:
The first non-repeating character is: o

*/