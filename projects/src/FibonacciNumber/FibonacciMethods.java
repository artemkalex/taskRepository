package FibonacciNumber;

public class FibonacciMethods {

    // Recursion method
    static long recursionFib(long number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return recursionFib(number - 1) + recursionFib(number - 2);
    }

}
