import java.util.Scanner;

public class CharacterFrequency {

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

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2]; 
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); 
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
        }

        return result;
    }

    
}


/*
Input:
Enter a string: my name is

Output:
Character Frequencies:
Character:  , Frequency: 2
Character: a, Frequency: 1
Character: e, Frequency: 1
Character: i, Frequency: 1
Character: m, Frequency: 2
Character: n, Frequency: 1
Character: s, Frequency: 1
Character: y, Frequency: 1

*/