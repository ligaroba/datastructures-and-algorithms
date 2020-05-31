package threads.mono_multitaks.multitask.racesimulator;
import threads.priority.RunnerRace;

public class Race {
    public static void main(String[] args) {
        System.out.println(" Passing ");
        RunnerRace jean = new RunnerRace("Jean");
        RunnerRace paul = new RunnerRace("Paul");
        jean.start();
        paul.start();

    }
}
