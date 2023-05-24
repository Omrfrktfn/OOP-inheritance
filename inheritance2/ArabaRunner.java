package inheritancee.inheritance2;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba a1 = new Araba();
        a1.start();
        a1.stop();
        a1.hybrid();

        MotorBisiklet m1 = new MotorBisiklet();
        a1.start();
        a1.stop();
        m1.elektrikli();

        a1.model="Honda";
        System.out.println(a1.model);

        a1.price=100;
        System.out.println(a1.price);

        m1.model="RBC";
        System.out.println(m1.model);
        m1.price=200;
        System.out.println(m1.price);

        System.out.println("********************");


        Arac a3 = new Arac();
      //  Araba a2 = new Araba();

     //   MotorBisiklet a4 = new MotorBisiklet();




    }
}
