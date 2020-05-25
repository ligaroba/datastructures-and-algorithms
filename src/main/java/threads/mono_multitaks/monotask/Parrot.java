package threads.mono_multitaks.monotask;

public class Parrot {
    private String cri=null;
    private int fois =0;

    public Parrot(String cri, int fois) {
        this.cri=cri;
        this.fois=fois;
    }

    public void run(){
        for(int n=0; n<fois;n++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
                System.exit(1);
            }
            System.out.println(cri);
        }// end for
    }//end run
}
