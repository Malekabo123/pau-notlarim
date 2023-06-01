public class Driver {

    public static void main(String[] args) {

        BoundedBuffer<MutableInteger> bbuffer = new BoundedBuffer<MutableInteger>();
        Thread prd = new Poducer(bbuffer);
        Thread cns = new Consumer(bbuffer);

        prd.start();
        cns.start();

    }
}
