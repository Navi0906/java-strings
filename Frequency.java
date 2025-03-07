import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

    }

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray(); 
        int[] frequency = new int[characters.length]; 

        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] == 0) {
                frequency[i] = 1; 

                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; 
                        frequency[j] = 0;
                    }
                }
            }
        }

        String[] result = new String[characters.length];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { 
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    
}