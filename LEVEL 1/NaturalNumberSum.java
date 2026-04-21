import java.util.Scanner;

class NaturalNumberSum {
    public int calculateSum(int numberLimit) {
        int sum = 0;
        for (int i = 1; i <= numberLimit; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int numberLimit = scanner.nextInt();

        NaturalNumberSum calculator = new NaturalNumberSum();
        int sum = calculator.calculateSum(numberLimit);

        System.out.println("Sum of first " + numberLimit + " natural numbers is: " + sum);
        scanner.close();
    }
}