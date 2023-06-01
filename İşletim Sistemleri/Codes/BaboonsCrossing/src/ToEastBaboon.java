public class ToEastBaboon implements Runnable{
    private int id;
    private CrossingCanyon crossingCanyon;

    public ToEastBaboon(int id,CrossingCanyon crossingCanyon){
        this.id = id;
        this.crossingCanyon = crossingCanyon;
    }

    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep((long) (Math.random()*500));
                { //going to east
                    crossingCanyon.blockingEntrance.acquire();
                    crossingCanyon.toEastMutex.acquire();
                    crossingCanyon.blockingEntrance.release();

                    crossingCanyon.toEastCounter++;

                    if (crossingCanyon.toEastCounter == 1) {
                        crossingCanyon.rope.acquire(); // the way is reserved as to east now
                    }
                    crossingCanyon.toEastMutex.release();


                    crossingCanyon.toEastCount.acquire();
                }

                System.out.println("I am baboon "+id+" going east.\n");
                Thread.sleep((long) (Math.random()*500));
                System.out.println("I am baboon "+id+" arrived east.\n");

                { //reached east
                    crossingCanyon.toEastCount.release();
                    crossingCanyon.toEastMutex.acquire();

                    crossingCanyon.toEastCounter--;

                    if (crossingCanyon.toEastCounter == 0) {
                        crossingCanyon.rope.release(); //the way is empty now
                    }

                    crossingCanyon.toEastMutex.release();
                }

            }catch (Exception e){

            }
        }
    }
}
