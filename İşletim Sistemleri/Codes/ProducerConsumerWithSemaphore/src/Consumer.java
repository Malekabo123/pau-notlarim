public class Consumer extends Thread {

    private BoundedBuffer boundedBuf;
    public  Consumer (BoundedBuffer boundedBuf)
    {
        this.boundedBuf = boundedBuf;


    }

    @Override
    public void run() {
        super.run();

        while (true)
        {
            try {
               // MutableInteger mtInt = new MutableInteger((int) ((Math.random() * 100) % 10));
                MutableInteger mtInt= ((MutableInteger) this.boundedBuf.remove());
                System.out.println("The consumer removes the item:"+mtInt.value);

                Thread.sleep(3000);
            }
            catch (Exception e){

            }



        }
    }
}
