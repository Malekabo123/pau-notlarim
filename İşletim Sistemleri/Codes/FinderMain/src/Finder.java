public class Finder extends Thread{
    private FindNum numobj;
    private int[] arr;
    public Finder(FindNum numobj, int[] arr){
        this.numobj = numobj;
        this.arr = arr;
    }

    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 8000; i++) {
            if(arr[i] == 70){
                numobj.setVarmi(true);
                numobj.setIndex(i);
            }
        }
    }

}
