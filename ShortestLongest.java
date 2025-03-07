import java.util.Scanner;

public class ShortestLongest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] words = splitText(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] shortestLongest = findShortestAndLongest(wordsWithLengths);
        
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[2]);
        
    }

    public static String[] splitText(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0, startIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int endIndex = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = text.substring(startIndex, endIndex).trim();
                startIndex = i + 1;
            }
        }
        return words;
    }

    public static int findLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordsWithLengths;
    }

    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.MAX_VALUE, longestLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new String[]{
            wordsWithLengths[shortestIndex][0], String.valueOf(shortestLength),
            wordsWithLengths[longestIndex][0], String.valueOf(longestLength)
        };
    }
}