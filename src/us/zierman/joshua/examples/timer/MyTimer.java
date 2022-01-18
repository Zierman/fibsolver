package us.zierman.joshua.examples.timer;

public class MyTimer {
    public static long getNanoseconds(Runnable runnable){
        long start, end;
        start = System.nanoTime();
        runnable.run();
        end = System.nanoTime();
        return end - start;
    }

    public static double getMilliseconds(Runnable runnable) {
        return getNanoseconds(runnable) / 1e+6;
    }



    public static double getSeconds(Runnable runnable) {
        return getNanoseconds(runnable) / 1e+9;
    }
}
