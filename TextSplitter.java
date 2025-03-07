import java.util.Scanner;

public class TextSplitter{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] words = splitText(input);
        
        String[][] wordsWithLengths = getWords(words);
        
        System.out.println("Word , Length");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println(wordInfo[0]+" , "+Integer.parseInt(wordInfo[1]));
        }
        
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

    public static int findLength(String str) {
        int length = 0;
        while (true) {
            try {
                char c = str.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break; 
            }
        }
        return length;
    }

    public static String[][] getWords(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2]; 

        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i]; 
            wordsWithLengths[i][1] = String.valueOf(findLength(words[i])); 
        }

        return wordsWithLengths;
    }
}