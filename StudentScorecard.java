import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        int number = 5;
        int[][] scores = generate(number);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    public static int[][] generate(int number) {
        Random random = new Random();
        int[][] scores = new int[number][3];

        for (int i = 0; i < number; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student    Physics    Chemistry  Maths      Total      Average    Percentage Grade");
        System.out.println("");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "          " + scores[i][0] + "        " + scores[i][1] + "        " + scores[i][2] + "        " + 
                               results[i][0] + "        " + results[i][1] + "        " + results[i][2] + "        " + grades[i][0]);
        }
    }
}