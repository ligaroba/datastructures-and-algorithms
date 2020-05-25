package threads.priority;

import threads.mono_multitaks.multitask.racesimulator.Runner;

public class InfernalRace {
    public static void main(String[] args) {
        Runner A =new Runner("A");
        Runner B = new Runner("B");
        A.setPriority(Thread.MAX_PRIORITY);
        B.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread Runner " + A.getName() + "Has a priority" +
                A.getPriority());

        System.out.println("Thread Runner " + B.getName() + "Has a priority" +
                B.getPriority());

        A.start();
        B.start();
    }
}
