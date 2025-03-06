import java.util.Scanner;

public class ArrayException{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[5];
        
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        
        //generate(names);
        
        handle(names);
        
    }

    public static void generate(String[] names) {
        String name = names[10]; 
    }

    public static void handle(String[] names) {
        try {
            generate(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }
}