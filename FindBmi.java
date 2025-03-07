import java.util.Scanner;

public class FindBmi {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2]; 
        
        // Loop for taking input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }
        
        // Calculate BMI and status
        String[][] results = calculateBmiAndStatus(personData);
        
        // Display results
        displayResults(results);
        
    }
    
    // Method to calculate BMI and status
    public static String[][] calculateBmiAndStatus(double[][] personData) {
        String[][] results = new String[personData.length][4]; 
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; 
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            // Determine weight status
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store results
            results[i][0] = String.format("%.2f", personData[i][1]); 
            results[i][1] = String.format("%.2f", weight); 
            results[i][2] = String.format("%.2f", bmi); 
            results[i][3] = status; 
        }
        
        return results;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Height(cm)  Weight(kg)  BMI        Status");
        System.out.println();
        for (String[] result : results) {
            System.out.println(result[0] + "        " + result[1] + "        " + result[2] + "        " + result[3]);
        }
    }

    
}