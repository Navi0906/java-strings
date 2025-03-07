import java.util.Scanner;

public class StudentVoting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        String[][] voting = check(ages);
        displayResults(voting);
        
    }

    public static String[][] check(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            eligibility[i][0] = String.valueOf(age);
            if (age < 0) {
                eligibility[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }

        return eligibility;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nAge\t\tVoting Eligibility");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}