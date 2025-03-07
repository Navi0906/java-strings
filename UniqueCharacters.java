import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUnique(input);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();

    }

    // Method to find the length of the text without using String's length() method
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                char c = text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break; 
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUnique(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length]; 
        int uniqueCount = 0; 

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    
}