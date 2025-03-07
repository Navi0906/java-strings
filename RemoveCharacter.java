import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        System.out.print("Character to Remove: ");
        char charToRemove = sc.next().charAt(0);
        
        String modifiedString = removeCharacter(inputString, charToRemove);
        
        System.out.println("Modified String: \"" + modifiedString + "\"");
        
    }

    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }
}