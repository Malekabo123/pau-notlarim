import java.util.concurrent.Semaphore;

public class Park {
    public  int C = 5;
    public  int bekleyensayısı=0;
    public Semaphore mutex ;//new Semaphore(1);
    public Semaphore mutex2 ;//new Semaphore(1);
    public int boarders ;
    public int unboarders ;
    public Semaphore boardQuee ; //new Semaphore(0);
    public Semaphore unboardQuee;
    //new Semaphore(0); //başlangıc degeri semaforun 0 yani hic bir thread başlangıcta kullanmasın kullanmak icin relase et degerini arttır 1 olursa kullanabilirsin

    public Semaphore allAboard ;
    public Semaphore allAshore ;// new Semaphore(0);
    public  Park(){
        this.mutex=new Semaphore(1);
        this.mutex2= new Semaphore(1);
        this.boarders=0;
        this.unboarders=0;
        this.boardQuee= new Semaphore(0);
        this.unboardQuee= new Semaphore(0);
        this.allAboard=new Semaphore(0);
        this.allAshore=new Semaphore(0);


    }


}

