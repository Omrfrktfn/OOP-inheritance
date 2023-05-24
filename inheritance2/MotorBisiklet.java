package inheritancee.inheritance2;

public class MotorBisiklet extends Arac{

    public void elektrikli (){
        System.out.println("MotorBisiklet elektrikli.");
    }

    public String model = "motor yeni";

    public MotorBisiklet (){
       // System.out.println(super.model);
        System.out.println("Constructor5");
    }

    public MotorBisiklet (String s1){
        System.out.println("Constructor6");
    }

}
