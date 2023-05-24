package inheritancee.inheritance2;

public class Arac {

    public void start () {
        System.out.println("Arac calisti....");
    }

    public void stop () {
        System.out.println("Arac durdu....");
    }

    public String model = "araba";
    public int price = 0;

    public Arac (){
        System.out.println("Constructor 1");
    }

    public Arac (int b){
        System.out.println("Constructor 2");
    }

}
