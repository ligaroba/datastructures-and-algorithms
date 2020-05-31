package threads.priority;

public class RunnerRace extends Thread{
    public RunnerRace(String name){
        super(name);
    }

    @Override
    public void run() {
        long pedalStroke=0;
        long threadIterations =5000000;
        //Value increamented after every nth 100m
       while (pedalStroke<threadIterations){
          pedalStroke++;
          if((pedalStroke%threadIterations)==0){
              System.out.println("Runner " + getName() + " Performs " + pedalStroke + " Pedal Strokes");
          }

       }


        System.out.println(getName() + " finishes !! ");
    }
}
