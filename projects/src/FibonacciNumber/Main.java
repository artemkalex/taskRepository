package FibonacciNumber;

public class Main {
    public static void main(String[] args) {

            // test recursion method
        long start = System.currentTimeMillis();
        long fibonacci = FibonacciMethods.recursionFib(10);
        long end   = System.currentTimeMillis();
        System.out.println("   10 number: " + fibonacci);
        System.out.println("time program: " + (end - start) + "ms");
            // test iterative method
        start = System.currentTimeMillis();
        fibonacci = FibonacciMethods.iterativeFib(100);
        end = System.currentTimeMillis();
        System.out.println("  100 number: " + fibonacci);
        System.out.println("time program: " + (end - start) + "ms");
    }
}
