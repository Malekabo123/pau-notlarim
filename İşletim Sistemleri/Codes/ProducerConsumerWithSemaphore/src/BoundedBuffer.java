import java.util.concurrent.Semaphore;

public class BoundedBuffer <E> {


    private  static final int BUFFERSIZE=5;

    private Semaphore mutex;
    private Semaphore full;
    private  Semaphore empty;

    private int in;
    private int out;
    private  E[] buffer;
    private int count;

    public BoundedBuffer (){

        this.mutex = new Semaphore(1);
        this.empty = new Semaphore(BUFFERSIZE);
        this.full = new Semaphore(0);
        this.in = 0;
        this.out= 0;
        this.count = 0;
        this.buffer = ((E[]) new Object[BUFFERSIZE]);




    }



    public  void insert(E item){
        try {
            empty.acquire();
            mutex.acquire();
            ++count;
            buffer[in]= item;
            in =(in+1)%BUFFERSIZE;
            System.out.println("The producer produce a new element into  buffer where count="+count);

            full.release();
            mutex.release();


        }

        catch(Exception e){



        }



    }


    public E remove(){

        Object obj =new Object();

        try {


            full.acquire();
            mutex.acquire();

            obj = this.buffer[out];
            out = (out+1)%BUFFERSIZE;
            --count;
            System.out.println("Consumer thread consumes an item with count"+count);
            empty.release();
            mutex.release();

        }
        catch (Exception e){

        }



        return ((E)obj);
    }






}
