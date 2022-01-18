package us.zierman.joshua.examples.fibsolver;


public class TailRecursiveFibSolver implements FibSolver {


    public int solve(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n > 46) {
            throw new IllegalArgumentException("n must be less than 47.");
        }
        return helper(n, 0, 1);
    }

    /**
     * Tail recursive helper function
     *
     * @param n the number of fib terms to process
     * @param a the first starting term
     * @param b the second starting term
     * @return the nth fib term where the starting terms are a and b
     */
    private int helper(int n, int a, int b) {
        return switch (n) {
            case 0 -> a;
            case 1 -> b;
            default -> helper(n - 1, b, b + a);
        };
    }
}
