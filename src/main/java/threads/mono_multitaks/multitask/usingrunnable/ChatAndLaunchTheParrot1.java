package threads.mono_multitaks.multitask.usingrunnable;

///
public class ChatAndLaunchTheParrot1 {
    private static void blala(){
        System.out.println("blala");
    }
    public static void main(String[] args) {
        int fois=5;
        Parrot1 parrot = new Parrot1("Coco", fois);
        Thread threadParrt= new Thread(parrot);
        threadParrt.start();
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
