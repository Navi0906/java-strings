import java.util.Scanner;

public class IllegalArgumentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // generate(str, start, end);

        handle(str, start, end);
    }

    public static void generate(String str, int start, int end) {
        System.out.println("Generating IllegalArgumentException...");
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println(str.substring(start, end)); 
    }

    public static void handle(String str, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println(str.substring(start, end)); 
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }
}