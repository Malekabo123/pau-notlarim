import java.util.concurrent.Semaphore;

public class Database {
    private Semaphore db;
    private Semaphore mutex;
    private int readerCount;

    public Database (){
        this.db = new Semaphore(1);
        this.mutex = new Semaphore(1);
        this.readerCount = 0;
    }

    public void acquireReadLock () throws InterruptedException {
        mutex.acquire();

        this.readerCount++;
        if (this.readerCount == 1){
            db.acquire();
        }

        mutex.release();
    }

    public void releaseReadLock() throws InterruptedException {
        mutex.acquire();

        this.readerCount--;
        if (this.readerCount == 0){
            db.release();
        }

        mutex.release();
    }

    public void acquireWritLock() throws InterruptedException {
        db.acquire();
    }

    public void releaseWritLock() throws InterruptedException {

        db.release();
    }


}
