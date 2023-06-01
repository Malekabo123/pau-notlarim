public class Driver {
    final static int THREADCOUNT = 8;

    public static void main(String[] args) throws InterruptedException {
        Thread [] threadArray= new Thread[THREADCOUNT];
        FindNum [] sey = new FindNum[THREADCOUNT];
        int[] arr = new int[8000];
        for (int i = 0; i <THREADCOUNT ; i++) {
            sey[i] = new FindNum();
            threadArray[i] = new Finder(sey[i],arr);
            threadArray[i].start();
        }
        for (int i = 0; i <THREADCOUNT ; i++) {
            threadArray[i].join();
        }
        for (int i = 0; i < THREADCOUNT; i++) {
            if(((Finder) threadArray) threadArray[i])
        }

        //System.out.println("index is: "+);
    }
}