import java.util.Scanner;

public class TextSplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] splitWords = splitText(input);
        
        String[] builtIn = input.split(" ");
        
        boolean check = compareArrays(splitWords, builtIn);
        
        System.out.println("Split Words:");
        for (String word : splitWords) {
            System.out.println(word);
        }
        
        
        System.out.println("\nAre both methods equal? " + check);
        
    }

    public static int findLength(String str) {
        int length = 0;
        while (true) {
            try {
                char c = str.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                e.getMessage();
				break; 
            }
        }
        return length;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1]; 
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int endIndex = (i == length - 1) ? i + 1 : i; 
                words[wordIndex] = text.substring(startIndex, endIndex).trim(); 
                wordIndex++;
                startIndex = i + 1; 
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; 
            }
        }
        return true; 
    }
}
