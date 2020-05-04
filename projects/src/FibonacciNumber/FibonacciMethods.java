package FibonacciNumber;

public class FibonacciMethods {

    // Recursion method
    static long recursionFib(long number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return recursionFib(number - 1) + recursionFib(number - 2);
    }

    // Iterative method
    static long iterativeFib(long number){
            if (number == 0) return 0;
            long a = 0;
            long b = 1;
            long m;
            for (int i = 0; i < number - 1; i++) {
                m = (a + b);
                a = b;
                b = m;
            }
            return b;
    }

}
