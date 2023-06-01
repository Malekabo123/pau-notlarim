public class Producer extends Thread{
    private int sumProducer=0;
    private UnsyncBuffer uBuf; //paylasilan buffer

    public Producer(UnsyncBuffer uBuf){
        this.uBuf=uBuf;
    }

    public int getSum(){
        return sumProducer;
    }


    public void run(){
        super.run();
        try {
            for (int i = 1; i <= 10; i++) {

                uBuf.set(i);
                System.out.println("Producer writes " +i+ " to uBuf");
                this.sumProducer = this.sumProducer+i;
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println("Producer in catch "+ e.getMessage());
        }

    }
}
