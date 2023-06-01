public class Producer extends Thread {


    private int sumProducer = 0;
    private UnsynchroniyzedBuffer uBuf;

    public Producer(UnsynchroniyzedBuffer uBuf) {
        this.uBuf = uBuf;
    }

    public int getSumProducer() {
        return sumProducer;

    }

    @Override
    public void run() {
        super.run();
        try {


            for (int i = 1; i < 10; i++) {
                //Thread.sleep(1000);
                uBuf.set(i);
                System.out.println("Producer writes "+i+" to UBuf");
                this.sumProducer = this.sumProducer + i;
            }
        } catch (Exception e) {
            System.out.println("Producer in catch" + e.getMessage());
        }


    }
}
