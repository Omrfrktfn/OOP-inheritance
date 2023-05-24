package inheritancee.inheritance1;

public class CarRunner {

    public static void main(String[] args) {
        Toyota t1 = new Toyota();
        t1.model="Prius";
        System.out.println(t1.model); //method kullanilabildigi gibi variablede kullanilabilir.

        Toyota t2 = new Toyota("ACCORD");

        Honda h1 = new Honda();

    }

}
