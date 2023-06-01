public class car implements  Runnable {
    public  Park park;

    public  car(Park park){
        this.park=park;
    }
    public  void load(){
        System.out.println("Araba  hazır bininiz ");
    }
    public  void unload(){
        System.out.println("Gezi sona erdi araba durdu");

    }

//wait acruire --
    //relase signal ++

    @Override
    public void run() {
        while (true){

            try {
                load();
                // if(park.bekleyensayısı>=5) {

                park.boardQuee.release(park.C);// 10 tane bekleyen threadden 5 adedei icin izin veriliyor
                //}
                //  5 adetlik koltuk ayırıyoruz, 5 kişiyi bekleme kuyrugundan alıyıoruz
                park.allAboard.acquire();
                System.out.println("Araba Gezmeye başladı");
                Thread.sleep(1000);
                unload();
                park.unboardQuee.release(park.C);
                park.allAshore.acquire();


            }
            catch (Exception e){

            }

        }
    }
}
