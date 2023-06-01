
public class Driver {

    public static void main(String[] args) {
        // write your code here
        UnsynchroniyzedBuffer uBuf = new UnsynchroniyzedBuffer();

        Thread P = new Producer(uBuf);
        Thread C = new Consumer(uBuf);
        P.start();
        C.start();
        try {
            P.join();
            C.join();
        }catch (Exception e)
        {


        }
        System.out.println("Producer's sum is "+((Producer) P).getSumProducer());
        System.out.println("Consumers's sum is "+((Consumer) C).getSumConsumer());



    }
}
