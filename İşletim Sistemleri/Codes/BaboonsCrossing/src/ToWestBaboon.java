public class ToWestBaboon implements Runnable{
    private int id;
    private CrossingCanyon crossingCanyon;

    public ToWestBaboon(int id,CrossingCanyon crossingCanyon){
        this.id = id;
        this.crossingCanyon = crossingCanyon;
    }

    @Override
    public void run(){

        while (true){
            try {
                Thread.sleep((long) (Math.random()*500));

                { //going to west
                    crossingCanyon.blockingEntrance.acquire();
                    crossingCanyon.toWestMutex.acquire();
                    crossingCanyon.toWestCounter++;

                    if (crossingCanyon.toWestCounter == 1){ //the first baboon crossing to west
                        crossingCanyon.rope.acquire(); // the way is reserved as to west now
                    }
                    crossingCanyon.toWestMutex.release();
                    crossingCanyon.blockingEntrance.release();


                    crossingCanyon.toWestCount.acquire();
                }

                System.out.println("I am baboon "+id+" going west.\n");
                Thread.sleep((long) (Math.random()*500));
                System.out.println("I am baboon "+id+" arrived west.\n");

                { //reached west
                    crossingCanyon.toWestCount.release();
                    crossingCanyon.toWestMutex.acquire();

                    crossingCanyon.toWestCounter--;

                    if (crossingCanyon.toWestCounter == 0) {
                        crossingCanyon.rope.release(); //the way is empty now
                    }

                    crossingCanyon.toWestMutex.release();
                }

            }catch (Exception e){

            }
        }
    }
}
