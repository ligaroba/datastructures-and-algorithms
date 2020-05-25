package threads.mono_multitaks.multitask.extendingthread;
import threads.mono_multitaks.multitask.extendingthread.Parrot2;

///
public class ChatAndLaunchTheParrot2 {
    private static void blala(){
        System.out.println("blala");
    }
    public static void main(String[] args) {
        int fois=5;
        Parrot2 parrot = new Parrot2("Coco", fois);

        parrot.start();
        for(int i=0; i<fois ; i++){
            try{
               Thread.sleep(100);
                //System.out.println();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
                System.exit(1);
            }
            blala();
        }// end main
    }
}
