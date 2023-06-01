public class Driver {
    public static void main(String[] args) throws InterruptedException {
        UnsyncBuffer buf = new UnsyncBuffer();
        Producer producerThrd = new Producer(buf);
        Consumer consumerThrd = new Consumer(buf);

        producerThrd.start();
        consumerThrd.start();

        producerThrd.join();
        consumerThrd.join();

        System.out.println("Producer: " + producerThrd.getSum() +" Consumer: " + consumerThrd.getSum());

    }
}
