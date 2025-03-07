public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Find the longest word in this sentence.";
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word; 
            }
        }

        return longestWord;
    }
}