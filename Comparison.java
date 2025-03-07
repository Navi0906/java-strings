import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        int result = compareStrings(str1, str2);
        
        if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\".");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
        } else {
            System.out.println("Both strings are equal.");
        }
        
    }

    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }

        return str1.length() - str2.length();
    }
}