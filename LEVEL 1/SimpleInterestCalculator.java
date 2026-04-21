import java.util.Scanner;

class SimpleInterestCalculator {

    public double calculateSimpleInterest(double principalAmount, double rateOfInterest, double timePeriod) {
        return (principalAmount * rateOfInterest * timePeriod) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time: ");
        double timePeriod = scanner.nextDouble();

        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        double simpleInterest = calculator.calculateSimpleInterest(
                principalAmount, rateOfInterest, timePeriod
        );

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principalAmount +
                ", Rate of Interest " + rateOfInterest +
                " and Time " + timePeriod);

        scanner.close();
    }
}
