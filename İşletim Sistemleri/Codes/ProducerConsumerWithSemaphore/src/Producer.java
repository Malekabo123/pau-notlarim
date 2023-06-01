public class Producer extends Thread {

    private BoundedBuffer boundedBuf;
    public  Producer (BoundedBuffer boundedBuf)
    {
        this.boundedBuf = boundedBuf;


    }

    @Override
    public void run() {
        super.run();

        while (true)
        {
            try {
                MutableInteger mtInt = new MutableInteger((int) ((Math.random() * 100) % 10));
                System.out.println("The producer inserts the item:"+mtInt.value);
                this.boundedBuf.insert(mtInt);


                Thread.sleep(1000);
            }
            catch (Exception e){

            }



        }
    }
}
