package us.zierman.joshua.examples.fibsolver;

public class LoopFibSolver implements FibSolver {
    @Override
    public int solve(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n > 46) {
            throw new IllegalArgumentException("n must be less than 47.");
        }

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return a;

    }
}
