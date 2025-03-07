import java.util.*;

public class MostFrequent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequentChar = findMostFrequent(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

    }

    public static char findMostFrequent(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}