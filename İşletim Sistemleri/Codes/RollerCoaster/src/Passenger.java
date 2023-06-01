public class Passenger implements Runnable{
    public  Park park;
    private int id = 0;
    public Passenger(int id,Park park) {

        this.id = id;
        this.park=park;
    }

    public void unboard(){
        System.out.println("yolcu "+id+" arçtan iniyor");
    }
    public void board(){

        System.out.println("yolcu "+id+" arabaya binmek istiyor");
        // park.bekleyensayısı++;
    }

    public  int inen=0;
    @Override
    public void run() {
        while (true) {
            try {
                board();



//10 adet  yolcu threadimiz var
                // ilk thread  boardQuee yi acquire etmeye calısıyor edemiyor cunku  semaforun başlangıc degeri 0 1 olursa kullanabilir semaforu 1 olmasını bekliyor
                //2. thread geliyor o da  bekliyor

                park.boardQuee.acquire();
                //Bekleme kuyrugndakiler arabaya alınır //0 dı -1 oldu degeri bu semaforun suan erieşmiyor waitnige girdi
                //System.out.println("boardquee acquired");
                park.mutex.acquire();
                park.boarders++;
                System.out.println("yolcu "+id+" arabaya bindi");
                if (park.boarders== 5) {//binenlerin sayısı 5 oldugunda
                    park.allAboard.release(); //başka binen olmaması icin
                    park.boarders=0;
                }
//mutexin icinde oldugu icin burası bitmeden mesela allAboardı kullanmak isteyen kullanamıyacak diye anladım yani  mutex relase edilince  isteyen kullanmaya baslıyacak
                park.mutex.release();
                park.unboardQuee.acquire();
                //  buraya  gecemiyor hemen bekliyor suan
                //System.out.println("unboardquee acquired");
                unboard();
                //System.out.println("passenger unboard calıstı");


                park.mutex2.acquire();
                park.unboarders++;


                if (park.unboarders == 5) {
                    park.allAshore.release();
                    System.out.println(" Tüm yolcular yani 5 kişi araçtan indi");
                    park.unboarders=0;

                }

                park.mutex2.release();

            } catch (Exception e) {

            }
        }
    }
}

//System.out.println(" passenger board calıstı");
