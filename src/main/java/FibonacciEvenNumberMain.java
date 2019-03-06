import java.util.Scanner;

public class FibonacciEvenNumberMain {

    public static void main(String[] args) {

        FibonacciEvenNumberCalculator fibonacciEvenNumberCalculator = new FibonacciEvenNumberCalculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę dodatnią.");
        int userInput = scan.nextInt();

        double sum = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(userInput);
        scan.close();

        System.out.println("Sum of even fibonacci number is: " + sum);
    }
}
