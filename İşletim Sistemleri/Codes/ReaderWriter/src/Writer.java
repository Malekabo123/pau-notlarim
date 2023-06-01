public class Writer implements Runnable{
    private Database database;

    public Writer(Database database){
        this.database = database;
    }

    @Override
    public void run (){
        while (true){
            try {
                Thread.sleep((long) ((int) 5*Math.random()*1000));
                database.acquireWritLock();
                System.out.println("Writer has started writing");

                Thread.sleep((long) ((int) 5*Math.random()*1000));
                database.releaseWritLock();
                System.out.println("Writer has finished writing");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
