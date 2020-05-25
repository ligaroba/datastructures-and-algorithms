package threads.mono_multitaks.monotask;
import threads.mono_multitaks.monotask.Parrot;
///
public class ChatAndLaunchTheParrot {
    private static void blala(){
        System.out.println("blala");
    }
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Coco", 4);

        blala();
        blala();
        parrot.run();
        for(int i=0; i<3 ; i++){
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
