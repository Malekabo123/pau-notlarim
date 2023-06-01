public class Driver {
    public static void main(String[] args){
        Park park=new Park();

        Thread[] ps=new Thread[10];
        Thread car=new Thread(new car(park));
        for (int i = 0; i < 10; i++) {
            ps[i]=new Thread(new Passenger(i,park));
        }
        try {
            //Thread.sleep(1000);
            car.start();
        }
        catch (Exception e){

        }
        for (int i = 0; i <10; i++) {
            ps[i].start();
        }



    }
}