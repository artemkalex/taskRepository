package FibonacciNumber;

public class Main {
    public static void main(String[] args) {

            // test recursion method
        long start = System.currentTimeMillis();
        long fibonacci = FibonacciMethods.recursionFib(10);
        long end   = System.currentTimeMillis();
        System.out.println("   10 number: " + fibonacci);
        System.out.println("time program: " + (end - start) + "ms");
    }
}
