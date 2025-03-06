import java.util.Scanner;

public class NumberFormat{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        
        generate(input);
        
        handle(input);
        
    }

    public static void generate(String text) {
        int number = Integer.parseInt(text); 
    }

    public static void handle(String text) {
        try {
            generate(text);
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (RuntimeException e) {
            e.getMessage();
        } 
    }
}