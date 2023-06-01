public class Consumer extends Thread {

    private int sumConsumer;

    public int getSumConsumer() {
        return sumConsumer;
    }

    private UnsynchroniyzedBuffer uBuf;

    public Consumer(UnsynchroniyzedBuffer uBuf) {

        this.uBuf = uBuf;
    }

    @Override
    public void run() {
        super.run();
        try {


            for (int i = 1; i < 10; i++) {

                int v = this.uBuf.get();
                System.out.println("Consumer reads value " + v + " from uBuf");
                this.sumConsumer += v;
                //Thread.sleep(2000);

            }
        } catch (Exception e) {
            System.out.println("Consumer in catch"+e.getMessage());

        }


    }
}
