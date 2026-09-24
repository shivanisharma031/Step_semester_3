package week1.class_problems;

import java.util.Scanner;

public class BmiCalculator {

    static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    static String classifyBMI(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();

            bmi[i] = calculateBMI(heights[i], weights[i]);
            status[i] = classifyBMI(bmi[i]);
        }

        System.out.println("\nBMI Report");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-15s%n",
                "Person", "Height(m)", "Weight(kg)", "BMI Status");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-10d %-12.2f %-12.2f %-15s%n",
                    i + 1, heights[i], weights[i], status[i]);
        }

        System.out.println("-----------------------------------------------");

        sc.close();
    }
}
