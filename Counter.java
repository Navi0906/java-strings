import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int[] counts = countVowels(input);
        
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
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

    public static int[] countVowel(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkCharacter(currentChar);
            
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount}; 
    }
}