import java.util.Scanner;

public class weightConverter {
    //Declare a double variable weightKgs and take input from the user in kilograms.
    // Also, Create a method convert(double kgs) and convert the weight to grams and milligrams.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight(in kgs): ");
        double weightKgs = in.nextDouble();
        convert(weightKgs);
    }

    static void convert(double weightKgs){

        double grams = weightKgs * 1000;
        double milligram = weightKgs * 1000000;
        System.out.println("Grams: " + grams + " Milligrams: " + milligram);
    }
}
