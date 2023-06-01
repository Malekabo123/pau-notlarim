public class Main {
    public static void main(String[] args) {

        Database db = new Database();
        Thread[] readers = new Thread[5];
        Thread writer = new Thread(new Writer(db));

        for (int i = 0; i < 5; i++) {
            readers[i] = new Thread(new Reader(i,db));
        }

        for (int i = 0; i < 5; i++) {
            readers[i].start();
        }
        writer.start();

        //there is no join because main doesn't do anything so he shouldn't wait for anything from threads
        //in writer and reader there is while true loop, so it's gonna work forever

    }
}