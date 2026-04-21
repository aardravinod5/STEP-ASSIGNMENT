import java.util.Scanner;

class FactorAnalysis {

    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count;
    }

    public static int[] getFactors(int number) {
        int count = countFactors(number);
        int[] factors = new int[count];

        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double calculateSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();
        System.out.println(calculateSum(factors));
        System.out.println(calculateProduct(factors));
        System.out.println(calculateSumOfSquares(factors));

        scanner.close();
    }
}