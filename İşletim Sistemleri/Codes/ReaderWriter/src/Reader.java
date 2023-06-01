    public class Reader implements Runnable{
    private int id; //which reader is reading
    private Database database;

    public Reader (int id,Database database){
        this.id = id;
        this.database = database;
    }
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep((long) ((int) 5*Math.random()*1000));
                database.acquireReadLock();
                System.out.println("Reader "+id+" has started reading");

                Thread.sleep((long) ((int) 5*Math.random()*1000));
                database.releaseReadLock();
                System.out.println("Reader "+id+" has finished reading");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}