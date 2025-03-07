public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Java";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar); 
            }
        }
        return result.toString();
    }
}