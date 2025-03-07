import java.util.Scanner;

public class VowelsCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String[][] results = findVowels(input);
        
        displayResults(results);
        
    }

    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findVowels(String text) {
        int length = text.length();
        String[][] results = new String[length][2]; 

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            String characterType = checkCharacter(currentChar);
            results[i][0] = String.valueOf(currentChar);
            results[i][1] = characterType; 
        }

        return results; 
    }

    public static void displayResults(String[][] results) {
        System.out.println("Character       Type");
        for (String[] row : results) {
            System.out.println(row[0] + "             " + row[1]);
        }
    }
}