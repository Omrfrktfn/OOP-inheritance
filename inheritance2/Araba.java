package inheritancee.inheritance2;

public class Araba extends Arac{

    public String model = "araba yeni";

    public void hybrid (){
        System.out.println("Araclar hybrid");
    }

    public void start () {
        System.out.println("Araba calisti....");
    }

    public  Araba(){
        System.out.println(super.model);
        System.out.println("Constructir3");

    }

    public  Araba (String a){
        System.out.println("Constructir4");
    }


}
