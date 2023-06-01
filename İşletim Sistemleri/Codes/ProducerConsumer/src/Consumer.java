public class Consumer extends Thread{
    private int sumConsumer = 0;
    private UnsyncBuffer uBuf; //paylasilan buffer

    public Consumer(UnsyncBuffer uBuf){
        this.uBuf=uBuf;
    }

    public int getSum(){
        return sumConsumer;
    }


    public void run(){
        super.run();
        try {
            for (int i = 1; i <= 10; i++) {
                int v = this.uBuf.get(); //value
                Thread.sleep(1000);
                System.out.println("Consumer reads value "+v);
                this.sumConsumer += v; //this.sumConsumer + uBuf.get() aynisi
            }
        }catch (Exception e){
            System.out.println("Err "+e.getMessage());
        }

    }
}
