package threads.priority;

public class InfernalRace {
    public static void main(String[] args) {
        RunnerRace A =new RunnerRace("A");
        RunnerRace B = new RunnerRace("B");
        A.setPriority(Thread.MAX_PRIORITY);
        B.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread Runner " + A.getName() + " has a priority " +
                A.getPriority());

        System.out.println("Thread Runner " + B.getName() + " has a priority " +
                B.getPriority());

        A.start();
        B.start();
    }
}
