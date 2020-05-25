package threads.mono_multitaks.multitask.racesimulator;

public class Runner extends Thread{
    public Runner(String name){
        super(name);
    }

    @Override
    public void run() {
        //Value increamented after every nth 100m
        for (int i =1; i<10;i++){
            System.out.println(i*100 + "m " + getName());
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        System.out.println(getName() + " finishes !! ");
    }
}
