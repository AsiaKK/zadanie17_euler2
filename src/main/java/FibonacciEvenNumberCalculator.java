public class FibonacciEvenNumberCalculator {

    public double sumFibonacciEvenResultNumber(int userInput) {
        double previous = 0;
        double next = 1;
        double result;
        double sum = 0;


        if (userInput >= 2) {
            for (int i =1; i < userInput; i++){
                result = previous+next;
                if (result%2 == 0) {
                    sum += result;
                }
                previous= next;
                next = result;
            }
        }
        return sum;
    }

}