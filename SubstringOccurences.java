public class SubstringOccurrences {
    public static void main(String[] args) {
        String mainString = "This is a test string. just a test.";
        String substring = "test";
        int count = countOccurrences(mainString, substring);
        System.out.println(count);
    }

    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); 
        }

        return count;
    }
}