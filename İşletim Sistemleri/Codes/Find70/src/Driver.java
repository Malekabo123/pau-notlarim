
public class Driver {

    public static void main(String[] args) throws InterruptedException {
        Number sayi = new Number(70,false);
        int[] numbers = new int[8000];

        for(int i = 0;i<numbers.length;i++) {

            numbers[i] =(int) (Math.random()*100);

        }
        //numbers[1256] = 70;

        Thread[] threadler = new Thread[8];
        int j = 0;


        for(int i = 0;i<threadler.length;i++) {

            threadler[i] = new findNumber(numbers, j,j +(numbers.length/threadler.length),sayi);
            j +=  (numbers.length/threadler.length);

        }

        for(Thread finder : threadler) {
            if(!sayi.isFound()) {
                finder.start();

            }
            for (Thread finder2 : threadler) {
                finder2.join();
            }

        }

        if(sayi.isFound()) {
            System.out.println(sayi.index);
        }
        else System.out.println("bulunamadi");


    }


}
