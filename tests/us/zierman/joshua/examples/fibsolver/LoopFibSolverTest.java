package us.zierman.joshua.examples.fibsolver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LoopFibSolverTest {


    FibSolver solver = new LoopFibSolver();

    @Nested
    @DisplayName("Tests for solve method")
    class SolveTest {

        @Test
        @DisplayName("test solve(-1)")
        void solveNegative() {
            assertThrows(IllegalArgumentException.class, () -> solver.solve(-1));
        }

        @Test
        @DisplayName("test solve(0)")
        void solve0() {
            int actual = solver.solve(0);
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("test solve(1)")
        void solve1() {
            int actual = solver.solve(1);
            int expected = 1;
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("test solve(5)")
        void solve5() {
            int actual = solver.solve(5);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        @Tag("slow")
        @DisplayName("test solve(46)")
        void solve46() {
            int actual = solver.solve(46);
            int expected = 1836311903;
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("test solve(47) - int overflow")
        void solve47() {
            assertThrows(IllegalArgumentException.class, () -> solver.solve(47));
        }
    }
}