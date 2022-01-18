package us.zierman.joshua.examples.fibsolver;

public class IntuitiveRecursiveFibSolver implements FibSolver {
    @Override
    public int solve(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n > 46) {
            throw new IllegalArgumentException("n must be less than 47.");
        }
        return switch (n){
            case 0 -> 0;
            case 1 -> 1;
            default -> solve(n - 2) + solve(n - 1);
        };
    }
}
