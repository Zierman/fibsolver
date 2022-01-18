package us.zierman.joshua.examples.fibsolver;

import us.zierman.joshua.examples.timer.MyTimer;

public class Main {

    public static void main(String[] args) {
        double loopTime, intuitiveTime, tailRecursiveTime;
        FibSolver loopSolver = new LoopFibSolver();
        FibSolver intuitiveSolver = new IntuitiveRecursiveFibSolver();
        FibSolver tailRecursiveSolver = new TailRecursiveFibSolver();

        // let the user know that we are running the program so they don't think it is malfunctioning.
        String waitingMsg = "Please wait while we run each implementation...";
        System.out.print(waitingMsg);

        //test each implementation using the largest allowed n value (46)
        loopTime = MyTimer.getMilliseconds(() -> loopSolver.solve(46));

        intuitiveTime = MyTimer.getMilliseconds(() -> intuitiveSolver.solve(46));

        tailRecursiveTime = MyTimer.getMilliseconds(() -> tailRecursiveSolver.solve(46));


        // clear the wait message
        System.out.print("\r" + " ".repeat(waitingMsg.length()) + "\r");

        // output the results
        System.out.println("Finding the 46th term in the Fibonacci sequence took:");
        System.out.printf("\t%f milliseconds using a loop.\n", loopTime);
        System.out.printf("\t%f milliseconds using the intuitive recursive method.\n", intuitiveTime);
        System.out.printf("\t%f milliseconds using tail recursion.\n", tailRecursiveTime);



    }
}
