public class Summation extends Thread
{
    private int upper;
    private MutableInteger sumValue;
    public Summation (int upper, MutableInteger sumValue)
    {
        this.upper = upper;
        this.sumValue = sumValue;
    }

    @Override
    public void run() {
        super.run();
        int sum=0;
        for (int i = 0; i <= upper ; i++) {
            sum += i;
            sumValue.setValue(sum);
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sumValue.setValue(sum);
            System.out.println(sumValue.getValue());
        }

    }
}