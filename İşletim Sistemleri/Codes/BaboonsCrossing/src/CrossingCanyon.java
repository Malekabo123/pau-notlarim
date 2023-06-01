import java.util.concurrent.Semaphore;

public class CrossingCanyon{

    public static final int ROPECAPACITY = 5; // at value 0 the semaphore stops
    public Semaphore toWestMutex;
    public Semaphore toEastMutex;
    public Semaphore rope; //1 if empty, 0 if full

    public Semaphore toWestCount;
    public Semaphore toEastCount;
    public Semaphore blockingEntrance; //for starvation
    public int toWestCounter; //ensure that just 5 baboons can be at the rope at the same time
    public int toEastCounter;

    public CrossingCanyon(){
        this.toWestMutex = new Semaphore(1);
        this.toEastMutex = new Semaphore(1);
        this.rope = new Semaphore(1);
        this.toWestCounter = 0;
        this.toEastCounter = 0;
        this.toWestCount = new Semaphore(ROPECAPACITY);
        this.toEastCount = new Semaphore(ROPECAPACITY);
        this.blockingEntrance = new Semaphore(1);
    }
}