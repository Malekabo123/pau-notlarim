public class Driver {

    public static void main(String[] args) throws InterruptedException {
        CrossingCanyon canyon = new CrossingCanyon();

        Thread[] toWestBaboon = new Thread[15];
        Thread[] toEastBaboon = new Thread[15];

        for (int i = 0; i < 15; i++) {
            toWestBaboon[i] = new Thread(new ToWestBaboon(i,canyon));
            toEastBaboon[i] = new Thread(new ToEastBaboon(i,canyon));
        }

        for (int i = 0; i < 15; i++) {
            toWestBaboon[i].start();
        }

        for (int i = 0; i < 15; i++) {
            toEastBaboon[i].start();
        }

    }
}
