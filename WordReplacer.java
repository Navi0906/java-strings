import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String targetWord = sc.nextLine();
        
        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();
        
        String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);
        
        System.out.println("Modified Sentence: " + modifiedSentence);
        
    }

    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            if (word.equals(targetWord)) {
                modifiedSentence.append(replacementWord); 
            } else {
                modifiedSentence.append(word); 
            }
            modifiedSentence.append(" "); 
        }

        return modifiedSentence.toString().trim();
    }
}