package threads.mono_multitaks.multitask.racesimulator;
import threads.mono_multitaks.multitask.racesimulator.Runner;

public class Race {
    public static void main(String[] args) {
        System.out.println(" Passing ");
        Runner jean = new Runner("Jean");
        Runner paul = new Runner("Paul");
        jean.start();
        paul.start();

    }
}
