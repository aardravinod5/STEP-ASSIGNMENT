import java.util.Scanner;

class NaturalNumberComparison {

    public static int sumUsingRecursion(int number) {
        if (number == 1) return 1;
        return number + sumUsingRecursion(number - 1);
    }

    public static int sumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number <= 0) return;

        int recursionSum = sumUsingRecursion(number);
        int formulaSum = sumUsingFormula(number);

        System.out.println(recursionSum);
        System.out.println(formulaSum);
        System.out.println(recursionSum == formulaSum);

        scanner.close();
    }
}