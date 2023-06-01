public class Driver {


    public static void main(String[] args) {

        MutableInteger sum = new MutableInteger();
        int upper = 10;
        Thread threadObj = new Summation(upper,sum);
        threadObj.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(sum.getValue());
        }

        try{
            threadObj.join();
        }
        catch (Exception e)
        {

            System.out.println(e.getMessage());

        }

        System.out.println("Finally "+sum.getValue());


    }


}