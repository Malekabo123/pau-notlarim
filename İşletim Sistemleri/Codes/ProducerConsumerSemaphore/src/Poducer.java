public class Poducer extends Thread{

    private BoundedBuffer boundedBuf;
    public Poducer (BoundedBuffer boundedBuf){
        this.boundedBuf = boundedBuf;
    }
    @Override
    public void run() {
        super.run();
        while (true){

            try {
                MutableInteger myInt = new MutableInteger((int) ((Math.random() * 100) % 10));
                System.out.println("The producer inserts the item: "+myInt.value);

                this.boundedBuf.insert(myInt);

                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }
}
