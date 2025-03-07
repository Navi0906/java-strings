import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("Character: " + entry[0] + ", Frequency: " + entry[1]);
        }

    }

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

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

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    
}

/*
Input: 
Enter a string: music is great

Output:
Character Frequencies:
Character: m, Frequency: 1
Character: u, Frequency: 1
Character: s, Frequency: 2
Character: i, Frequency: 2
Character: c, Frequency: 1
Character:  , Frequency: 2
Character: g, Frequency: 1
Character: r, Frequency: 1
Character: e, Frequency: 1
Character: a, Frequency: 1
Character: t, Frequency: 1

*/