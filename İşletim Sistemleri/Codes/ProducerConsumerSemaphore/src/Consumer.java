public class Consumer extends Thread{
    public BoundedBuffer boundedBuf;
    public Consumer (BoundedBuffer boundedBuf){
        this.boundedBuf = boundedBuf;
    }

    @Override
    public void run(){
        super.run();
        while (true){
            try {
                MutableInteger myInt =(MutableInteger) this.boundedBuf.remove();
                System.out.println("The consumer removes the item: "+myInt.value);

                Thread.sleep(2000);
            } catch (Exception e) {

            }

        }
    }
}
