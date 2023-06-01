public class UnsynchroniyzedBuffer implements Buffer {

    private int value =-1;

    public void set(int value)
    {
        this.value = value;

    }

    public int get(){

        return  value;


    }

}
