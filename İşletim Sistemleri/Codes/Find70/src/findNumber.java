public class findNumber extends Thread {

    int[] numbers;
    int startPoint;
    int endPoint;

    Number bulunacakSayi;
    public findNumber(int[] numbers,int startPoint,int endPoint,Number bulunacakSayi) {
        this.numbers = numbers;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.bulunacakSayi = bulunacakSayi;

    }

    public void run() {

        for(int i = this.startPoint; i<this.endPoint;i++) {
            if(this.numbers[i] ==this.bulunacakSayi.value) {
                this.bulunacakSayi.index = i;
                this.bulunacakSayi.found = true;
            }
        }

    }


}
